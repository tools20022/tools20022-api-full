/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The DataSetSubmission message is sent by a party involved in the transaction
 * to the matching application.<br>
 * This message is used to trigger either a match or a pre-match of the
 * information submitted with the message.<br>
 * <b>Usage</b><br>
 * The DataSetSubmission message can be sent by either party with the
 * instruction pre-match. In the outlined scenario, the matching application
 * will compare the data set(s) conveyed by the DataSetSubmission message with
 * the established baseline and report the matching result to the requester of
 * the data set pre-match by sending a DataSetMatchReport message.<br>
 * or<br>
 * The DataSetSubmission message can be sent by the party specified in the
 * baseline as data set submitter with the instruction match. In the outlined
 * scenario, the matching application will compare the data set(s) conveyed by
 * the DataSetSubmission message with the established baseline and report the
 * matching result to<br>
 * - the parties involved in a transaction established in the push-through mode,
 * or<br>
 * - the initiator of a transaction established in the lodge mode.<br>
 * The DataSetSubmission message can be used to submit multiple data sets for
 * multiple transactions (baselines) at the same time. However, all transactions
 * (baselines) covered by the message must be for the same parties, that is
 * transaction initiator and counterparty, as well as for the same buyer and
 * seller.<br>
 * The DataSetSubmission message consists of data reflecting trade information
 * related to the purchasing agreement covered by the transaction(s), for
 * example shipment date, invoice amount.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmSubmissionIdentification
 * DataSetSubmissionV03.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmRelatedTransactionReferences
 * DataSetSubmissionV03.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmCommonSubmissionReference
 * DataSetSubmissionV03.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmInstruction
 * DataSetSubmissionV03.mmInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmBuyerBank
 * DataSetSubmissionV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmSellerBank
 * DataSetSubmissionV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmCommercialDataSet
 * DataSetSubmissionV03.mmCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmTransportDataSet
 * DataSetSubmissionV03.mmTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmInsuranceDataSet
 * DataSetSubmissionV03.mmInsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmCertificateDataSet
 * DataSetSubmissionV03.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV03#mmOtherCertificateDataSet
 * DataSetSubmissionV03.mmOtherCertificateDataSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DataSetSubmissn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementArchive
 * TradeServicesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.014.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetSubmissionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe DataSetSubmission message is sent by a party involved in the transaction to the matching application.\r\nThis message is used to trigger either a match or a pre-match of the information submitted with the message.\r\nUsage\r\nThe DataSetSubmission message can be sent by either party with the instruction pre-match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to the requester of the data set pre-match by sending a DataSetMatchReport message.\r\nor\r\nThe DataSetSubmission message can be sent by the party specified in the baseline as data set submitter with the instruction match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to\r\n- the parties involved in a transaction established in the push-through mode, or\r\n- the initiator of a transaction established in the lodge mode.\r\nThe DataSetSubmission message can be used to submit multiple data sets for multiple transactions (baselines) at the same time. However, all transactions (baselines) covered by the message must be for the same parties, that is transaction initiator and counterparty, as well as for the same buyer and seller.\r\nThe DataSetSubmission message consists of data reflecting trade information related to the purchasing agreement covered by the transaction(s), for example shipment date, invoice amount."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04
 * DataSetSubmissionV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DataSetSubmissionV03", propOrder = {"submissionIdentification", "relatedTransactionReferences", "commonSubmissionReference", "instruction", "buyerBank", "sellerBank", "commercialDataSet", "transportDataSet",
		"insuranceDataSet", "certificateDataSet", "otherCertificateDataSet"})
