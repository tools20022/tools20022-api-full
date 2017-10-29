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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.msg.BasicCollateralValuation1Details;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.HaircutValuation#AssetHolding
 * HaircutValuation.AssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.HaircutValuation#Haircut
 * HaircutValuation.Haircut}</li>
 * <li>{@linkplain com.tools20022.repository.entity.HaircutValuation#Sign
 * HaircutValuation.Sign}</li>
 * <li>{@linkplain com.tools20022.repository.entity.HaircutValuation#PartyRole
 * HaircutValuation.PartyRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#HaircutValuation
 * InformationPartyRole.HaircutValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Haircut
 * AssetHolding.Haircut}</li>
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
	/**
	 * Asset holding for which a haircut is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Haircut
	 * AssetHolding.Haircut}</li>
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
	public static final MMBusinessAssociationEnd AssetHolding = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> HaircutValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetHolding";
			definition = "Asset holding for which a haircut is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Haircut;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Haircut or valuation factor on the security expressed as a percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BasicCollateralValuation1Details#ValuationHaircut
	 * BasicCollateralValuation1Details.ValuationHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails3.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails5.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails1.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails4.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#Haircut
	 * FinancialInstrumentStipulations2.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails2.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails8.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#Haircut
	 * SecuritiesCollateral1.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral1#Haircut
	 * CashCollateral1.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral1#Haircut
	 * OtherCollateral1.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#CurrencyHaircut
	 * CollateralValuation1.CurrencyHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails6.SecuritiesHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SecuritiesHaircut
	 * SecuritiesFinancingTransactionDetails10.SecuritiesHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#Haircut
	 * Debt2.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#CurrencyHaircut
	 * CollateralValuation2.CurrencyHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#Haircut
	 * SecuritiesCollateral2.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral2#Haircut
	 * OtherCollateral2.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral3#Haircut
	 * CashCollateral3.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#Haircut
	 * SecuritiesCollateral3.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#Haircut
	 * OtherCollateral3.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#Haircut
	 * CashCollateral4.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral2#Haircut
	 * CashCollateral2.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#Haircut
	 * OtherCollateral4.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#Haircut
	 * SecuritiesCollateral4.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral5#Haircut
	 * CashCollateral5.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#Haircut
	 * OtherCollateral7.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#CurrencyHaircut
	 * CollateralValuation5.CurrencyHaircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#Haircut
	 * OtherCollateral6.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#Haircut
	 * SecuritiesCollateral6.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#Haircut
	 * SecuritiesCollateral5.Haircut}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5#Haircut
	 * OtherCollateral5.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#Haircut
	 * SecuritiesCollateral7.Haircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#Haircut
	 * SecuritiesCollateral8.Haircut}</li>
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
	public static final MMBusinessAttribute Haircut = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BasicCollateralValuation1Details.ValuationHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails3.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails5.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails1.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails4.SecuritiesHaircut, com.tools20022.repository.msg.FinancialInstrumentStipulations2.Haircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SecuritiesHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesCollateral1.Haircut, com.tools20022.repository.msg.CashCollateral1.Haircut, com.tools20022.repository.msg.OtherCollateral1.Haircut,
					com.tools20022.repository.msg.CollateralValuation1.CurrencyHaircut, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SecuritiesHaircut,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SecuritiesHaircut, com.tools20022.repository.msg.Debt2.Haircut, com.tools20022.repository.msg.CollateralValuation2.CurrencyHaircut,
					com.tools20022.repository.msg.SecuritiesCollateral2.Haircut, com.tools20022.repository.msg.OtherCollateral2.Haircut, com.tools20022.repository.msg.CashCollateral3.Haircut,
					com.tools20022.repository.msg.SecuritiesCollateral3.Haircut, com.tools20022.repository.msg.OtherCollateral3.Haircut, com.tools20022.repository.msg.CashCollateral4.Haircut,
					com.tools20022.repository.msg.CashCollateral2.Haircut, com.tools20022.repository.msg.OtherCollateral4.Haircut, com.tools20022.repository.msg.SecuritiesCollateral4.Haircut,
					com.tools20022.repository.msg.CashCollateral5.Haircut, com.tools20022.repository.msg.OtherCollateral7.Haircut, com.tools20022.repository.msg.CollateralValuation5.CurrencyHaircut,
					com.tools20022.repository.msg.OtherCollateral6.Haircut, com.tools20022.repository.msg.SecuritiesCollateral6.Haircut, com.tools20022.repository.msg.SecuritiesCollateral5.Haircut,
					com.tools20022.repository.msg.OtherCollateral5.Haircut, com.tools20022.repository.msg.SecuritiesCollateral7.Haircut, com.tools20022.repository.msg.SecuritiesCollateral8.Haircut);
			elementContext_lazy = () -> HaircutValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the security expressed as a percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * One of the following PlusOrMinusIndicator values must be used:<br>
	 * MeaningWhenTrue: Plus (the haircut is added)<br>
	 * MeaningWhenFalse: Minus (the haircut is deducted)
	 * <p>
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
	public static final MMBusinessAttribute Sign = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> HaircutValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sign";
			definition = "One of the following PlusOrMinusIndicator values must be used:\r\nMeaningWhenTrue: Plus (the haircut is added)\r\nMeaningWhenFalse: Minus (the haircut is deducted)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}
	};
	/**
	 * Specifies the role of a party in the haircut valuation process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#HaircutValuation
	 * InformationPartyRole.HaircutValuation}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> HaircutValuation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies the role of a party in the haircut valuation process.";
			minOccurs = 0;
			type_lazy = () -> InformationPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.HaircutValuation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "HaircutValuation";
				definition = "Basic valuation details of an asset's market value.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InformationPartyRole.HaircutValuation, com.tools20022.repository.entity.AssetHolding.Haircut);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.HaircutValuation.AssetHolding, com.tools20022.repository.entity.HaircutValuation.Haircut, com.tools20022.repository.entity.HaircutValuation.Sign,
						com.tools20022.repository.entity.HaircutValuation.PartyRole);
				derivationComponent_lazy = () -> Arrays.asList(BasicCollateralValuation1Details.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}