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
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BaselineMatchReport message is sent by the matching application to the
 * parties involved in the establishment of a transaction.<br>
 * The message is used to inform about either the successful establishment of a
 * transaction (baseline) or the mis-matches found between two baseline
 * initiation messages.<br>
 * <b>Usage</b><br>
 * The BaselineMatchReport message can be sent by the matching application to<br>
 * - the parties involved in the establishment of a transaction in the
 * push-through mode, that is the senders of InitialBaselineSubmission and
 * BaselineReSubmission messages including the instruction push-through. In the
 * outlined scenario the message is used to inform either about the successful
 * establishment of a transaction in the matching application or about
 * mis-matches found between two baseline initiation messages,or<br>
 * - the party establishing a transaction in the lodge mode, that is the sender
 * of an InitialBaselineSubmission message including the instruction lodge. In
 * the outlined scenario the message is used to inform about the successful
 * establishment of a transaction in the matching application.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOLatestversion
 * TradeServicesManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BaselnMtchRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmReportIdentification
 * BaselineMatchReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmTransactionIdentification
 * BaselineMatchReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmEstablishedBaselineIdentification
 * BaselineMatchReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmTransactionStatus
 * BaselineMatchReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmUserTransactionReference
 * BaselineMatchReportV03.mmUserTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmBuyer
 * BaselineMatchReportV03.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmSeller
 * BaselineMatchReportV03.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmBuyerBank
 * BaselineMatchReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmSellerBank
 * BaselineMatchReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmBaselineEstablishmentTrials
 * BaselineMatchReportV03.mmBaselineEstablishmentTrials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmComparedDocumentReference
 * BaselineMatchReportV03.mmComparedDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmReport
 * BaselineMatchReportV03.mmReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.BaselineMatchReportV03#mmRequestForAction
 * BaselineMatchReportV03.mmRequestForAction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.010.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineMatchReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BaselineMatchReport message is sent by the matching application to the parties involved in the establishment of a transaction.\r\nThe message is used to inform about either the successful establishment of a transaction (baseline) or the mis-matches found between two baseline initiation messages.\r\nUsage\r\nThe BaselineMatchReport message can be sent by the matching application to\r\n- the parties involved in the establishment of a transaction in the push-through mode, that is the senders of InitialBaselineSubmission and BaselineReSubmission messages including the instruction push-through. In the outlined scenario the message is used to inform either about the successful establishment of a transaction in the matching application or about mis-matches found between two baseline initiation messages,or\r\n- the party establishing a transaction in the lodge mode, that is the sender of an InitialBaselineSubmission message including the instruction lodge. In the outlined scenario the message is used to inform about the successful establishment of a transaction in the matching application."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BaselineMatchReportV03", propOrder = {"reportIdentification", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "userTransactionReference", "buyer", "seller", "buyerBank", "sellerBank",
		"baselineEstablishmentTrials", "comparedDocumentReference", "report", "requestForAction"})
