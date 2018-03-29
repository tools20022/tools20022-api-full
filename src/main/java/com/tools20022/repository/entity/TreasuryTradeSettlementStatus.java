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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SettlementStatusCode;
import com.tools20022.repository.codeset.TradeStatusCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.TreasuryTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the status of a treasury trade at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTradeSettlementStatus"
 * src="doc-files/TreasuryTradeSettlementStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTradeStatus
 * TreasuryTradeSettlementStatus.mmTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmAllegedTrade
 * TreasuryTradeSettlementStatus.mmAllegedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmTreasuryTrade
 * TreasuryTradeSettlementStatus.mmTreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlement
 * TreasuryTradeSettlementStatus.mmSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmRejectedAmount
 * TreasuryTradeSettlementStatus.mmRejectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementSuspended
 * TreasuryTradeSettlementStatus.mmSettlementSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmPendingSettlement
 * TreasuryTradeSettlementStatus.mmPendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementDate
 * TreasuryTradeSettlementStatus.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmWithdrawalReason
 * TreasuryTradeSettlementStatus.mmWithdrawalReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasuryTradeSettlementStatus
 * TreasuryTrade.mmTreasuryTradeSettlementStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatus
 * TradeData10.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#mmCurrentStatusSubType
 * TradeData10.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10#mmPreviousStatus
 * TradeData10.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData10#mmPreviousStatusSubType
 * TradeData10.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatus
 * TradeData9.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmCurrentStatusSubType
 * TradeData9.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmPreviousStatus
 * TradeData9.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData9#mmPreviousStatusSubType
 * TradeData9.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatus
 * TradeData7.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmCurrentStatusSubType
 * TradeData7.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatus
 * TradeData7.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData7#mmPreviousStatusSubType
 * TradeData7.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatus
 * TradeData14.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData14#mmCurrentStatusSubType
 * TradeData14.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmPreviousStatus
 * TradeData14.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData14#mmPreviousStatusSubType
 * TradeData14.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatus
 * TradeData12.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmCurrentStatusSubType
 * TradeData12.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatus
 * TradeData12.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData12#mmPreviousStatusSubType
 * TradeData12.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatus
 * TradeData15.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData15#mmCurrentStatusSubType
 * TradeData15.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatus
 * TradeData15.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData15#mmPreviousStatusSubType
 * TradeData15.mmPreviousStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatus
 * TradeData16.mmCurrentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData16#mmCurrentStatusSubType
 * TradeData16.mmCurrentStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16#mmPreviousStatus
 * TradeData16.mmPreviousStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeData16#mmPreviousStatusSubType
 * TradeData16.mmPreviousStatusSubType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData1 TradeData1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status5Choice Status5Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.choice.Status13Choice
 * Status13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndSubStatus1
 * StatusAndSubStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData10 TradeData10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData8 TradeData8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData9 TradeData9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status6Choice Status6Choice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData7 TradeData7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1 TradeStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData11 TradeData11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData14 TradeData14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData12 TradeData12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData15 TradeData15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatusAndSubStatus2
 * StatusAndSubStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status28Choice
 * Status28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status27Choice
 * Status27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeData16 TradeData16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TreasuryTradeSettlementStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a treasury trade at a specified time."
 * </li>
 * </ul>
 */
public class TreasuryTradeSettlementStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TradeStatusCode tradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatus
	 * TradeData1.mmCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmExtendedCurrentStatus
	 * TradeData1.mmExtendedCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmCurrentStatusSubType
	 * TradeData1.mmCurrentStatusSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatus
	 * TradeData1.mmPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmExtendedPreviousStatus
	 * TradeData1.mmExtendedPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData1#mmPreviousStatusSubType
	 * TradeData1.mmPreviousStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status5Choice#mmCode
	 * Status5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status5Choice#mmProprietary
	 * Status5Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData4#mmCurrentStatus
	 * TradeData4.mmCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData4#mmCurrentStatusSubType
	 * TradeData4.mmCurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status13Choice#mmCode
	 * Status13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status13Choice#mmProprietary
	 * Status13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus1#mmStatusCode
	 * StatusAndSubStatus1.mmStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus1#mmSubStatusCode
	 * StatusAndSubStatus1.mmSubStatusCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData3#mmCurrentStatus
	 * TradeData3.mmCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData3#mmCurrentStatusSubType
	 * TradeData3.mmCurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData2#mmCurrentStatus
	 * TradeData2.mmCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmExtendedCurrentStatus
	 * TradeData2.mmExtendedCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmCurrentStatusSubType
	 * TradeData2.mmCurrentStatusSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmPreviousStatus
	 * TradeData2.mmPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmExtendedPreviousStatus
	 * TradeData2.mmExtendedPreviousStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData2#mmPreviousStatusSubType
	 * TradeData2.mmPreviousStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status6Choice#mmCode
	 * Status6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status6Choice#mmProprietary
	 * Status6Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData6#mmCurrentStatus
	 * TradeData6.mmCurrentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeData6#mmCurrentStatusSubType
	 * TradeData6.mmCurrentStatusSubType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatus
	 * TradeStatus1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmExtendedStatus
	 * TradeStatus1.mmExtendedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmStatusSubType
	 * TradeStatus1.mmStatusSubType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2#mmStatusCode
	 * StatusAndSubStatus2.mmStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatusAndSubStatus2#mmSubStatusCode
	 * StatusAndSubStatus2.mmSubStatusCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status28Choice#mmCode
	 * Status28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status28Choice#mmProprietary
	 * Status28Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status27Choice#mmCode
	 * Status27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Status27Choice#mmProprietary
	 * Status27Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a treasury trade in a central matching/settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, TradeStatusCode> mmTradeStatus = new MMBusinessAttribute<TreasuryTradeSettlementStatus, TradeStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeData1.mmCurrentStatus, TradeData1.mmExtendedCurrentStatus, TradeData1.mmCurrentStatusSubType, TradeData1.mmPreviousStatus, TradeData1.mmExtendedPreviousStatus,
					TradeData1.mmPreviousStatusSubType, Status5Choice.mmCode, Status5Choice.mmProprietary, TradeData4.mmCurrentStatus, TradeData4.mmCurrentStatusSubType, Status13Choice.mmCode, Status13Choice.mmProprietary,
					StatusAndSubStatus1.mmStatusCode, StatusAndSubStatus1.mmSubStatusCode, TradeData3.mmCurrentStatus, TradeData3.mmCurrentStatusSubType, TradeData2.mmCurrentStatus, TradeData2.mmExtendedCurrentStatus,
					TradeData2.mmCurrentStatusSubType, TradeData2.mmPreviousStatus, TradeData2.mmExtendedPreviousStatus, TradeData2.mmPreviousStatusSubType, Status6Choice.mmCode, Status6Choice.mmProprietary, TradeData6.mmCurrentStatus,
					TradeData6.mmCurrentStatusSubType, TradeStatus1.mmStatus, TradeStatus1.mmExtendedStatus, TradeStatus1.mmStatusSubType, StatusAndSubStatus2.mmStatusCode, StatusAndSubStatus2.mmSubStatusCode, Status28Choice.mmCode,
					Status28Choice.mmProprietary, Status27Choice.mmCode, Status27Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeStatus";
			definition = "Status of a treasury trade in a central matching/settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeStatusCode.mmObject();
		}

		@Override
		public TradeStatusCode getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getTradeStatus();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, TradeStatusCode value) {
			obj.setTradeStatus(value);
		}
	};
	protected YesNoIndicator allegedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData9#mmAllegedTrade
	 * TradeData9.mmAllegedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeStatus1#mmAllegedTrade
	 * TradeStatus1.mmAllegedTrade}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeData14#mmAllegedTrade
	 * TradeData14.mmAllegedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a trade is alleged (notified by the counterparty) or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, YesNoIndicator> mmAllegedTrade = new MMBusinessAttribute<TreasuryTradeSettlementStatus, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeData9.mmAllegedTrade, TradeStatus1.mmAllegedTrade, TradeData14.mmAllegedTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged (notified by the counterparty) or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getAllegedTrade();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, YesNoIndicator value) {
			obj.setAllegedTrade(value);
		}
	};
	protected TreasuryTrade treasuryTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#mmTreasuryTradeSettlementStatus
	 * TreasuryTrade.mmTreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
	 * TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Treasury trade for which a settlement status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<TreasuryTradeSettlementStatus, Optional<TreasuryTrade>> mmTreasuryTrade = new MMBusinessAssociationEnd<TreasuryTradeSettlementStatus, Optional<TreasuryTrade>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Treasury trade for which a settlement status is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmTreasuryTradeSettlementStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
		}

		@Override
		public Optional<TreasuryTrade> getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getTreasuryTrade();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, Optional<TreasuryTrade> value) {
			obj.setTreasuryTrade(value.orElse(null));
		}
	};
	protected SettlementStatusCode settlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementStatus
	 * SettlementData1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementStatus
	 * SettlementData2.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of a settlement eg rejected, settled or awaiting authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, SettlementStatusCode> mmSettlement = new MMBusinessAttribute<TreasuryTradeSettlementStatus, SettlementStatusCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementData1.mmSettlementStatus, SettlementData2.mmSettlementStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}

		@Override
		public SettlementStatusCode getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getSettlement();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, SettlementStatusCode value) {
			obj.setSettlement(value);
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount rejectedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmRejectedAmount
	 * SettlementData1.mmRejectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmRejectedAmount
	 * SettlementData2.mmRejectedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that cannot be settled for instance by a settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, ActiveOrHistoricCurrencyAndAmount> mmRejectedAmount = new MMBusinessAttribute<TreasuryTradeSettlementStatus, ActiveOrHistoricCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementData1.mmRejectedAmount, SettlementData2.mmRejectedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled for instance by a settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getRejectedAmount();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setRejectedAmount(value);
		}
	};
	protected YesNoIndicator settlementSuspended;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSuspended
	 * SettlementData1.mmSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSuspended
	 * SettlementData2.mmSuspended}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, YesNoIndicator> mmSettlementSuspended = new MMBusinessAttribute<TreasuryTradeSettlementStatus, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementData1.mmSuspended, SettlementData2.mmSuspended);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSuspended";
			definition = "Cash settlement is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getSettlementSuspended();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, YesNoIndicator value) {
			obj.setSettlementSuspended(value);
		}
	};
	protected YesNoIndicator pendingSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1#mmPending
	 * SettlementData1.mmPending}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2#mmPending
	 * SettlementData2.mmPending}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, YesNoIndicator> mmPendingSettlement = new MMBusinessAttribute<TreasuryTradeSettlementStatus, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementData1.mmPending, SettlementData2.mmPending);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Cash settlement is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getPendingSettlement();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, YesNoIndicator value) {
			obj.setPendingSettlement(value);
		}
	};
	protected ISODateTime settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmSettlementDate
	 * Trade3.mmSettlementDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmFixingDate
	 * Trade3.mmFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the trade is actually settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, ISODateTime> mmSettlementDate = new MMBusinessAttribute<TreasuryTradeSettlementStatus, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Trade3.mmSettlementDate, Trade3.mmFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the trade is actually settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, ISODateTime value) {
			obj.setSettlementDate(value);
		}
	};
	protected Max35Text withdrawalReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason that an alleged trade is withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<TreasuryTradeSettlementStatus, Max35Text> mmWithdrawalReason = new MMBusinessAttribute<TreasuryTradeSettlementStatus, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WithdrawalReason";
			definition = "Reason that an alleged trade is withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TreasuryTradeSettlementStatus obj) {
			return obj.getWithdrawalReason();
		}

		@Override
		public void setValue(TreasuryTradeSettlementStatus obj, Max35Text value) {
			obj.setWithdrawalReason(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradeSettlementStatus";
				definition = "Specifies the status of a treasury trade at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.mmTreasuryTradeSettlementStatus);
				derivationElement_lazy = () -> Arrays.asList(TradeData10.mmCurrentStatus, TradeData10.mmCurrentStatusSubType, TradeData10.mmPreviousStatus, TradeData10.mmPreviousStatusSubType, TradeData9.mmCurrentStatus,
						TradeData9.mmCurrentStatusSubType, TradeData9.mmPreviousStatus, TradeData9.mmPreviousStatusSubType, TradeData7.mmCurrentStatus, TradeData7.mmCurrentStatusSubType, TradeData7.mmPreviousStatus,
						TradeData7.mmPreviousStatusSubType, TradeData14.mmCurrentStatus, TradeData14.mmCurrentStatusSubType, TradeData14.mmPreviousStatus, TradeData14.mmPreviousStatusSubType, TradeData12.mmCurrentStatus,
						TradeData12.mmCurrentStatusSubType, TradeData12.mmPreviousStatus, TradeData12.mmPreviousStatusSubType, TradeData15.mmCurrentStatus, TradeData15.mmCurrentStatusSubType, TradeData15.mmPreviousStatus,
						TradeData15.mmPreviousStatusSubType, TradeData16.mmCurrentStatus, TradeData16.mmCurrentStatusSubType, TradeData16.mmPreviousStatus, TradeData16.mmPreviousStatusSubType);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmTradeStatus, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmAllegedTrade,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmTreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmSettlement,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmRejectedAmount, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmSettlementSuspended,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmPendingSettlement, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmSettlementDate,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.mmWithdrawalReason);
				derivationComponent_lazy = () -> Arrays.asList(TradeData1.mmObject(), Status5Choice.mmObject(), Status13Choice.mmObject(), StatusAndSubStatus1.mmObject(), TradeData10.mmObject(), TradeData8.mmObject(),
						TradeData9.mmObject(), Status6Choice.mmObject(), TradeData7.mmObject(), TradeStatus1.mmObject(), TradeData11.mmObject(), TradeData14.mmObject(), TradeData12.mmObject(), TradeData15.mmObject(),
						StatusAndSubStatus2.mmObject(), Status28Choice.mmObject(), Status27Choice.mmObject(), TradeData16.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TreasuryTradeSettlementStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeStatusCode getTradeStatus() {
		return tradeStatus;
	}

	public TreasuryTradeSettlementStatus setTradeStatus(TradeStatusCode tradeStatus) {
		this.tradeStatus = Objects.requireNonNull(tradeStatus);
		return this;
	}

	public YesNoIndicator getAllegedTrade() {
		return allegedTrade;
	}

	public TreasuryTradeSettlementStatus setAllegedTrade(YesNoIndicator allegedTrade) {
		this.allegedTrade = Objects.requireNonNull(allegedTrade);
		return this;
	}

	public Optional<TreasuryTrade> getTreasuryTrade() {
		return treasuryTrade == null ? Optional.empty() : Optional.of(treasuryTrade);
	}

	public TreasuryTradeSettlementStatus setTreasuryTrade(com.tools20022.repository.entity.TreasuryTrade treasuryTrade) {
		this.treasuryTrade = treasuryTrade;
		return this;
	}

	public SettlementStatusCode getSettlement() {
		return settlement;
	}

	public TreasuryTradeSettlementStatus setSettlement(SettlementStatusCode settlement) {
		this.settlement = Objects.requireNonNull(settlement);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getRejectedAmount() {
		return rejectedAmount;
	}

	public TreasuryTradeSettlementStatus setRejectedAmount(ActiveOrHistoricCurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = Objects.requireNonNull(rejectedAmount);
		return this;
	}

	public YesNoIndicator getSettlementSuspended() {
		return settlementSuspended;
	}

	public TreasuryTradeSettlementStatus setSettlementSuspended(YesNoIndicator settlementSuspended) {
		this.settlementSuspended = Objects.requireNonNull(settlementSuspended);
		return this;
	}

	public YesNoIndicator getPendingSettlement() {
		return pendingSettlement;
	}

	public TreasuryTradeSettlementStatus setPendingSettlement(YesNoIndicator pendingSettlement) {
		this.pendingSettlement = Objects.requireNonNull(pendingSettlement);
		return this;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public TreasuryTradeSettlementStatus setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Max35Text getWithdrawalReason() {
		return withdrawalReason;
	}

	public TreasuryTradeSettlementStatus setWithdrawalReason(Max35Text withdrawalReason) {
		this.withdrawalReason = Objects.requireNonNull(withdrawalReason);
		return this;
	}
}