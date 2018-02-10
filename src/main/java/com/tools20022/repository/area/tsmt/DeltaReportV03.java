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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The DeltaReport message is sent by the matching application to the parties
 * involved in the request of a baseline amendment.<br>
 * The message is used to list the differences between the established and the
 * newly proposed baseline.<br>
 * <b>Usage</b><br>
 * The DeltaReport message can be sent by the matching application to<br>
 * - the parties involved in the amendment of a baseline that has been
 * established in the push-through mode. In the outlined scenario the message is
 * sent to the requester of the amendment to acknowledge the receipt of the
 * request and to list the differences between the established and the newly
 * proposed baseline and to the counterparty to list the differences between the
 * established and the newly proposed baseline and to request the acceptance or
 * rejection of the amendment request,<br>
 * or<br>
 * - the party that has requested the amendment of a baseline established in the
 * lodge mode. In the outlined scenario the message is used to confirm the
 * changes to the baseline and to list the differences between the amended
 * baseline and the baseline established earlier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmReportIdentification
 * DeltaReportV03.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmTransactionIdentification
 * DeltaReportV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmEstablishedBaselineIdentification
 * DeltaReportV03.mmEstablishedBaselineIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmTransactionStatus
 * DeltaReportV03.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmAmendmentNumber
 * DeltaReportV03.mmAmendmentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmUserTransactionReference
 * DeltaReportV03.mmUserTransactionReference}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmBuyer
 * DeltaReportV03.mmBuyer}</li>
 * <li>{@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmSeller
 * DeltaReportV03.mmSeller}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmBuyerBank
 * DeltaReportV03.mmBuyerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmSellerBank
 * DeltaReportV03.mmSellerBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmSubmitterProposedBaselineReference
 * DeltaReportV03.mmSubmitterProposedBaselineReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmUpdatedElement
 * DeltaReportV03.mmUpdatedElement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.DeltaReportV03#mmRequestForAction
 * DeltaReportV03.mmRequestForAction}</li>
 * </ul>
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DltaRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementLatestVersion
 * TradeServicesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.015.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeltaReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe DeltaReport message is sent by the matching application to the parties involved in the request of a baseline amendment.\r\nThe message is used to list the differences between the established and the newly proposed baseline.\r\nUsage\r\nThe DeltaReport message can be sent by the matching application to\r\n- the parties involved in the amendment of a baseline that has been established in the push-through mode. In the outlined scenario the message is sent to the requester of the amendment to acknowledge the receipt of the request and to list the differences between the established and the newly proposed baseline and to the counterparty to list the differences between the established and the newly proposed baseline and to request the acceptance or rejection of the amendment request,\r\nor\r\n- the party that has requested the amendment of a baseline established in the lodge mode. In the outlined scenario the message is used to confirm the changes to the baseline and to list the differences between the amended baseline and the baseline established earlier."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeltaReportV03", propOrder = {"reportIdentification", "transactionIdentification", "establishedBaselineIdentification", "transactionStatus", "amendmentNumber", "userTransactionReference", "buyer", "seller", "buyerBank",
		"sellerBank", "submitterProposedBaselineReference", "updatedElement", "requestForAction"})
