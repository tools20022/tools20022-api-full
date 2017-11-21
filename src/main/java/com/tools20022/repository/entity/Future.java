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
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.choice.FinancialInstrumentProperties1Choice;
import com.tools20022.repository.codeset.StandardisationCode;
import com.tools20022.repository.codeset.UnderlyingTypeCode;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters for contracts which obligate the buyer to receive and the seller
 * to deliver in the future the assets specified at an agreed price.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Future" src="doc-files/Future.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmFutureDate
 * Future.mmFutureDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmMinimumSize
 * Future.mmMinimumSize}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmUnitOfMeasure
 * Future.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmLastDeliveryDate
 * Future.mmLastDeliveryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmStandardisation
 * Future.mmStandardisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmUnderlyingType
 * Future.mmUnderlyingType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future#mmFutureRule
 * Future.mmFutureRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Future1 Future1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2 Future2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FutureRule#mmRelatedFutureInstrument
 * FutureRule.mmRelatedFutureInstrument}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice#mmFuture
 * FinancialInstrumentProperties1Choice.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmFloatingRateNote
 * UnsecuredMarketTransaction1.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmFloatingRateNote
 * UnsecuredMarketTransaction2.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmFloatingRateNote
 * UnsecuredMarketTransaction3.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmContractForDifference
 * Derivative2Choice.mmContractForDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmFloatingRateNote
 * UnsecuredMarketTransaction4.mmFloatingRateNote}</li>
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
 * "Future"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price."
 * </li>
 * </ul>
 */
public class Future extends Derivative {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime futureDate;
	/**
	 * Date on which future contracts settle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmFutureDate
	 * Future1.mmFutureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFutureDate
	 * FutureOrOptionDetails1.mmFutureDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmFutureDate
	 * Future2.mmFutureDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which future contracts settle."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFutureDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmFutureDate, FutureOrOptionDetails1.mmFutureDate, Future2.mmFutureDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Future.class.getMethod("getFutureDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount minimumSize;
	/**
	 * Specifies the minimum ratio or multiply factor used to convert from
	 * contracts to shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmMinimumSize
	 * Future1.mmMinimumSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmMinimumSize
	 * FutureOrOptionDetails1.mmMinimumSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmMinimumSize
	 * Future2.mmMinimumSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumSize = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmMinimumSize, FutureOrOptionDetails1.mmMinimumSize, Future2.mmMinimumSize);
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Future.class.getMethod("getMinimumSize", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UnitOfMeasureCode unitOfMeasure;
	/**
	 * Used to indicate the size of the underlying commodity on which the
	 * contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude
	 * oil, 1000 bushels of corn, etc.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmUnitOfMeasure
	 * Future1.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmUnitOfMeasure
	 * FutureOrOptionDetails1.mmUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmUnitOfMeasure
	 * Future2.mmUnitOfMeasure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitOfMeasure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmUnitOfMeasure, FutureOrOptionDetails1.mmUnitOfMeasure, Future2.mmUnitOfMeasure);
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Future.class.getMethod("getUnitOfMeasure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime lastDeliveryDate;
	/**
	 * Last date/time by which the option for physical delivery may still be
	 * exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmLastDeliveryDate
	 * FutureOrOptionDetails1.mmLastDeliveryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastDeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time by which the option for physical delivery may still be exercised."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmLastDeliveryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmLastDeliveryDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastDeliveryDate";
			definition = "Last date/time by which the option for physical delivery may still be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Future.class.getMethod("getLastDeliveryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandardisationCode standardisation;
	/**
	 * Specifies whether the terms of the security (underlying instruments,
	 * expiration date, contract size) are defined according to the exchange
	 * specifications or whether they can be user defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
	 * StandardisationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStandardisation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Future.class.getMethod("getStandardisation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UnderlyingTypeCode underlyingType;
	/**
	 * Specifies the type of underlying to which the option relates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeCode
	 * UnderlyingTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of underlying to which the option relates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnderlyingType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Future.class.getMethod("getUnderlyingType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FutureRule futureRule;
	/**
	 * Rule attached to a future on debt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule#mmRelatedFutureInstrument
	 * FutureRule.mmRelatedFutureInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FutureRule
	 * FutureRule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Future
	 * Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rule attached to a future on debt."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFutureRule = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FutureRule";
			definition = "Rule attached to a future on debt.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FutureRule.mmRelatedFutureInstrument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Future";
				definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FutureRule.mmRelatedFutureInstrument);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentProperties1Choice.mmFuture, UnsecuredMarketTransaction1.mmFloatingRateNote, UnsecuredMarketTransaction2.mmFloatingRateNote,
						UnsecuredMarketTransaction3.mmFloatingRateNote, Derivative2Choice.mmContractForDifference, UnsecuredMarketTransaction4.mmFloatingRateNote);
				superType_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Future.mmFutureDate, com.tools20022.repository.entity.Future.mmMinimumSize, com.tools20022.repository.entity.Future.mmUnitOfMeasure,
						com.tools20022.repository.entity.Future.mmLastDeliveryDate, com.tools20022.repository.entity.Future.mmStandardisation, com.tools20022.repository.entity.Future.mmUnderlyingType,
						com.tools20022.repository.entity.Future.mmFutureRule);
				derivationComponent_lazy = () -> Arrays.asList(Future1.mmObject(), Future2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Future.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(ISODateTime futureDate) {
		this.futureDate = futureDate;
	}

	public CurrencyAndAmount getMinimumSize() {
		return minimumSize;
	}

	public void setMinimumSize(CurrencyAndAmount minimumSize) {
		this.minimumSize = minimumSize;
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureCode unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public ISODateTime getLastDeliveryDate() {
		return lastDeliveryDate;
	}

	public void setLastDeliveryDate(ISODateTime lastDeliveryDate) {
		this.lastDeliveryDate = lastDeliveryDate;
	}

	public StandardisationCode getStandardisation() {
		return standardisation;
	}

	public void setStandardisation(StandardisationCode standardisation) {
		this.standardisation = standardisation;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return underlyingType;
	}

	public void setUnderlyingType(UnderlyingTypeCode underlyingType) {
		this.underlyingType = underlyingType;
	}

	public FutureRule getFutureRule() {
		return futureRule;
	}

	public void setFutureRule(com.tools20022.repository.entity.FutureRule futureRule) {
		this.futureRule = futureRule;
	}
}