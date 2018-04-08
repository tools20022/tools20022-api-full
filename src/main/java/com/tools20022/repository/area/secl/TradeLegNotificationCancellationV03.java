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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The TradeLegNotificationCancellation message is sent by the central
 * counterparty (CCP) to a clearing member to notify the cancellation of a
 * TradeLegNotification message previously sent.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The previously sent message must be the Trade Leg Notification message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmClearingMember
 * TradeLegNotificationCancellationV03.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmClearingAccount
 * TradeLegNotificationCancellationV03.mmClearingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmDeliveryAccount
 * TradeLegNotificationCancellationV03.mmDeliveryAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmNonClearingMember
 * TradeLegNotificationCancellationV03.mmNonClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmClearingDetails
 * TradeLegNotificationCancellationV03.mmClearingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmTradeLegDetails
 * TradeLegNotificationCancellationV03.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmSettlementDetails
 * TradeLegNotificationCancellationV03.mmSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmSupplementaryData
 * TradeLegNotificationCancellationV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TradLegNtfctnCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.002.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryOrPlaceOfListingPresenceRule#for_secl_TradeLegNotificationCancellationV03
 * ConstraintDepositoryOrPlaceOfListingPresenceRule.
 * for_secl_TradeLegNotificationCancellationV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeLegNotificationCancellationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe TradeLegNotificationCancellation message is sent by the central counterparty (CCP) to a clearing member to notify the cancellation of a TradeLegNotification message previously sent.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe previously sent message must be the Trade Leg Notification message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeLegNotificationCancellationV03", propOrder = {"clearingMember", "clearingAccount", "deliveryAccount", "nonClearingMember", "clearingDetails", "tradeLegDetails", "settlementDetails", "supplementaryData"})
public class TradeLegNotificationCancellationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrMmb", required = true)
	protected PartyIdentification35Choice clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, PartyIdentification35Choice> mmClearingMember = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, PartyIdentification35Choice>() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		@Override
		public PartyIdentification35Choice getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getClearingMember();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, PartyIdentification35Choice value) {
			obj.setClearingMember(value);
		}
	};
	@XmlElement(name = "ClrAcct", required = true)
	protected SecuritiesAccount18 clearingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount18
	 * SecuritiesAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the clearing member account at the Central counterparty through which the trade must be cleared."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, SecuritiesAccount18> mmClearingAccount = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, SecuritiesAccount18>() {
		{
			xmlTag = "ClrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingAccount";
			definition = "Identifies the clearing member account at the Central counterparty through which the trade must be cleared.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount18.mmObject();
		}

		@Override
		public SecuritiesAccount18 getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getClearingAccount();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, SecuritiesAccount18 value) {
			obj.setClearingAccount(value);
		}
	};
	@XmlElement(name = "DlvryAcct")
	protected SecuritiesAccount19 deliveryAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Optional<SecuritiesAccount19>> mmDeliveryAccount = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Optional<SecuritiesAccount19>>() {
		{
			xmlTag = "DlvryAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAccount";
			definition = "An account opened by the central counterparty in the name of the clearing member or its settlement agent within the account structure, for settlement purposes (gives information about the clearing member/its settlement agent account at the central securities depository).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getDeliveryAccount();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, Optional<SecuritiesAccount19> value) {
			obj.setDeliveryAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "NonClrMmb")
	protected PartyIdentificationAndAccount31 nonClearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount31
	 * PartyIdentificationAndAccount31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the non clearing member identification and account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Optional<PartyIdentificationAndAccount31>> mmNonClearingMember = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Optional<PartyIdentificationAndAccount31>>() {
		{
			xmlTag = "NonClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonClearingMember";
			definition = "Provides details about the non clearing member identification and account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount31.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount31> getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getNonClearingMember();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, Optional<PartyIdentificationAndAccount31> value) {
			obj.setNonClearingMember(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrDtls")
	protected Clearing4 clearingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Clearing4
	 * Clearing4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides clearing details such as the non clearing member identification or the settlement netting (or not) eligibility code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Optional<Clearing4>> mmClearingDetails = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Optional<Clearing4>>() {
		{
			xmlTag = "ClrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingDetails";
			definition = "Provides clearing details such as the non clearing member identification or the settlement netting (or not) eligibility code.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Clearing4.mmObject();
		}

		@Override
		public Optional<Clearing4> getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getClearingDetails();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, Optional<Clearing4> value) {
			obj.setClearingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TradLegDtls", required = true)
	protected TradeLeg8 tradeLegDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLegDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLegDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the trade leg such as the trade date, the settlement date or the trading currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, TradeLeg8> mmTradeLegDetails = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, TradeLeg8>() {
		{
			xmlTag = "TradLegDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegDetails";
			definition = "Provides details about the trade leg such as the trade date, the settlement date or the trading currency.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeLeg8.mmObject();
		}

		@Override
		public TradeLeg8 getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getTradeLegDetails();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, TradeLeg8 value) {
			obj.setTradeLegDetails(value);
		}
	};
	@XmlElement(name = "SttlmDtls", required = true)
	protected Settlement1 settlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Settlement1
	 * Settlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the settlement details of the trade leg such as the settlement currency or the place of settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Settlement1> mmSettlementDetails = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, Settlement1>() {
		{
			xmlTag = "SttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDetails";
			definition = "Provides details about the settlement details of the trade leg such as the settlement currency or the place of settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Settlement1.mmObject();
		}

		@Override
		public Settlement1 getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getSettlementDetails();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, Settlement1 value) {
			obj.setSettlementDetails(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TradeLegNotificationCancellationV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<TradeLegNotificationCancellationV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(TradeLegNotificationCancellationV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(TradeLegNotificationCancellationV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDepositoryOrPlaceOfListingPresenceRule.for_secl_TradeLegNotificationCancellationV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeLegNotificationCancellationV03";
				definition = "Scope\r\nThe TradeLegNotificationCancellation message is sent by the central counterparty (CCP) to a clearing member to notify the cancellation of a TradeLegNotification message previously sent.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThe previously sent message must be the Trade Leg Notification message.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "TradLegNtfctnCxl";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmClearingMember,
						com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmClearingAccount, com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmDeliveryAccount,
						com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmNonClearingMember, com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmClearingDetails,
						com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmTradeLegDetails, com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmSettlementDetails,
						com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "002";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeLegNotificationCancellationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public TradeLegNotificationCancellationV03 setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public SecuritiesAccount18 getClearingAccount() {
		return clearingAccount;
	}

	public TradeLegNotificationCancellationV03 setClearingAccount(SecuritiesAccount18 clearingAccount) {
		this.clearingAccount = Objects.requireNonNull(clearingAccount);
		return this;
	}

	public Optional<SecuritiesAccount19> getDeliveryAccount() {
		return deliveryAccount == null ? Optional.empty() : Optional.of(deliveryAccount);
	}

	public TradeLegNotificationCancellationV03 setDeliveryAccount(SecuritiesAccount19 deliveryAccount) {
		this.deliveryAccount = deliveryAccount;
		return this;
	}

	public Optional<PartyIdentificationAndAccount31> getNonClearingMember() {
		return nonClearingMember == null ? Optional.empty() : Optional.of(nonClearingMember);
	}

	public TradeLegNotificationCancellationV03 setNonClearingMember(PartyIdentificationAndAccount31 nonClearingMember) {
		this.nonClearingMember = nonClearingMember;
		return this;
	}

	public Optional<Clearing4> getClearingDetails() {
		return clearingDetails == null ? Optional.empty() : Optional.of(clearingDetails);
	}

	public TradeLegNotificationCancellationV03 setClearingDetails(Clearing4 clearingDetails) {
		this.clearingDetails = clearingDetails;
		return this;
	}

	public TradeLeg8 getTradeLegDetails() {
		return tradeLegDetails;
	}

	public TradeLegNotificationCancellationV03 setTradeLegDetails(TradeLeg8 tradeLegDetails) {
		this.tradeLegDetails = Objects.requireNonNull(tradeLegDetails);
		return this;
	}

	public Settlement1 getSettlementDetails() {
		return settlementDetails;
	}

	public TradeLegNotificationCancellationV03 setSettlementDetails(Settlement1 settlementDetails) {
		this.settlementDetails = Objects.requireNonNull(settlementDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public TradeLegNotificationCancellationV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.002.001.03")
	static public class Document {
		@XmlElement(name = "TradLegNtfctnCxl", required = true)
		public TradeLegNotificationCancellationV03 messageBody;
	}
}