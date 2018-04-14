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
import com.tools20022.repository.codeset.TradePostingCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.ClearingSystem;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Mechanism allowing financial institutions that are members of a clearing
 * house to pay and to receive the amounts linked to the transactions that they
 * have executed on the market. The addition of all the positions per product
 * results in one net position (due or to receive) with the clearing house or
 * the central clearing counterparty.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Clearing" src="doc-files/Clearing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment
 * ObligationFulfilment}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearingThresholdIndicator
 * Clearing.mmClearingThresholdIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearedIdentification
 * Clearing.mmClearedIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#mmGuaranteedTrade
 * Clearing.mmGuaranteedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#mmTradePostingType
 * Clearing.mmTradePostingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Clearing#mmClearingSystem
 * Clearing.mmClearingSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem#mmClearing
 * ClearingSystem.mmClearing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg3#mmClearingDetails
 * TradeLeg3.mmClearingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg6#mmClearingDetails
 * TradeLeg6.mmClearingDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmClearingDetails
 * TradeLeg9.mmClearingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesClearing
 * SecuritiesClearing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing3 Clearing3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing1 Clearing1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing2 Clearing2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing4 Clearing4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Clearing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Mechanism allowing financial institutions that are members of a clearing house to pay and to receive the amounts linked to the transactions that they have executed on the market. The addition of all the positions per product results in one net position (due or to receive) with the clearing house or the central clearing counterparty."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class Clearing extends ObligationFulfilment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator clearingThresholdIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingThresholdIndicator
	 * RegulatoryReporting1.mmClearingThresholdIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingThresholdIndicator
	 * RegulatoryReporting4.mmClearingThresholdIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonFinancialInstitutionSector1#mmClearingThreshold
	 * NonFinancialInstitutionSector1.mmClearingThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingThresholdIndicator
	 * RegulatoryReporting6.mmClearingThresholdIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingThresholdIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract is above or below the clearing threshold. Where N indicates the contract is below the clearing threshold and Y indicates the contract is above the clearing threshold."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Clearing, YesNoIndicator> mmClearingThresholdIndicator = new MMBusinessAttribute<Clearing, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting1.mmClearingThresholdIndicator, RegulatoryReporting4.mmClearingThresholdIndicator, NonFinancialInstitutionSector1.mmClearingThreshold,
					RegulatoryReporting6.mmClearingThresholdIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where N indicates the contract is below the clearing threshold and Y indicates the contract is above the clearing threshold.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Clearing obj) {
			return obj.getClearingThresholdIndicator();
		}

		@Override
		public void setValue(Clearing obj, YesNoIndicator value) {
			obj.setClearingThresholdIndicator(value);
		}
	};
	protected Max35Text clearedIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearedProductIdentification
	 * RegulatoryReporting1.mmClearedProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearedProductIdentification
	 * RegulatoryReporting4.mmClearedProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearedProductIdentification
	 * RegulatoryReporting6.mmClearedProductIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference number assigned by the Central Counterparty (CCP)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Clearing, Max35Text> mmClearedIdentification = new MMBusinessAttribute<Clearing, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(RegulatoryReporting1.mmClearedProductIdentification, RegulatoryReporting4.mmClearedProductIdentification, RegulatoryReporting6.mmClearedProductIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearedIdentification";
			definition = "Reference number assigned by the Central Counterparty (CCP).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Clearing obj) {
			return obj.getClearedIdentification();
		}

		@Override
		public void setValue(Clearing obj, Max35Text value) {
			obj.setClearedIdentification(value);
		}
	};
	protected YesNoIndicator guaranteedTrade;
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
	 * {@linkplain com.tools20022.repository.msg.Clearing1#mmGuaranteedTrade
	 * Clearing1.mmGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmGuaranteedTrade
	 * Clearing2.mmGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmGuaranteedTrade
	 * Clearing4.mmGuaranteedTrade}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the central counterparty has to novate and guarantee the trade or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Clearing, YesNoIndicator> mmGuaranteedTrade = new MMBusinessAttribute<Clearing, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Clearing1.mmGuaranteedTrade, Clearing2.mmGuaranteedTrade, Clearing4.mmGuaranteedTrade);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedTrade";
			definition = "Indicates if the central counterparty has to novate and guarantee the trade or not.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Clearing obj) {
			return obj.getGuaranteedTrade();
		}

		@Override
		public void setValue(Clearing obj, YesNoIndicator value) {
			obj.setGuaranteedTrade(value);
		}
	};
	protected TradePostingCode tradePostingType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradePostingCode
	 * TradePostingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg5#mmTradePostingCode
	 * TradeLeg5.mmTradePostingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg6#mmTradePostingCode
	 * TradeLeg6.mmTradePostingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg7#mmTradePostingCode
	 * TradeLeg7.mmTradePostingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradePostingCode
	 * TradeLeg8.mmTradePostingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmTradePostingCode
	 * TradeLeg10.mmTradePostingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmTradePostingCode
	 * TradeLeg9.mmTradePostingCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePostingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how a trade is maintained in the clearing account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Clearing, TradePostingCode> mmTradePostingType = new MMBusinessAttribute<Clearing, TradePostingCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeLeg5.mmTradePostingCode, TradeLeg6.mmTradePostingCode, TradeLeg7.mmTradePostingCode, TradeLeg8.mmTradePostingCode, TradeLeg10.mmTradePostingCode, TradeLeg9.mmTradePostingCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePostingType";
			definition = "Indicates how a trade is maintained in the clearing account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradePostingCode.mmObject();
		}

		@Override
		public TradePostingCode getValue(Clearing obj) {
			return obj.getTradePostingType();
		}

		@Override
		public void setValue(Clearing obj, TradePostingCode value) {
			obj.setTradePostingType(value);
		}
	};
	protected ClearingSystem clearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ClearingSystem
	 * ClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingSystem#mmClearing
	 * ClearingSystem.mmClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Clearing
	 * Clearing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which plays a role in the clearing of securities or cash."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Clearing, Optional<ClearingSystem>> mmClearingSystem = new MMBusinessAssociationEnd<Clearing, Optional<ClearingSystem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Clearing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystem";
			definition = "Specifies the system which plays a role in the clearing of securities or cash.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmClearing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingSystem.mmObject();
		}

		@Override
		public Optional<ClearingSystem> getValue(Clearing obj) {
			return obj.getClearingSystem();
		}

		@Override
		public void setValue(Clearing obj, Optional<ClearingSystem> value) {
			obj.setClearingSystem(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Clearing";
				definition = "Mechanism allowing financial institutions that are members of a clearing house to pay and to receive the amounts linked to the transactions that they have executed on the market. The addition of all the positions per product results in one net position (due or to receive) with the clearing house or the central clearing counterparty.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ClearingSystem.mmClearing);
				derivationElement_lazy = () -> Arrays.asList(TradeLeg3.mmClearingDetails, TradeLeg6.mmClearingDetails, TradeLeg9.mmClearingDetails);
				subType_lazy = () -> Arrays.asList(SecuritiesClearing.mmObject());
				superType_lazy = () -> ObligationFulfilment.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Clearing.mmClearingThresholdIndicator, com.tools20022.repository.entity.Clearing.mmClearedIdentification,
						com.tools20022.repository.entity.Clearing.mmGuaranteedTrade, com.tools20022.repository.entity.Clearing.mmTradePostingType, com.tools20022.repository.entity.Clearing.mmClearingSystem);
				derivationComponent_lazy = () -> Arrays.asList(Clearing3.mmObject(), Clearing1.mmObject(), Clearing2.mmObject(), Clearing4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Clearing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getClearingThresholdIndicator() {
		return clearingThresholdIndicator;
	}

	public Clearing setClearingThresholdIndicator(YesNoIndicator clearingThresholdIndicator) {
		this.clearingThresholdIndicator = Objects.requireNonNull(clearingThresholdIndicator);
		return this;
	}

	public Max35Text getClearedIdentification() {
		return clearedIdentification;
	}

	public Clearing setClearedIdentification(Max35Text clearedIdentification) {
		this.clearedIdentification = Objects.requireNonNull(clearedIdentification);
		return this;
	}

	public YesNoIndicator getGuaranteedTrade() {
		return guaranteedTrade;
	}

	public Clearing setGuaranteedTrade(YesNoIndicator guaranteedTrade) {
		this.guaranteedTrade = Objects.requireNonNull(guaranteedTrade);
		return this;
	}

	public TradePostingCode getTradePostingType() {
		return tradePostingType;
	}

	public Clearing setTradePostingType(TradePostingCode tradePostingType) {
		this.tradePostingType = Objects.requireNonNull(tradePostingType);
		return this;
	}

	public Optional<ClearingSystem> getClearingSystem() {
		return clearingSystem == null ? Optional.empty() : Optional.of(clearingSystem);
	}

	public Clearing setClearingSystem(com.tools20022.repository.entity.ClearingSystem clearingSystem) {
		this.clearingSystem = clearingSystem;
		return this;
	}
}