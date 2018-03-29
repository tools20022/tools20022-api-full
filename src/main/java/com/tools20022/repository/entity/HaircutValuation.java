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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Basic valuation details of an asset's market value.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="HaircutValuation" src="doc-files/HaircutValuation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmAssetHolding
 * HaircutValuation.mmAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
 * HaircutValuation.mmHaircut}</li>
 * <li>{@linkplain com.tools20022.repository.entity.HaircutValuation#mmSign
 * HaircutValuation.mmSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmPartyRole
 * HaircutValuation.mmPartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmHaircutValuation
 * InformationPartyRole.mmHaircutValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
 * AssetHolding.mmHaircut}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details
 * BasicCollateralValuation1Details}</li>
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
 * "HaircutValuation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Basic valuation details of an asset's market value."</li>
 * </ul>
 */
public class HaircutValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected AssetHolding assetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHaircut
	 * AssetHolding.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset holding for which a haircut is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<HaircutValuation, Optional<AssetHolding>> mmAssetHolding = new MMBusinessAssociationEnd<HaircutValuation, Optional<AssetHolding>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Asset holding for which a haircut is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> AssetHolding.mmHaircut;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}

		@Override
		public Optional<AssetHolding> getValue(HaircutValuation obj) {
			return obj.getAssetHolding();
		}

		@Override
		public void setValue(HaircutValuation obj, Optional<AssetHolding> value) {
			obj.setAssetHolding(value.orElse(null));
		}
	};
	protected PercentageRate haircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details#mmValuationHaircut
	 * BasicCollateralValuation1Details.mmValuationHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails3.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails5.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails1.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails4.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmHaircut
	 * FinancialInstrumentStipulations2.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails2.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails8.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmHaircut
	 * SecuritiesCollateral1.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#mmHaircut
	 * CashCollateral1.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral1#mmHaircut
	 * OtherCollateral1.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCurrencyHaircut
	 * CollateralValuation1.mmCurrencyHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails6.mmSecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails10.mmSecuritiesHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmHaircut
	 * Debt2.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCurrencyHaircut
	 * CollateralValuation2.mmCurrencyHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmHaircut
	 * SecuritiesCollateral2.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral2#mmHaircut
	 * OtherCollateral2.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral3#mmHaircut
	 * CashCollateral3.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmHaircut
	 * SecuritiesCollateral3.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#mmHaircut
	 * OtherCollateral3.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmHaircut
	 * CashCollateral4.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral2#mmHaircut
	 * CashCollateral2.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#mmHaircut
	 * OtherCollateral4.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmHaircut
	 * SecuritiesCollateral4.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral5#mmHaircut
	 * CashCollateral5.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#mmHaircut
	 * OtherCollateral7.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCurrencyHaircut
	 * CollateralValuation5.mmCurrencyHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#mmHaircut
	 * OtherCollateral6.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmHaircut
	 * SecuritiesCollateral6.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmHaircut
	 * SecuritiesCollateral5.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5#mmHaircut
	 * OtherCollateral5.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmHaircut
	 * SecuritiesCollateral7.mmHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmHaircut
	 * Debt3.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmHaircut
	 * SecuritiesCollateral8.mmHaircut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the security expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<HaircutValuation, PercentageRate> mmHaircut = new MMBusinessAttribute<HaircutValuation, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(BasicCollateralValuation1Details.mmValuationHaircut, SecuritiesFinancingTransactionDetails3.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails5.mmSecuritiesHaircut,
					SecuritiesFinancingTransactionDetails1.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails4.mmSecuritiesHaircut, FinancialInstrumentStipulations2.mmHaircut,
					SecuritiesFinancingTransactionDetails2.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails8.mmSecuritiesHaircut, SecuritiesCollateral1.mmHaircut, CashCollateral1.mmHaircut, OtherCollateral1.mmHaircut,
					CollateralValuation1.mmCurrencyHaircut, SecuritiesFinancingTransactionDetails6.mmSecuritiesHaircut, SecuritiesFinancingTransactionDetails10.mmSecuritiesHaircut, Debt2.mmHaircut, CollateralValuation2.mmCurrencyHaircut,
					SecuritiesCollateral2.mmHaircut, OtherCollateral2.mmHaircut, CashCollateral3.mmHaircut, SecuritiesCollateral3.mmHaircut, OtherCollateral3.mmHaircut, CashCollateral4.mmHaircut, CashCollateral2.mmHaircut,
					OtherCollateral4.mmHaircut, SecuritiesCollateral4.mmHaircut, CashCollateral5.mmHaircut, OtherCollateral7.mmHaircut, CollateralValuation5.mmCurrencyHaircut, OtherCollateral6.mmHaircut, SecuritiesCollateral6.mmHaircut,
					SecuritiesCollateral5.mmHaircut, OtherCollateral5.mmHaircut, SecuritiesCollateral7.mmHaircut, Debt3.mmHaircut, SecuritiesCollateral8.mmHaircut);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(HaircutValuation obj) {
			return obj.getHaircut();
		}

		@Override
		public void setValue(HaircutValuation obj, PercentageRate value) {
			obj.setHaircut(value);
		}
	};
	protected PlusOrMinusIndicator sign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the following PlusOrMinusIndicator values must be used:\r\nMeaningWhenTrue: Plus (the haircut is added)\r\nMeaningWhenFalse: Minus (the haircut is deducted)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<HaircutValuation, PlusOrMinusIndicator> mmSign = new MMBusinessAttribute<HaircutValuation, PlusOrMinusIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sign";
			definition = "One of the following PlusOrMinusIndicator values must be used:\r\nMeaningWhenTrue: Plus (the haircut is added)\r\nMeaningWhenFalse: Minus (the haircut is deducted)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		@Override
		public PlusOrMinusIndicator getValue(HaircutValuation obj) {
			return obj.getSign();
		}

		@Override
		public void setValue(HaircutValuation obj, PlusOrMinusIndicator value) {
			obj.setSign(value);
		}
	};
	protected List<InformationPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmHaircutValuation
	 * InformationPartyRole.mmHaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation
	 * HaircutValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of a party in the haircut valuation process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<HaircutValuation, List<InformationPartyRole>> mmPartyRole = new MMBusinessAssociationEnd<HaircutValuation, List<InformationPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.HaircutValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of a party in the haircut valuation process.";
			minOccurs = 0;
			opposite_lazy = () -> InformationPartyRole.mmHaircutValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InformationPartyRole.mmObject();
		}

		@Override
		public List<InformationPartyRole> getValue(HaircutValuation obj) {
			return obj.getPartyRole();
		}

		@Override
		public void setValue(HaircutValuation obj, List<InformationPartyRole> value) {
			obj.setPartyRole(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HaircutValuation";
				definition = "Basic valuation details of an asset's market value.";
				associationDomain_lazy = () -> Arrays.asList(InformationPartyRole.mmHaircutValuation, AssetHolding.mmHaircut);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.HaircutValuation.mmAssetHolding, com.tools20022.repository.entity.HaircutValuation.mmHaircut, com.tools20022.repository.entity.HaircutValuation.mmSign,
						com.tools20022.repository.entity.HaircutValuation.mmPartyRole);
				derivationComponent_lazy = () -> Arrays.asList(BasicCollateralValuation1Details.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return HaircutValuation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AssetHolding> getAssetHolding() {
		return assetHolding == null ? Optional.empty() : Optional.of(assetHolding);
	}

	public HaircutValuation setAssetHolding(AssetHolding assetHolding) {
		this.assetHolding = assetHolding;
		return this;
	}

	public PercentageRate getHaircut() {
		return haircut;
	}

	public HaircutValuation setHaircut(PercentageRate haircut) {
		this.haircut = Objects.requireNonNull(haircut);
		return this;
	}

	public PlusOrMinusIndicator getSign() {
		return sign;
	}

	public HaircutValuation setSign(PlusOrMinusIndicator sign) {
		this.sign = Objects.requireNonNull(sign);
		return this;
	}

	public List<InformationPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public HaircutValuation setPartyRole(List<InformationPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}
}