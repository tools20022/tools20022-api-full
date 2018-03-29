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
import com.tools20022.repository.entity.FutureRule;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Derivative
 * Derivative}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Future1 Future1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2 Future2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future3 Future3}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmFutureDate
	 * Future1.mmFutureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmFutureDate
	 * FutureOrOptionDetails1.mmFutureDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmFutureDate
	 * Future2.mmFutureDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmFutureDate
	 * Future3.mmFutureDate}</li>
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
	public static final MMBusinessAttribute<Future, ISODateTime> mmFutureDate = new MMBusinessAttribute<Future, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmFutureDate, FutureOrOptionDetails1.mmFutureDate, Future2.mmFutureDate, Future3.mmFutureDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Future obj) {
			return obj.getFutureDate();
		}

		@Override
		public void setValue(Future obj, ISODateTime value) {
			obj.setFutureDate(value);
		}
	};
	protected CurrencyAndAmount minimumSize;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmMinimumSize
	 * Future3.mmMinimumSize}</li>
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
	public static final MMBusinessAttribute<Future, CurrencyAndAmount> mmMinimumSize = new MMBusinessAttribute<Future, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmMinimumSize, FutureOrOptionDetails1.mmMinimumSize, Future2.mmMinimumSize, Future3.mmMinimumSize);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Future obj) {
			return obj.getMinimumSize();
		}

		@Override
		public void setValue(Future obj, CurrencyAndAmount value) {
			obj.setMinimumSize(value);
		}
	};
	protected UnitOfMeasureCode unitOfMeasure;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmUnitOfMeasure
	 * Future3.mmUnitOfMeasure}</li>
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
	public static final MMBusinessAttribute<Future, UnitOfMeasureCode> mmUnitOfMeasure = new MMBusinessAttribute<Future, UnitOfMeasureCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Future1.mmUnitOfMeasure, FutureOrOptionDetails1.mmUnitOfMeasure, Future2.mmUnitOfMeasure, Future3.mmUnitOfMeasure);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the size of the underlying commodity on which the contract is based (e.g., 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}

		@Override
		public UnitOfMeasureCode getValue(Future obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(Future obj, UnitOfMeasureCode value) {
			obj.setUnitOfMeasure(value);
		}
	};
	protected ISODateTime lastDeliveryDate;
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
	public static final MMBusinessAttribute<Future, ISODateTime> mmLastDeliveryDate = new MMBusinessAttribute<Future, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(FutureOrOptionDetails1.mmLastDeliveryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LastDeliveryDate";
			definition = "Last date/time by which the option for physical delivery may still be exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Future obj) {
			return obj.getLastDeliveryDate();
		}

		@Override
		public void setValue(Future obj, ISODateTime value) {
			obj.setLastDeliveryDate(value);
		}
	};
	protected StandardisationCode standardisation;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Future, StandardisationCode> mmStandardisation = new MMBusinessAttribute<Future, StandardisationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Standardisation";
			definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StandardisationCode.mmObject();
		}

		@Override
		public StandardisationCode getValue(Future obj) {
			return obj.getStandardisation();
		}

		@Override
		public void setValue(Future obj, StandardisationCode value) {
			obj.setStandardisation(value);
		}
	};
	protected UnderlyingTypeCode underlyingType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<Future, UnderlyingTypeCode> mmUnderlyingType = new MMBusinessAttribute<Future, UnderlyingTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingType";
			definition = "Specifies the type of underlying to which the option relates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingTypeCode.mmObject();
		}

		@Override
		public UnderlyingTypeCode getValue(Future obj) {
			return obj.getUnderlyingType();
		}

		@Override
		public void setValue(Future obj, UnderlyingTypeCode value) {
			obj.setUnderlyingType(value);
		}
	};
	protected FutureRule futureRule;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<Future, com.tools20022.repository.entity.FutureRule> mmFutureRule = new MMBusinessAssociationEnd<Future, com.tools20022.repository.entity.FutureRule>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Future.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FutureRule";
			definition = "Rule attached to a future on debt.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FutureRule.mmRelatedFutureInstrument;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FutureRule.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.FutureRule getValue(Future obj) {
			return obj.getFutureRule();
		}

		@Override
		public void setValue(Future obj, com.tools20022.repository.entity.FutureRule value) {
			obj.setFutureRule(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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
				derivationComponent_lazy = () -> Arrays.asList(Future1.mmObject(), Future2.mmObject(), Future3.mmObject());
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

	public Future setFutureDate(ISODateTime futureDate) {
		this.futureDate = Objects.requireNonNull(futureDate);
		return this;
	}

	public CurrencyAndAmount getMinimumSize() {
		return minimumSize;
	}

	public Future setMinimumSize(CurrencyAndAmount minimumSize) {
		this.minimumSize = Objects.requireNonNull(minimumSize);
		return this;
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public Future setUnitOfMeasure(UnitOfMeasureCode unitOfMeasure) {
		this.unitOfMeasure = Objects.requireNonNull(unitOfMeasure);
		return this;
	}

	public ISODateTime getLastDeliveryDate() {
		return lastDeliveryDate;
	}

	public Future setLastDeliveryDate(ISODateTime lastDeliveryDate) {
		this.lastDeliveryDate = Objects.requireNonNull(lastDeliveryDate);
		return this;
	}

	public StandardisationCode getStandardisation() {
		return standardisation;
	}

	public Future setStandardisation(StandardisationCode standardisation) {
		this.standardisation = Objects.requireNonNull(standardisation);
		return this;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return underlyingType;
	}

	public Future setUnderlyingType(UnderlyingTypeCode underlyingType) {
		this.underlyingType = Objects.requireNonNull(underlyingType);
		return this;
	}

	public FutureRule getFutureRule() {
		return futureRule;
	}

	public Future setFutureRule(com.tools20022.repository.entity.FutureRule futureRule) {
		this.futureRule = Objects.requireNonNull(futureRule);
		return this;
	}
}