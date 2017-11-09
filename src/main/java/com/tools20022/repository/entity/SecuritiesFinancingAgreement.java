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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DeliveryTypeCode;
import com.tools20022.repository.codeset.TerminationTypeCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Agreement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Agreement1;
import com.tools20022.repository.msg.Agreement3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Contractual details related to the agreement between parties.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesFinancingAgreement"
 * src="doc-files/SecuritiesFinancingAgreement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement3 Agreement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Agreement1 Agreement1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
 * SecuritiesFinancing.mmFinancingAgreement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Agreement
 * Agreement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmSecuritiesFinancingTrade
 * SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmCurrency
 * SecuritiesFinancingAgreement.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmTerminationType
 * SecuritiesFinancingAgreement.mmTerminationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmDeliveryType
 * SecuritiesFinancingAgreement.mmDeliveryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement#mmMarginRatio
 * SecuritiesFinancingAgreement.mmMarginRatio}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingAgreement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contractual details related to the agreement between parties."
 * </li>
 * </ul>
 */
public class SecuritiesFinancingAgreement extends Agreement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesFinancing securitiesFinancingTrade;
	/**
	 * Specifies a trade using the related financing agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmFinancingAgreement
	 * SecuritiesFinancing.mmFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a trade using the related financing agreement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesFinancingTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancingTrade";
			definition = "Specifies a trade using the related financing agreement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmFinancingAgreement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Contractual currency forming the basis of a financing agreement and
	 * associated transactions. Usually, but not always, the same as the trade
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmCurrency
	 * Agreement3.mmCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#mmCurrency
	 * Agreement1.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement3.mmCurrency, Agreement1.mmCurrency);
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Contractual currency forming the basis of a financing agreement and associated transactions. Usually, but not always, the same as the trade currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected TerminationTypeCode terminationType;
	/**
	 * Type of financing termination.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminationTypeCode
	 * TerminationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmClosingType
	 * Agreement3.mmClosingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Agreement1#mmTerminationType
	 * Agreement1.mmTerminationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of financing termination."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTerminationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement3.mmClosingType, Agreement1.mmTerminationType);
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminationType";
			definition = "Type of financing termination.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminationTypeCode.mmObject();
		}
	};
	protected DeliveryTypeCode deliveryType;
	/**
	 * Identifies type of settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryTypeCode
	 * DeliveryTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmDeliveryType
	 * Agreement3.mmDeliveryType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#mmDeliveryType
	 * Agreement1.mmDeliveryType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies type of settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeliveryType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement3.mmDeliveryType, Agreement1.mmDeliveryType);
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveryType";
			definition = "Identifies type of settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryTypeCode.mmObject();
		}
	};
	protected PercentageRate marginRatio;
	/**
	 * Fraction of the cash consideration that must be collateralized, expressed
	 * as a percent. A margin ratio of 02% indicates that the value of the
	 * collateral (after deducting for "haircut") must exceed the cash
	 * consideration by 2%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancingAgreement
	 * SecuritiesFinancingAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement3#mmMarginRatio
	 * Agreement3.mmMarginRatio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Agreement1#mmMarginRatio
	 * Agreement1.mmMarginRatio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarginRatio = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Agreement3.mmMarginRatio, Agreement1.mmMarginRatio);
			elementContext_lazy = () -> SecuritiesFinancingAgreement.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginRatio";
			definition = "Fraction of the cash consideration that must be collateralized, expressed as a percent. A margin ratio of 02% indicates that the value of the collateral (after deducting for \"haircut\") must exceed the cash consideration by 2%.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingAgreement";
				definition = "Contractual details related to the agreement between parties.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesFinancing.mmFinancingAgreement);
				superType_lazy = () -> Agreement.mmObject();
				element_lazy = () -> Arrays.asList(SecuritiesFinancingAgreement.mmSecuritiesFinancingTrade, SecuritiesFinancingAgreement.mmCurrency, SecuritiesFinancingAgreement.mmTerminationType,
						SecuritiesFinancingAgreement.mmDeliveryType, SecuritiesFinancingAgreement.mmMarginRatio);
				derivationComponent_lazy = () -> Arrays.asList(Agreement3.mmObject(), Agreement1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesFinancing getSecuritiesFinancingTrade() {
		return securitiesFinancingTrade;
	}

	public void setSecuritiesFinancingTrade(com.tools20022.repository.entity.SecuritiesFinancing securitiesFinancingTrade) {
		this.securitiesFinancingTrade = securitiesFinancingTrade;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public TerminationTypeCode getTerminationType() {
		return terminationType;
	}

	public void setTerminationType(TerminationTypeCode terminationType) {
		this.terminationType = terminationType;
	}

	public DeliveryTypeCode getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(DeliveryTypeCode deliveryType) {
		this.deliveryType = deliveryType;
	}

	public PercentageRate getMarginRatio() {
		return marginRatio;
	}

	public void setMarginRatio(PercentageRate marginRatio) {
		this.marginRatio = marginRatio;
	}
}