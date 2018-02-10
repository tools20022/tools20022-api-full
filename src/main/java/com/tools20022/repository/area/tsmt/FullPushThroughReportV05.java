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
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FullPushThroughReport message is sent by the matching application to a
 * party involved in a transaction.<br>
 * This message is used to pass on information that the matching application has
 * received from the submitter. The forwarded information can originate from an
 * InitialBaselineSubmission or BaselineReSubmission or BaselineAmendmentRequest
 * message.<br>
 * <b>Usage</b><br>
 * The FullPushThroughReport message can be sent by the matching application to
 * a party to convey<br>
 * - the details of an InitialBaselineSubmission message that it has obtained,or<br>
 * - the details of a BaselineResubmission message that it has obtained,or<br>
 * - the details of a BaselineAmendmentRequest message that it has obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmReportIdentification
 * FullPushThroughReportV05.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmTransactionIdentification
 * FullPushThroughReportV05.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmEstablishedBaselineIdentification
 * FullPushThroughReportV05.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmTransactionStatus
 * FullPushThroughReportV05.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmUserTransactionReference
 * FullPushThroughReportV05.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmReportPurpose
 * FullPushThroughReportV05.mmReportPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmPushedThroughBaseline
 * FullPushThroughReportV05.mmPushedThroughBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmBuyerContactPerson
 * FullPushThroughReportV05.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmSellerContactPerson
 * FullPushThroughReportV05.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmBuyerBankContactPerson
 * FullPushThroughReportV05.mmBuyerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmSellerBankContactPerson
 * FullPushThroughReportV05.mmSellerBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmOtherBankContactPerson
 * FullPushThroughReportV05.mmOtherBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV05#mmRequestForAction
 * FullPushThroughReportV05.mmRequestForAction}</li>
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
 * xmlTag} = "FullPushThrghRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.018.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FullPushThroughReportV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FullPushThroughReport message is sent by the matching application to a party involved in a transaction.\r\nThis message is used to pass on information that the matching application has received from the submitter. The forwarded information can originate from an InitialBaselineSubmission or BaselineReSubmission or BaselineAmendmentRequest message.\r\nUsage\r\nThe FullPushThroughReport message can be sent by the matching application to a party to convey\r\n- the details of an InitialBaselineSubmission message that it has obtained,or\r\n- the details of a BaselineResubmission message that it has obtained,or\r\n- the details of a BaselineAmendmentRequest message that it has obtained."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04
 * FullPushThroughReportV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FullPushThroughReportV05", propOrder = {"reportIdentification", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference", "reportPurpose", "pushedThroughBaseline",
		"buyerContactPerson", "sellerContactPerson", "buyerBankContactPerson", "sellerBankContactPerson", "otherBankContactPerson", "requestForAction"})
