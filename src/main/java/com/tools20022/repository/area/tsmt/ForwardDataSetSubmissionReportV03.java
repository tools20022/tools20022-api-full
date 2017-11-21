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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForwardDataSetSubmissionReport message is sent by the matching
 * application to the counterparty(ies) of the submitter of data sets.<br>
 * This message is used to pass on information related to the purchasing
 * agreement(s) covered by the transaction(s) referred to in the message.<br>
 * <b>Usage</b><br>
 * The ForwardDataSetSubmission message can be sent by the matching application
 * to forward the details of a DataSetSubmission message that it has obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementArchive
 * TradeServicesManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FwdDataSetSubmissnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmReportIdentification
 * ForwardDataSetSubmissionReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmRelatedTransactionReferences
 * ForwardDataSetSubmissionReportV03.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCommonSubmissionReference
 * ForwardDataSetSubmissionReportV03.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmSubmitter
 * ForwardDataSetSubmissionReportV03.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmBuyerBank
 * ForwardDataSetSubmissionReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmSellerBank
 * ForwardDataSetSubmissionReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCommercialDataSet
 * ForwardDataSetSubmissionReportV03.mmCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmTransportDataSet
 * ForwardDataSetSubmissionReportV03.mmTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmInsuranceDataSet
 * ForwardDataSetSubmissionReportV03.mmInsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCertificateDataSet
 * ForwardDataSetSubmissionReportV03.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmOtherCertificateDataSet
 * ForwardDataSetSubmissionReportV03.mmOtherCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmRequestForAction
 * ForwardDataSetSubmissionReportV03.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.017.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForwardDataSetSubmissionReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.\r\nThis message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.\r\nUsage\r\nThe ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04
 * ForwardDataSetSubmissionReportV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ForwardDataSetSubmissionReportV03", propOrder = {"reportIdentification", "relatedTransactionReferences", "commonSubmissionReference", "submitter", "buyerBank", "sellerBank", "commercialDataSet", "transportDataSet",
		"insuranceDataSet", "certificateDataSet", "otherCertificateDataSet", "requestForAction"})
public class ForwardDataSetSubmissionReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 reportIdentification;
	/**
	 * Identifies the report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the report. "</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmReportIdentification
	 * ForwardDataSetSubmissionReportV04.mmReportIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report. ";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmReportIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getReportIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DataSetSubmissionReferences4> relatedTransactionReferences;
	/**
	 * Identifies the transactions that this submission relates to and provides
	 * associated information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DataSetSubmissionReferences4
	 * DataSetSubmissionReferences4}</li>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRelatedTransactionReferences
	 * ForwardDataSetSubmissionReportV04.mmRelatedTransactionReferences}</li>
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
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmRelatedTransactionReferences);
			minOccurs = 1;
			complexType_lazy = () -> DataSetSubmissionReferences4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getRelatedTransactionReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation commonSubmissionReference;
	/**
	 * This reference must be used for all data sets belonging to the same
	 * submission group.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommonSubmissionReference
	 * ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference}</li>
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
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getCommonSubmissionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BICIdentification1 submitter;
	/**
	 * The financial institution that has submitted the data sets to the
	 * matching engine.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BICIdentification1
	 * BICIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Submitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution that has submitted the data sets to the matching engine."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSubmitter
	 * ForwardDataSetSubmissionReportV04.mmSubmitter}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitter = new MMMessageBuildingBlock() {
		{
			xmlTag = "Submitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "The financial institution that has submitted the data sets to the matching engine.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmSubmitter);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getSubmitter", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BICIdentification1 buyerBank;
	/**
	 * The financial institution of the buyer, uniquely identified by its BIC.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmBuyerBank
	 * ForwardDataSetSubmissionReportV04.mmBuyerBank}</li>
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
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmBuyerBank);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getBuyerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BICIdentification1 sellerBank;
	/**
	 * The financial institution of the seller, uniquely identified by its BIC.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSellerBank
	 * ForwardDataSetSubmissionReportV04.mmSellerBank}</li>
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
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmSellerBank);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getSellerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CommercialDataSet3 commercialDataSet;
	/**
	 * Commercial information that has been submitted to the matching
	 * application by the other party.
	 * <p>
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
	 * "Commercial information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommercialDataSet
	 * ForwardDataSetSubmissionReportV04.mmCommercialDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCommercialDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "ComrclDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Commercial information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmCommercialDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommercialDataSet3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getCommercialDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransportDataSet3 transportDataSet;
	/**
	 * Transport information that has been submitted to the matching application
	 * by the other party.
	 * <p>
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
	 * "Transport information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmTransportDataSet
	 * ForwardDataSetSubmissionReportV04.mmTransportDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransportDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrnsprtDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Transport information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmTransportDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransportDataSet3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getTransportDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InsuranceDataSet1 insuranceDataSet;
	/**
	 * Insurance information that has been submitted to the matching application
	 * by the other party.
	 * <p>
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
	 * "Insurance information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmInsuranceDataSet
	 * ForwardDataSetSubmissionReportV04.mmInsuranceDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInsuranceDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "InsrncDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Insurance information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmInsuranceDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getInsuranceDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CertificateDataSet1> certificateDataSet;
	/**
	 * Certificate information that has been submitted to the matching
	 * application by the other party.
	 * <p>
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
	 * "Certificate information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCertificateDataSet
	 * ForwardDataSetSubmissionReportV04.mmCertificateDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCertificateDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "CertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Certificate information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmCertificateDataSet);
			minOccurs = 0;
			complexType_lazy = () -> CertificateDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getCertificateDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<OtherCertificateDataSet1> otherCertificateDataSet;
	/**
	 * Other certificate information that has been submitted to the matching
	 * application by the other party.
	 * <p>
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
	 * "Other certificate information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmOtherCertificateDataSet
	 * ForwardDataSetSubmissionReportV04.mmOtherCertificateDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherCertificateDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrCertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Other certificate information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmOtherCertificateDataSet);
			minOccurs = 0;
			complexType_lazy = () -> OtherCertificateDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getOtherCertificateDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingActivity2 requestForAction;
	/**
	 * Next processing step required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PendingActivity2
	 * PendingActivity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqForActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Next processing step required."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRequestForAction
	 * ForwardDataSetSubmissionReportV04.mmRequestForAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestForAction = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Next processing step required.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmRequestForAction);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV03.class.getMethod("getRequestForAction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForwardDataSetSubmissionReportV03";
				definition = "Scope\r\nThe ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.\r\nThis message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.\r\nUsage\r\nThe ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained.";
				nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FwdDataSetSubmissnRpt";
				businessArea_lazy = () -> TradeServicesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmReportIdentification,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmRelatedTransactionReferences, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmCommonSubmissionReference,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmSubmitter, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmBuyerBank,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmSellerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmCommercialDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmTransportDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmInsuranceDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmCertificateDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmOtherCertificateDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "017";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForwardDataSetSubmissionReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptId", required = true)
	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public void setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = reportIdentification;
	}

	@XmlElement(name = "RltdTxRefs", required = true)
	public List<DataSetSubmissionReferences4> getRelatedTransactionReferences() {
		return relatedTransactionReferences;
	}

	public void setRelatedTransactionReferences(List<DataSetSubmissionReferences4> relatedTransactionReferences) {
		this.relatedTransactionReferences = relatedTransactionReferences;
	}

	@XmlElement(name = "CmonSubmissnRef", required = true)
	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return commonSubmissionReference;
	}

	public void setCommonSubmissionReference(SimpleIdentificationInformation commonSubmissionReference) {
		this.commonSubmissionReference = commonSubmissionReference;
	}

	@XmlElement(name = "Submitr", required = true)
	public BICIdentification1 getSubmitter() {
		return submitter;
	}

	public void setSubmitter(BICIdentification1 submitter) {
		this.submitter = submitter;
	}

	@XmlElement(name = "BuyrBk", required = true)
	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public void setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = buyerBank;
	}

	@XmlElement(name = "SellrBk", required = true)
	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public void setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = sellerBank;
	}

	@XmlElement(name = "ComrclDataSet")
	public CommercialDataSet3 getCommercialDataSet() {
		return commercialDataSet;
	}

	public void setCommercialDataSet(CommercialDataSet3 commercialDataSet) {
		this.commercialDataSet = commercialDataSet;
	}

	@XmlElement(name = "TrnsprtDataSet")
	public TransportDataSet3 getTransportDataSet() {
		return transportDataSet;
	}

	public void setTransportDataSet(TransportDataSet3 transportDataSet) {
		this.transportDataSet = transportDataSet;
	}

	@XmlElement(name = "InsrncDataSet")
	public InsuranceDataSet1 getInsuranceDataSet() {
		return insuranceDataSet;
	}

	public void setInsuranceDataSet(InsuranceDataSet1 insuranceDataSet) {
		this.insuranceDataSet = insuranceDataSet;
	}

	@XmlElement(name = "CertDataSet")
	public List<CertificateDataSet1> getCertificateDataSet() {
		return certificateDataSet;
	}

	public void setCertificateDataSet(List<CertificateDataSet1> certificateDataSet) {
		this.certificateDataSet = certificateDataSet;
	}

	@XmlElement(name = "OthrCertDataSet")
	public List<OtherCertificateDataSet1> getOtherCertificateDataSet() {
		return otherCertificateDataSet;
	}

	public void setOtherCertificateDataSet(List<OtherCertificateDataSet1> otherCertificateDataSet) {
		this.otherCertificateDataSet = otherCertificateDataSet;
	}

	@XmlElement(name = "ReqForActn")
	public PendingActivity2 getRequestForAction() {
		return requestForAction;
	}

	public void setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.017.03.03")
	static public class Document {
		@XmlElement(name = "FwdDataSetSubmissnRpt", required = true)
		public ForwardDataSetSubmissionReportV03 messageBody;
	}
}