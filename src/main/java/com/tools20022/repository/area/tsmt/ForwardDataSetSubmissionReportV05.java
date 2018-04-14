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
import com.tools20022.repository.area.TradeServicesManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion;
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.017.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmReportIdentification
 * ForwardDataSetSubmissionReportV05.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmRelatedTransactionReferences
 * ForwardDataSetSubmissionReportV05.mmRelatedTransactionReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCommonSubmissionReference
 * ForwardDataSetSubmissionReportV05.mmCommonSubmissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmSubmitter
 * ForwardDataSetSubmissionReportV05.mmSubmitter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmBuyerBank
 * ForwardDataSetSubmissionReportV05.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmSellerBank
 * ForwardDataSetSubmissionReportV05.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCommercialDataSet
 * ForwardDataSetSubmissionReportV05.mmCommercialDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmTransportDataSet
 * ForwardDataSetSubmissionReportV05.mmTransportDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmInsuranceDataSet
 * ForwardDataSetSubmissionReportV05.mmInsuranceDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmCertificateDataSet
 * ForwardDataSetSubmissionReportV05.mmCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmOtherCertificateDataSet
 * ForwardDataSetSubmissionReportV05.mmOtherCertificateDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05#mmRequestForAction
 * ForwardDataSetSubmissionReportV05.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
 * TradeServicesManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FwdDataSetSubmissnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForwardDataSetSubmissionReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.\r\nThis message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.\r\nUsage\r\nThe ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04
 * ForwardDataSetSubmissionReportV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForwardDataSetSubmissionReportV05", propOrder = {"reportIdentification", "relatedTransactionReferences", "commonSubmissionReference", "submitter", "buyerBank", "sellerBank", "commercialDataSet", "transportDataSet",
		"insuranceDataSet", "certificateDataSet", "otherCertificateDataSet", "requestForAction"})
