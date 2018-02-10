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
import com.tools20022.repository.codeset.ExposureTypeCode;
import com.tools20022.repository.codeset.RoundingMethodCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the terms used to calculate a risk exposure and its coverage.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExposureTerm" src="doc-files/ExposureTerm.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ExposureTerm#mmExposureType
 * ExposureTerm.mmExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumTransferAmount
 * ExposureTerm.mmMinimumTransferAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingAmount
 * ExposureTerm.mmRoundingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRoundingMethod
 * ExposureTerm.mmRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmRelatedCollateralAgreement
 * ExposureTerm.mmRelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumRequirementDeposit
 * ExposureTerm.mmMinimumRequirementDeposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmExposureTerm
 * CollateralAgreement.mmExposureTerm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice#mmMarginDetails
 * MarginTerms1Choice.mmMarginDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.IndependentAmountTerm
 * IndependentAmountTerm}</li>
 * <li>{@linkplain com.tools20022.repository.entity.VariationMarginTerm
 * VariationMarginTerm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType1Choice
 * ExposureType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType3Choice
 * ExposureType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType7Choice
 * ExposureType7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType2Choice
 * ExposureType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType4Choice
 * ExposureType4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType6Choice
 * ExposureType6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType9Choice
 * ExposureType9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType5Choice
 * ExposureType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin1 Margin1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.MarginTerms1Choice
 * MarginTerms1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType8Choice
 * ExposureType8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType10Choice
 * ExposureType10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType11Choice
 * ExposureType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType12Choice
 * ExposureType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType13Choice
 * ExposureType13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType14Choice
 * ExposureType14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType16Choice
 * ExposureType16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExposureType17Choice
 * ExposureType17Choice}</li>
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
 * "ExposureTerm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the terms used to calculate a risk exposure and its coverage."</li>
 * </ul>
 */