public class BaselineMatchReportV03 {

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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the report. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getReportIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SimpleIdentificationInformation transactionIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * transaction. This identification is to be used in any communication
	 * between the parties.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification assigned by the matching application to the transaction.\nThis identification is to be used in any communication between the parties.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification3 establishedBaselineIdentification;
	/**
	 * Unique identification assigned by the matching application to the
	 * baseline when it is established.
	 * <p>
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
	 * "Unique identification assigned by the matching application to the baseline when it is established. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEstablishedBaselineIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "EstblishdBaselnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstablishedBaselineIdentification";
			definition = "Unique identification assigned by the matching application to the baseline when it is established. ";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getEstablishedBaselineIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TransactionStatus4 transactionStatus;
	/**
	 * Identifies the status of the transaction by means of a code.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Identifies the status of the transaction by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionStatus4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DocumentIdentification5> userTransactionReference;
	/**
	 * Reference to the transaction for each financial institution which is a
	 * party to the transaction.
	 * <p>
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
	 * "Reference to the transaction for each financial institution which is a party to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUserTransactionReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "UsrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UserTransactionReference";
			definition = "Reference to the transaction for each financial institution which is a party to the transaction.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getUserTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification26 buyer;
	/**
	 * Party that buys goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that buys goods or services, or a financial instrument. "</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyer = new MMMessageBuildingBlock() {
		{
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Party that buys goods or services, or a financial instrument. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getBuyer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification26 seller;
	/**
	 * Party that sells goods or services, or a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification26
	 * PartyIdentification26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sellr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seller"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument. "</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSeller = new MMMessageBuildingBlock() {
		{
			xmlTag = "Sellr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seller";
			definition = "Party that sells goods or services, or a financial instrument. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification26.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getSeller", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerBank";
			definition = "The financial institution of the buyer, uniquely identified by its BIC. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getBuyerBank", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSellerBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "SellrBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerBank";
			definition = "The financial institution of the seller, uniquely identified by its BIC. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BICIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getSellerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Limit1 baselineEstablishmentTrials;
	/**
	 * Specifies the number of matching trials for a baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Limit1 Limit1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BaselnEstblishmtTrils"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaselineEstablishmentTrials"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the number of matching trials for a baseline."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBaselineEstablishmentTrials = new MMMessageBuildingBlock() {
		{
			xmlTag = "BaselnEstblishmtTrils";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BaselineEstablishmentTrials";
			definition = "Specifies the number of matching trials for a baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Limit1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getBaselineEstablishmentTrials", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DocumentIdentification4> comparedDocumentReference;
	/**
	 * Identifies the two baselines compared in this report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification4
	 * DocumentIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpardDocRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComparedDocumentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the two baselines compared in this report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmComparedDocumentReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CmpardDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComparedDocumentReference";
			definition = "Identifies the two baselines compared in this report.";
			maxOccurs = 2;
			minOccurs = 2;
			complexType_lazy = () -> DocumentIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getComparedDocumentReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MisMatchReport3 report;
	/**
	 * Description of the differences between the two proposed baselines
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MisMatchReport3
	 * MisMatchReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the differences between the two proposed baselines"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Description of the differences between the two proposed baselines";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MisMatchReport3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PendingActivity2 requestForAction;
	/**
	 * Information on the next processing step required.
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
	 * definition} = "Information on the next processing step required."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestForAction = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqForActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAction";
			definition = "Information on the next processing step required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingActivity2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BaselineMatchReportV03.class.getMethod("getRequestForAction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineMatchReportV03";
				definition = "Scope\r\nThe BaselineMatchReport message is sent by the matching application to the parties involved in the establishment of a transaction.\r\nThe message is used to inform about either the successful establishment of a transaction (baseline) or the mis-matches found between two baseline initiation messages.\r\nUsage\r\nThe BaselineMatchReport message can be sent by the matching application to\r\n- the parties involved in the establishment of a transaction in the push-through mode, that is the senders of InitialBaselineSubmission and BaselineReSubmission messages including the instruction push-through. In the outlined scenario the message is used to inform either about the successful establishment of a transaction in the matching application or about mis-matches found between two baseline initiation messages,or\r\n- the party establishing a transaction in the lodge mode, that is the sender of an InitialBaselineSubmission message including the instruction lodge. In the outlined scenario the message is used to inform about the successful establishment of a transaction in the matching application.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "BaselnMtchRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmReportIdentification, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmEstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmTransactionStatus,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmUserTransactionReference, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmBuyer,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmSeller, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmBuyerBank, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmSellerBank,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmBaselineEstablishmentTrials, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmComparedDocumentReference,
						com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmReport, com.tools20022.repository.area.tsmt.BaselineMatchReportV03.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "010";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BaselineMatchReportV03.class;
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

	@XmlElement(name = "TxId", required = true)
	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "EstblishdBaselnId")
	public DocumentIdentification3 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public void setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = establishedBaselineIdentification;
	}

	@XmlElement(name = "TxSts", required = true)
	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@XmlElement(name = "UsrTxRef")
	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference;
	}

	public void setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = userTransactionReference;
	}

	@XmlElement(name = "Buyr", required = true)
	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public void setBuyer(PartyIdentification26 buyer) {
		this.buyer = buyer;
	}

	@XmlElement(name = "Sellr", required = true)
	public PartyIdentification26 getSeller() {
		return seller;
	}

	public void setSeller(PartyIdentification26 seller) {
		this.seller = seller;
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

	@XmlElement(name = "BaselnEstblishmtTrils", required = true)
	public Limit1 getBaselineEstablishmentTrials() {
		return baselineEstablishmentTrials;
	}

	public void setBaselineEstablishmentTrials(Limit1 baselineEstablishmentTrials) {
		this.baselineEstablishmentTrials = baselineEstablishmentTrials;
	}

	@XmlElement(name = "CmpardDocRef", required = true)
	public List<DocumentIdentification4> getComparedDocumentReference() {
		return comparedDocumentReference;
	}

	public void setComparedDocumentReference(List<DocumentIdentification4> comparedDocumentReference) {
		this.comparedDocumentReference = comparedDocumentReference;
	}

	@XmlElement(name = "Rpt", required = true)
	public MisMatchReport3 getReport() {
		return report;
	}

	public void setReport(MisMatchReport3 report) {
		this.report = report;
	}

	@XmlElement(name = "ReqForActn")
	public PendingActivity2 getRequestForAction() {
		return requestForAction;
	}

	public void setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.010.03.03")
	static public class Document {
		@XmlElement(name = "BaselnMtchRpt", required = true)
		public BaselineMatchReportV03 messageBody;
	}
}