public class DataSetSubmissionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubmissnId", required = true)
	protected MessageIdentification1 submissionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmissnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the submitted information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmSubmissionIdentification
	 * DataSetSubmissionV04.mmSubmissionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmissionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmissnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionIdentification";
			definition = "Identifies the submitted information.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmSubmissionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getSubmissionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdTxRefs", required = true)
	protected List<DataSetSubmissionReferences3> relatedTransactionReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences3
	 * DataSetSubmissionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdTxRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the transactions that this submission relates to and provides associated information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmRelatedTransactionReferences
	 * DataSetSubmissionV04.mmRelatedTransactionReferences}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedTransactionReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdTxRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTransactionReferences";
			definition = "Identifies the transactions that this submission relates to and provides associated information.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmRelatedTransactionReferences);
			minOccurs = 1;
			complexType_lazy = () -> DataSetSubmissionReferences3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getRelatedTransactionReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CmonSubmissnRef", required = true)
	protected SimpleIdentificationInformation commonSubmissionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonSubmissnRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonSubmissionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This reference must be used for all data sets belonging to the same submission group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmCommonSubmissionReference
	 * DataSetSubmissionV04.mmCommonSubmissionReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCommonSubmissionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CmonSubmissnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonSubmissionReference";
			definition = "This reference must be used for all data sets belonging to the same submission group.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmCommonSubmissionReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getCommonSubmissionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Instr", required = true)
	protected InstructionType3 instruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionType3
	 * InstructionType3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the instruction given by the submitter. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmInstruction
	 * DataSetSubmissionV04.mmInstruction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstruction = new MMMessageBuildingBlock() {
		{
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Specifies the instruction given by the submitter. ";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmInstruction);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionType3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BuyrBk", required = true)
	protected BICIdentification1 buyerBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the buyer, uniquely identified by its BIC. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmBuyerBank
	 * DataSetSubmissionV04.mmBuyerBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The financial institution of the buyer, uniquely identified by its BIC. ";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmBuyerBank);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getBuyerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SellrBk", required = true)
	protected BICIdentification1 sellerBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the seller, uniquely identified by its BIC. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmSellerBank
	 * DataSetSubmissionV04.mmSellerBank}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The financial institution of the seller, uniquely identified by its BIC. ";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmSellerBank);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getSellerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ComrclDataSet")
	protected CommercialDataSet3 commercialDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet3
	 * CommercialDataSet3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial information that is submitted to the matching application for processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmCommercialDataSet
	 * DataSetSubmissionV04.mmCommercialDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCommercialDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "ComrclDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Commercial information that is submitted to the matching application for processing.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmCommercialDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommercialDataSet3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getCommercialDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TrnsprtDataSet")
	protected TransportDataSet3 transportDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet3
	 * TransportDataSet3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport information that is submitted to the matching application for processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmTransportDataSet
	 * DataSetSubmissionV04.mmTransportDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransportDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrnsprtDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Transport information that is submitted to the matching application for processing.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmTransportDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransportDataSet3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getTransportDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InsrncDataSet")
	protected InsuranceDataSet1 insuranceDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InsuranceDataSet1
	 * InsuranceDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insurance information that is submitted to the matching application for processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmInsuranceDataSet
	 * DataSetSubmissionV04.mmInsuranceDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInsuranceDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "InsrncDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Insurance information that is submitted to the matching application for processing.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmInsuranceDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getInsuranceDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CertDataSet")
	protected List<CertificateDataSet1> certificateDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1
	 * CertificateDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate information that is submitted to the matching application for processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmCertificateDataSet
	 * DataSetSubmissionV04.mmCertificateDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCertificateDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "CertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Certificate information that is submitted to the matching application for processing.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmCertificateDataSet);
			minOccurs = 0;
			complexType_lazy = () -> CertificateDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getCertificateDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrCertDataSet")
	protected List<OtherCertificateDataSet1> otherCertificateDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet1
	 * OtherCertificateDataSet1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCertDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other certificate information that is submitted to the matching application for processing."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.DataSetSubmissionV04#mmOtherCertificateDataSet
	 * DataSetSubmissionV04.mmOtherCertificateDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherCertificateDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrCertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Other certificate information that is submitted to the matching application for processing.";
			nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmOtherCertificateDataSet);
			minOccurs = 0;
			complexType_lazy = () -> OtherCertificateDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DataSetSubmissionV03.class.getMethod("getOtherCertificateDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetSubmissionV03";
				definition = "Scope\r\nThe DataSetSubmission message is sent by a party involved in the transaction to the matching application.\r\nThis message is used to trigger either a match or a pre-match of the information submitted with the message.\r\nUsage\r\nThe DataSetSubmission message can be sent by either party with the instruction pre-match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to the requester of the data set pre-match by sending a DataSetMatchReport message.\r\nor\r\nThe DataSetSubmission message can be sent by the party specified in the baseline as data set submitter with the instruction match. In the outlined scenario, the matching application will compare the data set(s) conveyed by the DataSetSubmission message with the established baseline and report the matching result to\r\n- the parties involved in a transaction established in the push-through mode, or\r\n- the initiator of a transaction established in the lodge mode.\r\nThe DataSetSubmission message can be used to submit multiple data sets for multiple transactions (baselines) at the same time. However, all transactions (baselines) covered by the message must be for the same parties, that is transaction initiator and counterparty, as well as for the same buyer and seller.\r\nThe DataSetSubmission message consists of data reflecting trade information related to the purchasing agreement covered by the transaction(s), for example shipment date, invoice amount.";
				nextVersions_lazy = () -> Arrays.asList(DataSetSubmissionV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "DataSetSubmissn";
				businessArea_lazy = () -> TradeServicesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmSubmissionIdentification, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmRelatedTransactionReferences,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmCommonSubmissionReference, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmInstruction,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmBuyerBank, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmSellerBank,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmCommercialDataSet, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmTransportDataSet,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmInsuranceDataSet, com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmCertificateDataSet,
						com.tools20022.repository.area.tsmt.DataSetSubmissionV03.mmOtherCertificateDataSet);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "014";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DataSetSubmissionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getSubmissionIdentification() {
		return submissionIdentification;
	}

	public DataSetSubmissionV03 setSubmissionIdentification(MessageIdentification1 submissionIdentification) {
		this.submissionIdentification = Objects.requireNonNull(submissionIdentification);
		return this;
	}

	public List<DataSetSubmissionReferences3> getRelatedTransactionReferences() {
		return relatedTransactionReferences == null ? relatedTransactionReferences = new ArrayList<>() : relatedTransactionReferences;
	}

	public DataSetSubmissionV03 setRelatedTransactionReferences(List<DataSetSubmissionReferences3> relatedTransactionReferences) {
		this.relatedTransactionReferences = Objects.requireNonNull(relatedTransactionReferences);
		return this;
	}

	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return commonSubmissionReference;
	}

	public DataSetSubmissionV03 setCommonSubmissionReference(SimpleIdentificationInformation commonSubmissionReference) {
		this.commonSubmissionReference = Objects.requireNonNull(commonSubmissionReference);
		return this;
	}

	public InstructionType3 getInstruction() {
		return instruction;
	}

	public DataSetSubmissionV03 setInstruction(InstructionType3 instruction) {
		this.instruction = Objects.requireNonNull(instruction);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public DataSetSubmissionV03 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public DataSetSubmissionV03 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public Optional<CommercialDataSet3> getCommercialDataSet() {
		return commercialDataSet == null ? Optional.empty() : Optional.of(commercialDataSet);
	}

	public DataSetSubmissionV03 setCommercialDataSet(CommercialDataSet3 commercialDataSet) {
		this.commercialDataSet = commercialDataSet;
		return this;
	}

	public Optional<TransportDataSet3> getTransportDataSet() {
		return transportDataSet == null ? Optional.empty() : Optional.of(transportDataSet);
	}

	public DataSetSubmissionV03 setTransportDataSet(TransportDataSet3 transportDataSet) {
		this.transportDataSet = transportDataSet;
		return this;
	}

	public Optional<InsuranceDataSet1> getInsuranceDataSet() {
		return insuranceDataSet == null ? Optional.empty() : Optional.of(insuranceDataSet);
	}

	public DataSetSubmissionV03 setInsuranceDataSet(InsuranceDataSet1 insuranceDataSet) {
		this.insuranceDataSet = insuranceDataSet;
		return this;
	}

	public List<CertificateDataSet1> getCertificateDataSet() {
		return certificateDataSet == null ? certificateDataSet = new ArrayList<>() : certificateDataSet;
	}

	public DataSetSubmissionV03 setCertificateDataSet(List<CertificateDataSet1> certificateDataSet) {
		this.certificateDataSet = Objects.requireNonNull(certificateDataSet);
		return this;
	}

	public List<OtherCertificateDataSet1> getOtherCertificateDataSet() {
		return otherCertificateDataSet == null ? otherCertificateDataSet = new ArrayList<>() : otherCertificateDataSet;
	}

	public DataSetSubmissionV03 setOtherCertificateDataSet(List<OtherCertificateDataSet1> otherCertificateDataSet) {
		this.otherCertificateDataSet = Objects.requireNonNull(otherCertificateDataSet);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.03")
	static public class Document {
		@XmlElement(name = "DataSetSubmissn", required = true)
		public DataSetSubmissionV03 messageBody;
	}
}