public class DeltaReportV03 {

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
				return DeltaReportV03.class.getMethod("getReportIdentification", new Class[]{});
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
				return DeltaReportV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "EstblishdBaselnId", required = true)
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
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DeltaReportV03.class.getMethod("getEstablishedBaselineIdentification", new Class[]{});
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
				return DeltaReportV03.class.getMethod("getTransactionStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AmdmntNb", required = true)
	protected Count1 amendmentNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Count1 Count1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence number of the proposed baseline amendment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAmendmentNumber = new MMMessageBuildingBlock() {
		{
			xmlTag = "AmdmntNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentNumber";
			definition = "Sequence number of the proposed baseline amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Count1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DeltaReportV03.class.getMethod("getAmendmentNumber", new Class[]{});
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
				return DeltaReportV03.class.getMethod("getUserTransactionReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentification26 buyer;
	/**
	 * 
	 <p>
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
				return DeltaReportV03.class.getMethod("getBuyer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Sellr", required = true)
	protected PartyIdentification26 seller;
	/**
	 * 
	 <p>
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
				return DeltaReportV03.class.getMethod("getSeller", new Class[]{});
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
				return DeltaReportV03.class.getMethod("getBuyerBank", new Class[]{});
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
				return DeltaReportV03.class.getMethod("getSellerBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SubmitrPropsdBaselnRef", required = true)
	protected DocumentIdentification1 submitterProposedBaselineReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification1
	 * DocumentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrPropsdBaselnRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterProposedBaselineReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the baseline included in the amendment request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSubmitterProposedBaselineReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubmitrPropsdBaselnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterProposedBaselineReference";
			definition = "Reference to the identification of the baseline included in the amendment request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DeltaReportV03.class.getMethod("getSubmitterProposedBaselineReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "UpdtdElmt", required = true)
	protected List<ComparisonResult2> updatedElement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ComparisonResult2
	 * ComparisonResult2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdtdElmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdatedElement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed comparison between the currently established baseline elements and the proposed ones."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUpdatedElement = new MMMessageBuildingBlock() {
		{
			xmlTag = "UpdtdElmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdatedElement";
			definition = "Detailed comparison between the currently established baseline elements and the proposed ones.";
			minOccurs = 1;
			complexType_lazy = () -> ComparisonResult2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DeltaReportV03.class.getMethod("getUpdatedElement", new Class[]{});
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
				return DeltaReportV03.class.getMethod("getRequestForAction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeltaReportV03";
				definition = "Scope\r\nThe DeltaReport message is sent by the matching application to the parties involved in the request of a baseline amendment.\r\nThe message is used to list the differences between the established and the newly proposed baseline.\r\nUsage\r\nThe DeltaReport message can be sent by the matching application to\r\n- the parties involved in the amendment of a baseline that has been established in the push-through mode. In the outlined scenario the message is sent to the requester of the amendment to acknowledge the receipt of the request and to list the differences between the established and the newly proposed baseline and to the counterparty to list the differences between the established and the newly proposed baseline and to request the acceptance or rejection of the amendment request,\r\nor\r\n- the party that has requested the amendment of a baseline established in the lodge mode. In the outlined scenario the message is used to confirm the changes to the baseline and to list the differences between the amended baseline and the baseline established earlier.";
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), TradeServicesManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "DltaRpt";
				businessArea_lazy = () -> TradeServicesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.DeltaReportV03.mmReportIdentification, com.tools20022.repository.area.tsmt.DeltaReportV03.mmTransactionIdentification,
						com.tools20022.repository.area.tsmt.DeltaReportV03.mmEstablishedBaselineIdentification, com.tools20022.repository.area.tsmt.DeltaReportV03.mmTransactionStatus,
						com.tools20022.repository.area.tsmt.DeltaReportV03.mmAmendmentNumber, com.tools20022.repository.area.tsmt.DeltaReportV03.mmUserTransactionReference, com.tools20022.repository.area.tsmt.DeltaReportV03.mmBuyer,
						com.tools20022.repository.area.tsmt.DeltaReportV03.mmSeller, com.tools20022.repository.area.tsmt.DeltaReportV03.mmBuyerBank, com.tools20022.repository.area.tsmt.DeltaReportV03.mmSellerBank,
						com.tools20022.repository.area.tsmt.DeltaReportV03.mmSubmitterProposedBaselineReference, com.tools20022.repository.area.tsmt.DeltaReportV03.mmUpdatedElement,
						com.tools20022.repository.area.tsmt.DeltaReportV03.mmRequestForAction);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "015";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DeltaReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getReportIdentification() {
		return reportIdentification;
	}

	public DeltaReportV03 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = Objects.requireNonNull(reportIdentification);
		return this;
	}

	public SimpleIdentificationInformation getTransactionIdentification() {
		return transactionIdentification;
	}

	public DeltaReportV03 setTransactionIdentification(SimpleIdentificationInformation transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public DocumentIdentification3 getEstablishedBaselineIdentification() {
		return establishedBaselineIdentification;
	}

	public DeltaReportV03 setEstablishedBaselineIdentification(DocumentIdentification3 establishedBaselineIdentification) {
		this.establishedBaselineIdentification = Objects.requireNonNull(establishedBaselineIdentification);
		return this;
	}

	public TransactionStatus4 getTransactionStatus() {
		return transactionStatus;
	}

	public DeltaReportV03 setTransactionStatus(TransactionStatus4 transactionStatus) {
		this.transactionStatus = Objects.requireNonNull(transactionStatus);
		return this;
	}

	public Count1 getAmendmentNumber() {
		return amendmentNumber;
	}

	public DeltaReportV03 setAmendmentNumber(Count1 amendmentNumber) {
		this.amendmentNumber = Objects.requireNonNull(amendmentNumber);
		return this;
	}

	public List<DocumentIdentification5> getUserTransactionReference() {
		return userTransactionReference == null ? userTransactionReference = new ArrayList<>() : userTransactionReference;
	}

	public DeltaReportV03 setUserTransactionReference(List<DocumentIdentification5> userTransactionReference) {
		this.userTransactionReference = Objects.requireNonNull(userTransactionReference);
		return this;
	}

	public PartyIdentification26 getBuyer() {
		return buyer;
	}

	public DeltaReportV03 setBuyer(PartyIdentification26 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PartyIdentification26 getSeller() {
		return seller;
	}

	public DeltaReportV03 setSeller(PartyIdentification26 seller) {
		this.seller = Objects.requireNonNull(seller);
		return this;
	}

	public BICIdentification1 getBuyerBank() {
		return buyerBank;
	}

	public DeltaReportV03 setBuyerBank(BICIdentification1 buyerBank) {
		this.buyerBank = Objects.requireNonNull(buyerBank);
		return this;
	}

	public BICIdentification1 getSellerBank() {
		return sellerBank;
	}

	public DeltaReportV03 setSellerBank(BICIdentification1 sellerBank) {
		this.sellerBank = Objects.requireNonNull(sellerBank);
		return this;
	}

	public DocumentIdentification1 getSubmitterProposedBaselineReference() {
		return submitterProposedBaselineReference;
	}

	public DeltaReportV03 setSubmitterProposedBaselineReference(DocumentIdentification1 submitterProposedBaselineReference) {
		this.submitterProposedBaselineReference = Objects.requireNonNull(submitterProposedBaselineReference);
		return this;
	}

	public List<ComparisonResult2> getUpdatedElement() {
		return updatedElement == null ? updatedElement = new ArrayList<>() : updatedElement;
	}

	public DeltaReportV03 setUpdatedElement(List<ComparisonResult2> updatedElement) {
		this.updatedElement = Objects.requireNonNull(updatedElement);
		return this;
	}

	public Optional<PendingActivity2> getRequestForAction() {
		return requestForAction == null ? Optional.empty() : Optional.of(requestForAction);
	}

	public DeltaReportV03 setRequestForAction(PendingActivity2 requestForAction) {
		this.requestForAction = requestForAction;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.015.001.03")
	static public class Document {
		@XmlElement(name = "DltaRpt", required = true)
		public DeltaReportV03 messageBody;
	}
}