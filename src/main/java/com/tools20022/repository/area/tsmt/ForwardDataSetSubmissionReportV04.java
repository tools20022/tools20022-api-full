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
import com.tools20022.repository.area.TradeServicesManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmReportIdentification
 * ForwardDataSetSubmissionReportV04.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRelatedTransactionReferences
 * ForwardDataSetSubmissionReportV04.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommonSubmissionReference
 * ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSubmitter
 * ForwardDataSetSubmissionReportV04.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmBuyerBank
 * ForwardDataSetSubmissionReportV04.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSellerBank
 * ForwardDataSetSubmissionReportV04.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommercialDataSet
 * ForwardDataSetSubmissionReportV04.mmCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmTransportDataSet
 * ForwardDataSetSubmissionReportV04.mmTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmInsuranceDataSet
 * ForwardDataSetSubmissionReportV04.mmInsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCertificateDataSet
 * ForwardDataSetSubmissionReportV04.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmOtherCertificateDataSet
 * ForwardDataSetSubmissionReportV04.mmOtherCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRequestForAction
 * ForwardDataSetSubmissionReportV04.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FwdDataSetSubmissnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementPreviousVersion
 * TradeServicesManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.017.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForwardDataSetSubmissionReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.\r\nThis message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.\r\nUsage\r\nThe ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05
 * ForwardDataSetSubmissionReportV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03
 * ForwardDataSetSubmissionReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForwardDataSetSubmissionReportV04", propOrder = {"reportIdentification", "relatedTransactionReferences", "commonSubmissionReference", "submitter", "buyerBank", "sellerBank", "commercialDataSet", "transportDataSet",
		"insuranceDataSet", "certificateDataSet", "otherCertificateDataSet", "requestForAction"})
public class ForwardDataSetSubmissionReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptId", required = true)
	protected MessageIdentification1 reportIdentification;
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmReportIdentification
	 * ForwardDataSetSubmissionReportV05.mmReportIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmReportIdentification
	 * ForwardDataSetSubmissionReportV03.mmReportIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report. ";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmReportIdentification);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmReportIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getReportIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdTxRefs", required = true)
	protected List<DataSetSubmissionReferences4> relatedTransactionReferences;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmRelatedTransactionReferences
	 * ForwardDataSetSubmissionReportV05.mmRelatedTransactionReferences}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmRelatedTransactionReferences
	 * ForwardDataSetSubmissionReportV03.mmRelatedTransactionReferences}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedTransactionReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdTxRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTransactionReferences";
			definition = "Identifies the transactions that this submission relates to and provides associated information.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmRelatedTransactionReferences);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmRelatedTransactionReferences;
			minOccurs = 1;
			complexType_lazy = () -> DataSetSubmissionReferences4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getRelatedTransactionReferences", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCommonSubmissionReference
	 * ForwardDataSetSubmissionReportV05.mmCommonSubmissionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCommonSubmissionReference
	 * ForwardDataSetSubmissionReportV03.mmCommonSubmissionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCommonSubmissionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CmonSubmissnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonSubmissionReference";
			definition = "This reference must be used for all data sets belonging to the same submission group.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmCommonSubmissionReference);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmCommonSubmissionReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getCommonSubmissionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Submitr", required = true)
	protected BICIdentification1 submitter;
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmSubmitter
	 * ForwardDataSetSubmissionReportV05.mmSubmitter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmSubmitter
	 * ForwardDataSetSubmissionReportV03.mmSubmitter}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitter = new MMMessageBuildingBlock() {
		{
			xmlTag = "Submitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "The financial institution that has submitted the data sets to the matching engine.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmSubmitter);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmSubmitter;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getSubmitter", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmBuyerBank
	 * ForwardDataSetSubmissionReportV05.mmBuyerBank}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmBuyerBank
	 * ForwardDataSetSubmissionReportV03.mmBuyerBank}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The financial institution of the buyer, uniquely identified by its BIC. ";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmBuyerBank);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmBuyerBank;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getBuyerBank", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmSellerBank
	 * ForwardDataSetSubmissionReportV05.mmSellerBank}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmSellerBank
	 * ForwardDataSetSubmissionReportV03.mmSellerBank}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The financial institution of the seller, uniquely identified by its BIC. ";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmSellerBank);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmSellerBank;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getSellerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ComrclDataSet")
	protected CommercialDataSet4 commercialDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet4
	 * CommercialDataSet4}</li>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCommercialDataSet
	 * ForwardDataSetSubmissionReportV05.mmCommercialDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCommercialDataSet
	 * ForwardDataSetSubmissionReportV03.mmCommercialDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCommercialDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "ComrclDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Commercial information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmCommercialDataSet);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmCommercialDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommercialDataSet4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getCommercialDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TrnsprtDataSet")
	protected TransportDataSet4 transportDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet4
	 * TransportDataSet4}</li>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmTransportDataSet
	 * ForwardDataSetSubmissionReportV05.mmTransportDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmTransportDataSet
	 * ForwardDataSetSubmissionReportV03.mmTransportDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransportDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrnsprtDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Transport information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmTransportDataSet);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmTransportDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransportDataSet4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getTransportDataSet", new Class[]{});
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
	 * "Insurance information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmInsuranceDataSet
	 * ForwardDataSetSubmissionReportV05.mmInsuranceDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmInsuranceDataSet
	 * ForwardDataSetSubmissionReportV03.mmInsuranceDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInsuranceDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "InsrncDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Insurance information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmInsuranceDataSet);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmInsuranceDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getInsuranceDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CertDataSet")
	protected List<CertificateDataSet2> certificateDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2
	 * CertificateDataSet2}</li>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCertificateDataSet
	 * ForwardDataSetSubmissionReportV05.mmCertificateDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmCertificateDataSet
	 * ForwardDataSetSubmissionReportV03.mmCertificateDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCertificateDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "CertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Certificate information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmCertificateDataSet);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmCertificateDataSet;
			minOccurs = 0;
			complexType_lazy = () -> CertificateDataSet2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getCertificateDataSet", new Class[]{});
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
	 * "Other certificate information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmOtherCertificateDataSet
	 * ForwardDataSetSubmissionReportV05.mmOtherCertificateDataSet}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmOtherCertificateDataSet
	 * ForwardDataSetSubmissionReportV03.mmOtherCertificateDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherCertificateDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrCertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Other certificate information that has been submitted to the matching application by the other party.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmOtherCertificateDataSet);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmOtherCertificateDataSet;
			minOccurs = 0;
			complexType_lazy = () -> OtherCertificateDataSet1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getOtherCertificateDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ReqForActn")
	protected PendingActivity2 requestForAction;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmRequestForAction
	 * ForwardDataSetSubmissionReportV05.mmRequestForAction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV03#mmRequestForAction
	 * ForwardDataSetSubmissionReportV03.mmRequestForAction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestForAction = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Next processing step required.";
			nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmRequestForAction);
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmRequestForAction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForwardDataSetSubmissionReportV04.class.getMethod("getRequestForAction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForwardDataSetSubmissionReportV04";
				definition = "Scope\r\nThe ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.\r\nThis message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.\r\nUsage\r\nThe ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained.";
				nextVersions_lazy = () -> Arrays.asList(ForwardDataSetSubmissionReportV05.mmObject());
				previousVersion_lazy = () -> ForwardDataSetSubmissionReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FwdDataSetSubmissnRpt";
				businessArea_lazy = () -> TradeServicesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmReportIdentification,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmRelatedTransactionReferences, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmSubmitter, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmBuyerBank,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmSellerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmCommercialDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmTransportDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmInsuranceDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmCertificateDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmOtherCertificateDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "017";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForwardDataSetSubmissionReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public ForwardDataSetSubmissionReportV04 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public List<DataSetSubmissionReferences4> getRelatedTransactionReferences() {
		return relatedTransactionReferences == null ? relatedTransactionReferences = new ArrayList<>() : relatedTransactionReferences;
	}

	public ForwardDataSetSubmissionReportV04 setRelatedTransactionReferences(List<DataSetSubmissionReferences4> relatedTransactionReferences) {
		this.relatedTransactionReferences = Objects.requireNonNull(relatedTransactionReferences);
		return this;
	}

	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return commonSubmissionReference;
	}

	public ForwardDataSetSubmissionReportV04 setCommonSubmissionReference(SimpleIdentificationInformation commonSubmissionReference) {
		this.commonSubmissionReference = Objects.requireNonNull(commonSubmissionReference);
		return this;
	}

	public BICIdentification1 getSubmitter() {
		return submitter;
	}

	public ForwardDataSetSubmissionReportV04 setSubmitter(BICIdentification1 submitter) {
		this.submitter = Objects.requireNonNull(submitter);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public ForwardDataSetSubmissionReportV04 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public ForwardDataSetSubmissionReportV04 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public Optional<CommercialDataSet4> getCommercialDataSet() {
		return commercialDataSet == null ? Optional.empty() : Optional.of(commercialDataSet);
	}

	public ForwardDataSetSubmissionReportV04 setCommercialDataSet(CommercialDataSet4 commercialDataSet) {
		this.commercialDataSet = commercialDataSet;
		return this;
	}

	public Optional<TransportDataSet4> getTransportDataSet() {
		return transportDataSet == null ? Optional.empty() : Optional.of(transportDataSet);
	}

	public ForwardDataSetSubmissionReportV04 setTransportDataSet(TransportDataSet4 transportDataSet) {
		this.transportDataSet = transportDataSet;
		return this;
	}

	public Optional<InsuranceDataSet1> getInsuranceDataSet() {
		return insuranceDataSet == null ? Optional.empty() : Optional.of(insuranceDataSet);
	}

	public ForwardDataSetSubmissionReportV04 setInsuranceDataSet(InsuranceDataSet1 insuranceDataSet) {
		this.insuranceDataSet = insuranceDataSet;
		return this;
	}

	public List<CertificateDataSet2> getCertificateDataSet() {
		return certificateDataSet == null ? certificateDataSet = new ArrayList<>() : certificateDataSet;
	}

	public ForwardDataSetSubmissionReportV04 setCertificateDataSet(List<CertificateDataSet2> certificateDataSet) {
		this.certificateDataSet = Objects.requireNonNull(certificateDataSet);
		return this;
	}

	public List<OtherCertificateDataSet1> getOtherCertificateDataSet() {
		return otherCertificateDataSet == null ? otherCertificateDataSet = new ArrayList<>() : otherCertificateDataSet;
	}

	public ForwardDataSetSubmissionReportV04 setOtherCertificateDataSet(List<OtherCertificateDataSet1> otherCertificateDataSet) {
		this.otherCertificateDataSet = Objects.requireNonNull(otherCertificateDataSet);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public ForwardDataSetSubmissionReportV04 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.04")
	static public class Document {
		@XmlElement(name = "FwdDataSetSubmissnRpt", required = true)
		public ForwardDataSetSubmissionReportV04 messageBody;
	}
}