public class ForwardDataSetSubmissionReportV05 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmReportIdentification
	 * ForwardDataSetSubmissionReportV04.mmReportIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, MessageIdentification1> mmReportIdentification = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, MessageIdentification1>() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmReportIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, MessageIdentification1 value) {
			obj.setReportIdentification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransactionReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the transactions that this submission relates to and provides associated information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRelatedTransactionReferences
	 * ForwardDataSetSubmissionReportV04.mmRelatedTransactionReferences}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, List<DataSetSubmissionReferences4>> mmRelatedTransactionReferences = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, List<DataSetSubmissionReferences4>>() {
		{
			xmlTag = "RltdTxRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTransactionReferences";
			definition = "Identifies the transactions that this submission relates to and provides associated information.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmRelatedTransactionReferences;
			minOccurs = 1;
			complexType_lazy = () -> DataSetSubmissionReferences4.mmObject();
		}

		@Override
		public List<DataSetSubmissionReferences4> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getRelatedTransactionReferences();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, List<DataSetSubmissionReferences4> value) {
			obj.setRelatedTransactionReferences(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonSubmissionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This reference must be used for all data sets belonging to the same submission group."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommonSubmissionReference
	 * ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, SimpleIdentificationInformation> mmCommonSubmissionReference = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, SimpleIdentificationInformation>() {
		{
			xmlTag = "CmonSubmissnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonSubmissionReference";
			definition = "This reference must be used for all data sets belonging to the same submission group.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmCommonSubmissionReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getCommonSubmissionReference();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, SimpleIdentificationInformation value) {
			obj.setCommonSubmissionReference(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Submitter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution that has submitted the data sets to the matching engine."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSubmitter
	 * ForwardDataSetSubmissionReportV04.mmSubmitter}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, BICIdentification1> mmSubmitter = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, BICIdentification1>() {
		{
			xmlTag = "Submitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Submitter";
			definition = "The financial institution that has submitted the data sets to the matching engine.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmSubmitter;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getSubmitter();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, BICIdentification1 value) {
			obj.setSubmitter(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the buyer, uniquely identified by its BIC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmBuyerBank
	 * ForwardDataSetSubmissionReportV04.mmBuyerBank}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, BICIdentification1> mmBuyerBank = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, BICIdentification1>() {
		{
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The financial institution of the buyer, uniquely identified by its BIC.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmBuyerBank;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getBuyerBank();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, BICIdentification1 value) {
			obj.setBuyerBank(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The financial institution of the seller, uniquely identified by its BIC."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmSellerBank
	 * ForwardDataSetSubmissionReportV04.mmSellerBank}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, BICIdentification1> mmSellerBank = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, BICIdentification1>() {
		{
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The financial institution of the seller, uniquely identified by its BIC.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmSellerBank;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		@Override
		public BICIdentification1 getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getSellerBank();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, BICIdentification1 value) {
			obj.setSellerBank(value);
		}
	};
	@XmlElement(name = "ComrclDataSet")
	protected CommercialDataSet5 commercialDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommercialDataSet5
	 * CommercialDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclDataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCommercialDataSet
	 * ForwardDataSetSubmissionReportV04.mmCommercialDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<CommercialDataSet5>> mmCommercialDataSet = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<CommercialDataSet5>>() {
		{
			xmlTag = "ComrclDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialDataSet";
			definition = "Commercial information that has been submitted to the matching application by the other party.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmCommercialDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommercialDataSet5.mmObject();
		}

		@Override
		public Optional<CommercialDataSet5> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getCommercialDataSet();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, Optional<CommercialDataSet5> value) {
			obj.setCommercialDataSet(value.orElse(null));
		}
	};
	@XmlElement(name = "TrnsprtDataSet")
	protected TransportDataSet5 transportDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransportDataSet5
	 * TransportDataSet5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtDataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transport information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmTransportDataSet
	 * ForwardDataSetSubmissionReportV04.mmTransportDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<TransportDataSet5>> mmTransportDataSet = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<TransportDataSet5>>() {
		{
			xmlTag = "TrnsprtDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDataSet";
			definition = "Transport information that has been submitted to the matching application by the other party.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmTransportDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransportDataSet5.mmObject();
		}

		@Override
		public Optional<TransportDataSet5> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getTransportDataSet();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, Optional<TransportDataSet5> value) {
			obj.setTransportDataSet(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Insurance information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmInsuranceDataSet
	 * ForwardDataSetSubmissionReportV04.mmInsuranceDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<InsuranceDataSet1>> mmInsuranceDataSet = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<InsuranceDataSet1>>() {
		{
			xmlTag = "InsrncDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceDataSet";
			definition = "Insurance information that has been submitted to the matching application by the other party.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmInsuranceDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceDataSet1.mmObject();
		}

		@Override
		public Optional<InsuranceDataSet1> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getInsuranceDataSet();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, Optional<InsuranceDataSet1> value) {
			obj.setInsuranceDataSet(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificate information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmCertificateDataSet
	 * ForwardDataSetSubmissionReportV04.mmCertificateDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, List<CertificateDataSet2>> mmCertificateDataSet = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, List<CertificateDataSet2>>() {
		{
			xmlTag = "CertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateDataSet";
			definition = "Certificate information that has been submitted to the matching application by the other party.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmCertificateDataSet;
			minOccurs = 0;
			complexType_lazy = () -> CertificateDataSet2.mmObject();
		}

		@Override
		public List<CertificateDataSet2> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getCertificateDataSet();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, List<CertificateDataSet2> value) {
			obj.setCertificateDataSet(value);
		}
	};
	@XmlElement(name = "OthrCertDataSet")
	protected List<OtherCertificateDataSet2> otherCertificateDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OtherCertificateDataSet2
	 * OtherCertificateDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCertDataSet"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCertificateDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other certificate information that has been submitted to the matching application by the other party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmOtherCertificateDataSet
	 * ForwardDataSetSubmissionReportV04.mmOtherCertificateDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, List<OtherCertificateDataSet2>> mmOtherCertificateDataSet = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, List<OtherCertificateDataSet2>>() {
		{
			xmlTag = "OthrCertDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCertificateDataSet";
			definition = "Other certificate information that has been submitted to the matching application by the other party.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmOtherCertificateDataSet;
			minOccurs = 0;
			complexType_lazy = () -> OtherCertificateDataSet2.mmObject();
		}

		@Override
		public List<OtherCertificateDataSet2> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getOtherCertificateDataSet();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, List<OtherCertificateDataSet2> value) {
			obj.setOtherCertificateDataSet(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestForAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Next processing step required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV04#mmRequestForAction
	 * ForwardDataSetSubmissionReportV04.mmRequestForAction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<PendingActivity2>> mmRequestForAction = new MMMessageBuildingBlock<ForwardDataSetSubmissionReportV05, Optional<PendingActivity2>>() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Next processing step required.";
			previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmRequestForAction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		@Override
		public Optional<PendingActivity2> getValue(ForwardDataSetSubmissionReportV05 obj) {
			return obj.getRequestForAction();
		}

		@Override
		public void setValue(ForwardDataSetSubmissionReportV05 obj, Optional<PendingActivity2> value) {
			obj.setRequestForAction(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForwardDataSetSubmissionReportV05";
				definition = "Scope\r\nThe ForwardDataSetSubmissionReport message is sent by the matching application to the counterparty(ies) of the submitter of data sets.\r\nThis message is used to pass on information related to the purchasing agreement(s) covered by the transaction(s) referred to in the message.\r\nUsage\r\nThe ForwardDataSetSubmission message can be sent by the matching application to forward the details of a DataSetSubmission message that it has obtained.";
				previousVersion_lazy = () -> ForwardDataSetSubmissionReportV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "FwdDataSetSubmissnRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmReportIdentification,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmRelatedTransactionReferences, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmCommonSubmissionReference,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmSubmitter, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmBuyerBank,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmSellerBank, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmCommercialDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmTransportDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmInsuranceDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmCertificateDataSet, com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmOtherCertificateDataSet,
						com.tools20022.repository.area.tsmt.ForwardDataSetSubmissionReportV05.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "017";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForwardDataSetSubmissionReportV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public ForwardDataSetSubmissionReportV05 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public List<DataSetSubmissionReferences4> getRelatedTransactionReferences() {
		return relatedTransactionReferences == null ? relatedTransactionReferences = new ArrayList<>() : relatedTransactionReferences;
	}

	public ForwardDataSetSubmissionReportV05 setRelatedTransactionReferences(List<DataSetSubmissionReferences4> relatedTransactionReferences) {
		this.relatedTransactionReferences = Objects.requireNonNull(relatedTransactionReferences);
		return this;
	}

	public SimpleIdentificationInformation getCommonSubmissionReference() {
		return commonSubmissionReference;
	}

	public ForwardDataSetSubmissionReportV05 setCommonSubmissionReference(SimpleIdentificationInformation commonSubmissionReference) {
		this.commonSubmissionReference = Objects.requireNonNull(commonSubmissionReference);
		return this;
	}

	public BICIdentification1 getSubmitter() {
		return submitter;
	}

	public ForwardDataSetSubmissionReportV05 setSubmitter(BICIdentification1 submitter) {
		this.submitter = Objects.requireNonNull(submitter);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public ForwardDataSetSubmissionReportV05 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public ForwardDataSetSubmissionReportV05 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public Optional<CommercialDataSet5> getCommercialDataSet() {
		return commercialDataSet == null ? Optional.empty() : Optional.of(commercialDataSet);
	}

	public ForwardDataSetSubmissionReportV05 setCommercialDataSet(CommercialDataSet5 commercialDataSet) {
		this.commercialDataSet = commercialDataSet;
		return this;
	}

	public Optional<TransportDataSet5> getTransportDataSet() {
		return transportDataSet == null ? Optional.empty() : Optional.of(transportDataSet);
	}

	public ForwardDataSetSubmissionReportV05 setTransportDataSet(TransportDataSet5 transportDataSet) {
		this.transportDataSet = transportDataSet;
		return this;
	}

	public Optional<InsuranceDataSet1> getInsuranceDataSet() {
		return insuranceDataSet == null ? Optional.empty() : Optional.of(insuranceDataSet);
	}

	public ForwardDataSetSubmissionReportV05 setInsuranceDataSet(InsuranceDataSet1 insuranceDataSet) {
		this.insuranceDataSet = insuranceDataSet;
		return this;
	}

	public List<CertificateDataSet2> getCertificateDataSet() {
		return certificateDataSet == null ? certificateDataSet = new ArrayList<>() : certificateDataSet;
	}

	public ForwardDataSetSubmissionReportV05 setCertificateDataSet(List<CertificateDataSet2> certificateDataSet) {
		this.certificateDataSet = Objects.requireNonNull(certificateDataSet);
		return this;
	}

	public List<OtherCertificateDataSet2> getOtherCertificateDataSet() {
		return otherCertificateDataSet == null ? otherCertificateDataSet = new ArrayList<>() : otherCertificateDataSet;
	}

	public ForwardDataSetSubmissionReportV05 setOtherCertificateDataSet(List<OtherCertificateDataSet2> otherCertificateDataSet) {
		this.otherCertificateDataSet = Objects.requireNonNull(otherCertificateDataSet);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public ForwardDataSetSubmissionReportV05 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05")
	static public class Document {
		@XmlElement(name = "FwdDataSetSubmissnRpt", required = true)
		public ForwardDataSetSubmissionReportV05 messageBody;
	}
}