public class FullPushThroughReportV05 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmReportIdentification
	 * FullPushThroughReportV04.mmReportIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report. ";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmReportIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getReportIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxId", required = true)
	protected SimpleIdentificationInformation transactionIdentification;
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
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmTransactionIdentification
	 * FullPushThroughReportV04.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "EstblishdBaselnId")
	protected DocumentIdentification3 establishedBaselineIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification3
	 * DocumentIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstblishdBaselnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstablishedBaselineIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned by the matching application to the baseline when it is established."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmEstablishedBaselineIdentification
	 * FullPushThroughReportV04.mmEstablishedBaselineIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEstablishedBaselineIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "EstblishdBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmEstablishedBaselineIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getEstablishedBaselineIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxSts", required = true)
	protected TransactionStatus4 transactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionStatus4
	 * TransactionStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the transaction by means of a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmTransactionStatus
	 * FullPushThroughReportV04.mmTransactionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmTransactionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "UsrTxRef")
	protected List<DocumentIdentification5> userTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification5
	 * DocumentIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UsrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the financial institution which submitted the baseline."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmUserTransactionReference
	 * FullPushThroughReportV04.mmUserTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUserTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for the financial institution which submitted the baseline.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmUserTransactionReference;
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getUserTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptPurp", required = true)
	protected ReportType1 reportPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReportType1
	 * ReportType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmReportPurpose
	 * FullPushThroughReportV04.mmReportPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportPurpose = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportPurpose";
			definition = "Specifies the type of report.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmReportPurpose;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportType1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getReportPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PushdThrghBaseln", required = true)
	protected Baseline5 pushedThroughBaseline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Baseline5
	 * Baseline5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PushdThrghBaseln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PushedThroughBaseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the commercial details of the underlying transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmPushedThroughBaseline
	 * FullPushThroughReportV04.mmPushedThroughBaseline}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPushedThroughBaseline = new MMMessageBuildingBlock() {
		{
			xmlTag = "PushdThrghBaseln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PushedThroughBaseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmPushedThroughBaseline;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Baseline5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getPushedThroughBaseline", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BuyrCtctPrsn")
	protected List<ContactIdentification1> buyerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the buyer. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmBuyerContactPerson
	 * FullPushThroughReportV04.mmBuyerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer. ";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmBuyerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getBuyerContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SellrCtctPrsn")
	protected List<ContactIdentification1> sellerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in the organisation of the seller. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmSellerContactPerson
	 * FullPushThroughReportV04.mmSellerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller. ";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmSellerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getSellerContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BuyrBkCtctPrsn")
	protected List<ContactIdentification1> buyerBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the buyer's bank. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmBuyerBankContactPerson
	 * FullPushThroughReportV04.mmBuyerBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBankContactPerson";
			definition = "Person to be contacted in the buyer's bank. ";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmBuyerBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getBuyerBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SellrBkCtctPrsn")
	protected List<ContactIdentification1> sellerBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the seller's bank. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmSellerBankContactPerson
	 * FullPushThroughReportV04.mmSellerBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBankContactPerson";
			definition = "Person to be contacted in the seller's bank. ";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmSellerBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getSellerBankContactPerson", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrBkCtctPrsn")
	protected List<ContactIdentification3> otherBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in another bank than the seller or buyer's bank."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmOtherBankContactPerson
	 * FullPushThroughReportV04.mmOtherBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherBankContactPerson = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than the seller or buyer's bank.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmOtherBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getOtherBankContactPerson", new Class[]{});
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
	 * definition} = "Information on the next processing step required."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.FullPushThroughReportV04#mmRequestForAction
	 * FullPushThroughReportV04.mmRequestForAction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestForAction = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Information on the next processing step required.";
			previousVersion_lazy = () -> FullPushThroughReportV04.mmRequestForAction;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FullPushThroughReportV05.class.getMethod("getRequestForAction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FullPushThroughReportV05";
				definition = "Scope\r\nThe FullPushThroughReport message is sent by the matching application to a party involved in a transaction.\r\nThis message is used to pass on information that the matching application has received from the submitter. The forwarded information can originate from an InitialBaselineSubmission or BaselineReSubmission or BaselineAmendmentRequest message.\r\nUsage\r\nThe FullPushThroughReport message can be sent by the matching application to a party to convey\r\n- the details of an InitialBaselineSubmission message that it has obtained,or\r\n- the details of a BaselineResubmission message that it has obtained,or\r\n- the details of a BaselineAmendmentRequest message that it has obtained.";
				previousVersion_lazy = () -> FullPushThroughReportV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "FullPushThrghRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmReportIdentification, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmEstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmTransactionStatus,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmUserTransactionReference, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmReportPurpose,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmPushedThroughBaseline, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmSellerContactPerson, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmBuyerBankContactPerson,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmSellerBankContactPerson, com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmOtherBankContactPerson,
						com.tools20022.repository.area.tsmt.FullPushThroughReportV05.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "018";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FullPushThroughReportV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public FullPushThroughReportV05 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public FullPushThroughReportV05 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<DocumentIdentification3> getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification == null ? Optional.empty() : Optional.of(establishedBaselineIdentification);
	}

	public FullPushThroughReportV05 setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = establishedBaselineIdentification;
		return this;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public FullPushThroughReportV05 setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public FullPushThroughReportV05 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public ReportType1 getReportPurpose() {
		return reportPurpose;
	}

	public FullPushThroughReportV05 setReportPurpose(ReportType1 reportPurpose) {
		this.reportPurpose = Objects.requireNonNull(reportPurpose);
		return this;
	}

	public Baseline5 getPushedThroughBaseline() {
		return pushedThroughBaseline;
	}

	public FullPushThroughReportV05 setPushedThroughBaseline(Baseline5 pushedThroughBaseline) {
		this.pushedThroughBaseline = Objects.requireNonNull(pushedThroughBaseline);
		return this;
	}

	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson == null ? buyerContactPerson = new ArrayList<>() : buyerContactPerson;
	}

	public FullPushThroughReportV05 setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = Objects.requireNonNull(buyerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson == null ? sellerContactPerson = new ArrayList<>() : sellerContactPerson;
	}

	public FullPushThroughReportV05 setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = Objects.requireNonNull(sellerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getBuyerBankContactPerson() {
		return buyerBankContactPerson == null ? buyerBankContactPerson = new ArrayList<>() : buyerBankContactPerson;
	}

	public FullPushThroughReportV05 setBuyerBankContactPerson(List<ContactIdentification1> buyerBankContactPerson) {
		this.buyerBankContactPerson = Objects.requireNonNull(buyerBankContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerBankContactPerson() {
		return sellerBankContactPerson == null ? sellerBankContactPerson = new ArrayList<>() : sellerBankContactPerson;
	}

	public FullPushThroughReportV05 setSellerBankContactPerson(List<ContactIdentification1> sellerBankContactPerson) {
		this.sellerBankContactPerson = Objects.requireNonNull(sellerBankContactPerson);
		return this;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson == null ? otherBankContactPerson = new ArrayList<>() : otherBankContactPerson;
	}

	public FullPushThroughReportV05 setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = Objects.requireNonNull(otherBankContactPerson);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public FullPushThroughReportV05 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05")
	static public class Document {
		@XmlElement(name = "FullPushThrghRpt", required = true)
		public FullPushThroughReportV05 messageBody;
	}
}