public class ExposureTerm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExposureTypeCode exposureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExposureTypeCode
	 * ExposureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType1Choice#mmCode
	 * ExposureType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType1Choice#mmProprietary
	 * ExposureType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType3Choice#mmCode
	 * ExposureType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType3Choice#mmProprietary
	 * ExposureType3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmExposureType
	 * SettlementDetails50.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType7Choice#mmCode
	 * ExposureType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType7Choice#mmProprietary
	 * ExposureType7Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmExposureType
	 * SettlementDetails51.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmExposureType
	 * SettlementDetails6.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType2Choice#mmCode
	 * ExposureType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType2Choice#mmProprietary
	 * ExposureType2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmExposureType
	 * SettlementDetails20.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType4Choice#mmCode
	 * ExposureType4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType4Choice#mmProprietary
	 * ExposureType4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmExposureType
	 * SettlementDetails24.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType6Choice#mmCode
	 * ExposureType6Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType6Choice#mmProprietary
	 * ExposureType6Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmExposureType
	 * SettlementDetails33.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmExposureType
	 * SettlementDetails45.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmExposureType
	 * SettlementDetails54.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmExposureType
	 * SettlementDetails1.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmExposureType
	 * SettlementDetails19.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmExposureType
	 * SettlementDetails22.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmExposureType
	 * SettlementDetails35.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmExposureType
	 * SettlementDetails42.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmExposureType
	 * SettlementDetails52.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmExposureType
	 * SettlementDetails8.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmExposureType
	 * SettlementDetails11.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmExposureType
	 * SettlementDetails23.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmExposureType
	 * SettlementDetails37.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmExposureType
	 * SettlementDetails44.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmExposureType
	 * SettlementDetails53.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType9Choice#mmCode
	 * ExposureType9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType9Choice#mmProprietary
	 * ExposureType9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType5Choice#mmCode
	 * ExposureType5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType5Choice#mmProprietary
	 * ExposureType5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmExposureType
	 * SettlementDetails26.mmExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#mmExposureType
	 * Obligation1.mmExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation2#mmExposureType
	 * Obligation2.mmExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Summary1#mmExposureType
	 * Summary1.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType8Choice#mmCode
	 * ExposureType8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType8Choice#mmProprietary
	 * ExposureType8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmExposureType
	 * SettlementDetails36.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmExposureType
	 * SettlementDetails67.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmExposureType
	 * SettlementDetails70.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmExposureType
	 * SettlementDetails68.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType10Choice#mmCode
	 * ExposureType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType10Choice#mmProprietary
	 * ExposureType10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmExposureType
	 * SettlementDetails69.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmExposureType
	 * SettlementDetails81.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmExposureType
	 * SettlementDetails80.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType11Choice#mmCode
	 * ExposureType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType11Choice#mmProprietary
	 * ExposureType11Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmExposureType
	 * SettlementDetails83.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmExposureType
	 * SettlementDetails85.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType12Choice#mmCode
	 * ExposureType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType12Choice#mmProprietary
	 * ExposureType12Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#mmExposureType
	 * Obligation3.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType13Choice#mmCode
	 * ExposureType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType13Choice#mmProprietary
	 * ExposureType13Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType14Choice#mmCode
	 * ExposureType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType14Choice#mmProprietary
	 * ExposureType14Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmExposureType
	 * SettlementDetails93.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmExposureType
	 * SettlementDetails90.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmExposureType
	 * SettlementDetails94.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmExposureType
	 * SettlementDetails95.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice#mmCode
	 * ExposureType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice#mmProprietary
	 * ExposureType16Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmExposureType
	 * SettlementDetails101.mmExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#mmExposureType
	 * Obligation4.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmExposureType
	 * SettlementDetails111.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmExposureType
	 * SettlementDetails112.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmExposureType
	 * SettlementDetails110.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmExposureType
	 * SettlementDetails115.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmExposureType
	 * SettlementDetails113.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType17Choice#mmCode
	 * ExposureType17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType17Choice#mmProprietary
	 * ExposureType17Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmExposureType
	 * SettlementDetails128.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmExposureType
	 * SettlementDetails120.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmExposureType
	 * SettlementDetails119.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmExposureType
	 * SettlementDetails122.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmExposureType
	 * SettlementDetails121.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmExposureType
	 * SettlementDetails134.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmExposureType
	 * SettlementDetails137.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmExposureType
	 * SettlementDetails132.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmExposureType
	 * SettlementDetails138.mmExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmExposureType
	 * SettlementDetails133.mmExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#mmExposureType
	 * Obligation5.mmExposureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the underlying business area/type of trade causing the collateral movement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExposureType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ExposureType1Choice.mmCode, ExposureType1Choice.mmProprietary, ExposureType3Choice.mmCode, ExposureType3Choice.mmProprietary, SettlementDetails50.mmExposureType, ExposureType7Choice.mmCode,
					ExposureType7Choice.mmProprietary, SettlementDetails51.mmExposureType, SettlementDetails6.mmExposureType, ExposureType2Choice.mmCode, ExposureType2Choice.mmProprietary, SettlementDetails20.mmExposureType,
					ExposureType4Choice.mmCode, ExposureType4Choice.mmProprietary, SettlementDetails24.mmExposureType, ExposureType6Choice.mmCode, ExposureType6Choice.mmProprietary, SettlementDetails33.mmExposureType,
					SettlementDetails45.mmExposureType, SettlementDetails54.mmExposureType, SettlementDetails1.mmExposureType, SettlementDetails19.mmExposureType, SettlementDetails22.mmExposureType, SettlementDetails35.mmExposureType,
					SettlementDetails42.mmExposureType, SettlementDetails52.mmExposureType, SettlementDetails8.mmExposureType, SettlementDetails11.mmExposureType, SettlementDetails23.mmExposureType, SettlementDetails37.mmExposureType,
					SettlementDetails44.mmExposureType, SettlementDetails53.mmExposureType, ExposureType9Choice.mmCode, ExposureType9Choice.mmProprietary, ExposureType5Choice.mmCode, ExposureType5Choice.mmProprietary,
					SettlementDetails26.mmExposureType, Obligation1.mmExposureType, Obligation2.mmExposureType, Summary1.mmExposureType, ExposureType8Choice.mmCode, ExposureType8Choice.mmProprietary, SettlementDetails36.mmExposureType,
					SettlementDetails67.mmExposureType, SettlementDetails70.mmExposureType, SettlementDetails68.mmExposureType, ExposureType10Choice.mmCode, ExposureType10Choice.mmProprietary, SettlementDetails69.mmExposureType,
					SettlementDetails81.mmExposureType, SettlementDetails80.mmExposureType, ExposureType11Choice.mmCode, ExposureType11Choice.mmProprietary, SettlementDetails83.mmExposureType, SettlementDetails85.mmExposureType,
					ExposureType12Choice.mmCode, ExposureType12Choice.mmProprietary, Obligation3.mmExposureType, ExposureType13Choice.mmCode, ExposureType13Choice.mmProprietary, ExposureType14Choice.mmCode,
					ExposureType14Choice.mmProprietary, SettlementDetails93.mmExposureType, SettlementDetails90.mmExposureType, SettlementDetails94.mmExposureType, SettlementDetails95.mmExposureType, ExposureType16Choice.mmCode,
					ExposureType16Choice.mmProprietary, SettlementDetails101.mmExposureType, Obligation4.mmExposureType, SettlementDetails111.mmExposureType, SettlementDetails112.mmExposureType, SettlementDetails110.mmExposureType,
					SettlementDetails115.mmExposureType, SettlementDetails113.mmExposureType, ExposureType17Choice.mmCode, ExposureType17Choice.mmProprietary, SettlementDetails128.mmExposureType, SettlementDetails120.mmExposureType,
					SettlementDetails119.mmExposureType, SettlementDetails122.mmExposureType, SettlementDetails121.mmExposureType, SettlementDetails134.mmExposureType, SettlementDetails137.mmExposureType,
					SettlementDetails132.mmExposureType, SettlementDetails138.mmExposureType, SettlementDetails133.mmExposureType, Obligation5.mmExposureType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExposureTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureTerm.class.getMethod("getExposureType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount minimumTransferAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmMinimumTransferAmount
	 * VariationMargin1.mmMinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmMinimumTransferAmount
	 * SegregatedIndependentAmountMargin1.mmMinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmMinimumTransferAmount
	 * SummaryAmounts1.mmMinimumTransferAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumTransferAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumTransferAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmMinimumTransferAmount, SegregatedIndependentAmountMargin1.mmMinimumTransferAmount, SummaryAmounts1.mmMinimumTransferAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureTerm.class.getMethod("getMinimumTransferAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount roundingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmRoundingAmount
	 * VariationMargin1.mmRoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmRoundingAmount
	 * SegregatedIndependentAmountMargin1.mmRoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmRoundingAmount
	 * SummaryAmounts1.mmRoundingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount specified to avoid the need to transfer uneven amounts of collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRoundingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmRoundingAmount, SegregatedIndependentAmountMargin1.mmRoundingAmount, SummaryAmounts1.mmRoundingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureTerm.class.getMethod("getRoundingAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RoundingMethodCode roundingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingMethodCode
	 * RoundingMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmRoundingMethod
	 * VariationMargin1.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#mmRoundingMethod
	 * SegregatedIndependentAmountMargin1.mmRoundingMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines how the rounding amount is applied in the calculation to avoid the need to transfer uneven amounts of collateral. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRoundingMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmRoundingMethod, SegregatedIndependentAmountMargin1.mmRoundingMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingMethod";
			definition = "Defines how the rounding amount is applied in the calculation to avoid the need to transfer uneven amounts of collateral. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureTerm.class.getMethod("getRoundingMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralAgreement relatedCollateralAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmExposureTerm
	 * CollateralAgreement.mmExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement in which the exposure terms are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Agreement in which the exposure terms are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmExposureTerm;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumRequirementDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Margin2#mmMinimumRequirementDeposit
	 * Margin2.mmMinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#mmMinimumRequirementDeposit
	 * MarginCalculation1.mmMinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#mmMinimumRequirementDeposit
	 * MarginCalculation2.mmMinimumRequirementDeposit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm ExposureTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRequirementDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum requirement for a participant if their requirement falls below a specific amount set by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMinimumRequirementDeposit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Margin2.mmMinimumRequirementDeposit, MarginCalculation1.mmMinimumRequirementDeposit, MarginCalculation2.mmMinimumRequirementDeposit);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExposureTerm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement for a participant if their requirement falls below a specific amount set by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ExposureTerm.class.getMethod("getMinimumRequirementDeposit", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExposureTerm";
				definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralAgreement.mmExposureTerm);
				derivationElement_lazy = () -> Arrays.asList(MarginTerms1Choice.mmMarginDetails);
				subType_lazy = () -> Arrays.asList(IndependentAmountTerm.mmObject(), VariationMarginTerm.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.mmExposureType, com.tools20022.repository.entity.ExposureTerm.mmMinimumTransferAmount,
						com.tools20022.repository.entity.ExposureTerm.mmRoundingAmount, com.tools20022.repository.entity.ExposureTerm.mmRoundingMethod, com.tools20022.repository.entity.ExposureTerm.mmRelatedCollateralAgreement,
						com.tools20022.repository.entity.ExposureTerm.mmMinimumRequirementDeposit);
				derivationComponent_lazy = () -> Arrays.asList(ExposureType1Choice.mmObject(), ExposureType3Choice.mmObject(), ExposureType7Choice.mmObject(), ExposureType2Choice.mmObject(), ExposureType4Choice.mmObject(),
						ExposureType6Choice.mmObject(), ExposureType9Choice.mmObject(), ExposureType5Choice.mmObject(), Margin1.mmObject(), MarginTerms1Choice.mmObject(), ExposureType8Choice.mmObject(), ExposureType10Choice.mmObject(),
						ExposureType11Choice.mmObject(), ExposureType12Choice.mmObject(), ExposureType13Choice.mmObject(), ExposureType14Choice.mmObject(), ExposureType16Choice.mmObject(), ExposureType17Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExposureTerm.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExposureTypeCode getExposureType() {
		return exposureType;
	}

	public ExposureTerm setExposureType(ExposureTypeCode exposureType) {
		this.exposureType = Objects.requireNonNull(exposureType);
		return this;
	}

	public ActiveCurrencyAndAmount getMinimumTransferAmount() {
		return minimumTransferAmount;
	}

	public ExposureTerm setMinimumTransferAmount(ActiveCurrencyAndAmount minimumTransferAmount) {
		this.minimumTransferAmount = Objects.requireNonNull(minimumTransferAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getRoundingAmount() {
		return roundingAmount;
	}

	public ExposureTerm setRoundingAmount(ActiveCurrencyAndAmount roundingAmount) {
		this.roundingAmount = Objects.requireNonNull(roundingAmount);
		return this;
	}

	public RoundingMethodCode getRoundingMethod() {
		return roundingMethod;
	}

	public ExposureTerm setRoundingMethod(RoundingMethodCode roundingMethod) {
		this.roundingMethod = Objects.requireNonNull(roundingMethod);
		return this;
	}

	public Optional<CollateralAgreement> getRelatedCollateralAgreement() {
		return relatedCollateralAgreement == null ? Optional.empty() : Optional.of(relatedCollateralAgreement);
	}

	public ExposureTerm setRelatedCollateralAgreement(com.tools20022.repository.entity.CollateralAgreement relatedCollateralAgreement) {
		this.relatedCollateralAgreement = relatedCollateralAgreement;
		return this;
	}

	public ActiveCurrencyAndAmount getMinimumRequirementDeposit() {
		return minimumRequirementDeposit;
	}

	public ExposureTerm setMinimumRequirementDeposit(ActiveCurrencyAndAmount minimumRequirementDeposit) {
		this.minimumRequirementDeposit = Objects.requireNonNull(minimumRequirementDeposit);
		return this;
	}
}