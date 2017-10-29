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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ExposureTypeCode;
import com.tools20022.repository.codeset.RoundingMethodCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.msg.Margin1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.ExposureTerm#ExposureType
 * ExposureTerm.ExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#MinimumTransferAmount
 * ExposureTerm.MinimumTransferAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ExposureTerm#RoundingAmount
 * ExposureTerm.RoundingAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ExposureTerm#RoundingMethod
 * ExposureTerm.RoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#RelatedCollateralAgreement
 * ExposureTerm.RelatedCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExposureTerm#MinimumRequirementDeposit
 * ExposureTerm.MinimumRequirementDeposit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#ExposureTerm
 * CollateralAgreement.ExposureTerm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarginTerms1Choice#MarginDetails
 * MarginTerms1Choice.MarginDetails}</li>
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
	/**
	 * Specifies the underlying business area/type of trade causing the
	 * collateral movement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.ExposureType1Choice#Code
	 * ExposureType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType1Choice#Proprietary
	 * ExposureType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType3Choice#Code
	 * ExposureType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType3Choice#Proprietary
	 * ExposureType3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#ExposureType
	 * SettlementDetails50.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType7Choice#Code
	 * ExposureType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType7Choice#Proprietary
	 * ExposureType7Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#ExposureType
	 * SettlementDetails51.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#ExposureType
	 * SettlementDetails6.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType2Choice#Code
	 * ExposureType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType2Choice#Proprietary
	 * ExposureType2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#ExposureType
	 * SettlementDetails20.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType4Choice#Code
	 * ExposureType4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType4Choice#Proprietary
	 * ExposureType4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#ExposureType
	 * SettlementDetails24.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType6Choice#Code
	 * ExposureType6Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType6Choice#Proprietary
	 * ExposureType6Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#ExposureType
	 * SettlementDetails33.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#ExposureType
	 * SettlementDetails45.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#ExposureType
	 * SettlementDetails54.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#ExposureType
	 * SettlementDetails1.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#ExposureType
	 * SettlementDetails19.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#ExposureType
	 * SettlementDetails22.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#ExposureType
	 * SettlementDetails35.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#ExposureType
	 * SettlementDetails42.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#ExposureType
	 * SettlementDetails52.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#ExposureType
	 * SettlementDetails8.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#ExposureType
	 * SettlementDetails11.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#ExposureType
	 * SettlementDetails23.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#ExposureType
	 * SettlementDetails37.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#ExposureType
	 * SettlementDetails44.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#ExposureType
	 * SettlementDetails53.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType9Choice#Code
	 * ExposureType9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType9Choice#Proprietary
	 * ExposureType9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType5Choice#Code
	 * ExposureType5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType5Choice#Proprietary
	 * ExposureType5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#ExposureType
	 * SettlementDetails26.ExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation1#ExposureType
	 * Obligation1.ExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation2#ExposureType
	 * Obligation2.ExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Summary1#ExposureType
	 * Summary1.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType8Choice#Code
	 * ExposureType8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType8Choice#Proprietary
	 * ExposureType8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#ExposureType
	 * SettlementDetails36.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#ExposureType
	 * SettlementDetails67.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#ExposureType
	 * SettlementDetails70.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#ExposureType
	 * SettlementDetails68.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType10Choice#Code
	 * ExposureType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType10Choice#Proprietary
	 * ExposureType10Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#ExposureType
	 * SettlementDetails69.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#ExposureType
	 * SettlementDetails81.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#ExposureType
	 * SettlementDetails80.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType11Choice#Code
	 * ExposureType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType11Choice#Proprietary
	 * ExposureType11Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#ExposureType
	 * SettlementDetails83.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#ExposureType
	 * SettlementDetails85.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType12Choice#Code
	 * ExposureType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType12Choice#Proprietary
	 * ExposureType12Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation3#ExposureType
	 * Obligation3.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType13Choice#Code
	 * ExposureType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType13Choice#Proprietary
	 * ExposureType13Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType14Choice#Code
	 * ExposureType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType14Choice#Proprietary
	 * ExposureType14Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#ExposureType
	 * SettlementDetails93.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#ExposureType
	 * SettlementDetails90.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#ExposureType
	 * SettlementDetails94.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#ExposureType
	 * SettlementDetails95.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice#Code
	 * ExposureType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType16Choice#Proprietary
	 * ExposureType16Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#ExposureType
	 * SettlementDetails101.ExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation4#ExposureType
	 * Obligation4.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#ExposureType
	 * SettlementDetails111.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#ExposureType
	 * SettlementDetails112.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#ExposureType
	 * SettlementDetails110.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#ExposureType
	 * SettlementDetails115.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#ExposureType
	 * SettlementDetails113.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType17Choice#Code
	 * ExposureType17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExposureType17Choice#Proprietary
	 * ExposureType17Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#ExposureType
	 * SettlementDetails128.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#ExposureType
	 * SettlementDetails120.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#ExposureType
	 * SettlementDetails119.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#ExposureType
	 * SettlementDetails122.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#ExposureType
	 * SettlementDetails121.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#ExposureType
	 * SettlementDetails134.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#ExposureType
	 * SettlementDetails137.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#ExposureType
	 * SettlementDetails132.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#ExposureType
	 * SettlementDetails138.ExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#ExposureType
	 * SettlementDetails133.ExposureType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Obligation5#ExposureType
	 * Obligation5.ExposureType}</li>
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
	public static final MMBusinessAttribute ExposureType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ExposureType1Choice.Code, com.tools20022.repository.choice.ExposureType1Choice.Proprietary, com.tools20022.repository.choice.ExposureType3Choice.Code,
					com.tools20022.repository.choice.ExposureType3Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails50.ExposureType, com.tools20022.repository.choice.ExposureType7Choice.Code,
					com.tools20022.repository.choice.ExposureType7Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails51.ExposureType, com.tools20022.repository.msg.SettlementDetails6.ExposureType,
					com.tools20022.repository.choice.ExposureType2Choice.Code, com.tools20022.repository.choice.ExposureType2Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails20.ExposureType,
					com.tools20022.repository.choice.ExposureType4Choice.Code, com.tools20022.repository.choice.ExposureType4Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails24.ExposureType,
					com.tools20022.repository.choice.ExposureType6Choice.Code, com.tools20022.repository.choice.ExposureType6Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails33.ExposureType,
					com.tools20022.repository.msg.SettlementDetails45.ExposureType, com.tools20022.repository.msg.SettlementDetails54.ExposureType, com.tools20022.repository.msg.SettlementDetails1.ExposureType,
					com.tools20022.repository.msg.SettlementDetails19.ExposureType, com.tools20022.repository.msg.SettlementDetails22.ExposureType, com.tools20022.repository.msg.SettlementDetails35.ExposureType,
					com.tools20022.repository.msg.SettlementDetails42.ExposureType, com.tools20022.repository.msg.SettlementDetails52.ExposureType, com.tools20022.repository.msg.SettlementDetails8.ExposureType,
					com.tools20022.repository.msg.SettlementDetails11.ExposureType, com.tools20022.repository.msg.SettlementDetails23.ExposureType, com.tools20022.repository.msg.SettlementDetails37.ExposureType,
					com.tools20022.repository.msg.SettlementDetails44.ExposureType, com.tools20022.repository.msg.SettlementDetails53.ExposureType, com.tools20022.repository.choice.ExposureType9Choice.Code,
					com.tools20022.repository.choice.ExposureType9Choice.Proprietary, com.tools20022.repository.choice.ExposureType5Choice.Code, com.tools20022.repository.choice.ExposureType5Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails26.ExposureType, com.tools20022.repository.msg.Obligation1.ExposureType, com.tools20022.repository.msg.Obligation2.ExposureType,
					com.tools20022.repository.msg.Summary1.ExposureType, com.tools20022.repository.choice.ExposureType8Choice.Code, com.tools20022.repository.choice.ExposureType8Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails36.ExposureType, com.tools20022.repository.msg.SettlementDetails67.ExposureType, com.tools20022.repository.msg.SettlementDetails70.ExposureType,
					com.tools20022.repository.msg.SettlementDetails68.ExposureType, com.tools20022.repository.choice.ExposureType10Choice.Code, com.tools20022.repository.choice.ExposureType10Choice.Proprietary,
					com.tools20022.repository.msg.SettlementDetails69.ExposureType, com.tools20022.repository.msg.SettlementDetails81.ExposureType, com.tools20022.repository.msg.SettlementDetails80.ExposureType,
					com.tools20022.repository.choice.ExposureType11Choice.Code, com.tools20022.repository.choice.ExposureType11Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails83.ExposureType,
					com.tools20022.repository.msg.SettlementDetails85.ExposureType, com.tools20022.repository.choice.ExposureType12Choice.Code, com.tools20022.repository.choice.ExposureType12Choice.Proprietary,
					com.tools20022.repository.msg.Obligation3.ExposureType, com.tools20022.repository.choice.ExposureType13Choice.Code, com.tools20022.repository.choice.ExposureType13Choice.Proprietary,
					com.tools20022.repository.choice.ExposureType14Choice.Code, com.tools20022.repository.choice.ExposureType14Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails93.ExposureType,
					com.tools20022.repository.msg.SettlementDetails90.ExposureType, com.tools20022.repository.msg.SettlementDetails94.ExposureType, com.tools20022.repository.msg.SettlementDetails95.ExposureType,
					com.tools20022.repository.choice.ExposureType16Choice.Code, com.tools20022.repository.choice.ExposureType16Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails101.ExposureType,
					com.tools20022.repository.msg.Obligation4.ExposureType, com.tools20022.repository.msg.SettlementDetails111.ExposureType, com.tools20022.repository.msg.SettlementDetails112.ExposureType,
					com.tools20022.repository.msg.SettlementDetails110.ExposureType, com.tools20022.repository.msg.SettlementDetails115.ExposureType, com.tools20022.repository.msg.SettlementDetails113.ExposureType,
					com.tools20022.repository.choice.ExposureType17Choice.Code, com.tools20022.repository.choice.ExposureType17Choice.Proprietary, com.tools20022.repository.msg.SettlementDetails128.ExposureType,
					com.tools20022.repository.msg.SettlementDetails120.ExposureType, com.tools20022.repository.msg.SettlementDetails119.ExposureType, com.tools20022.repository.msg.SettlementDetails122.ExposureType,
					com.tools20022.repository.msg.SettlementDetails121.ExposureType, com.tools20022.repository.msg.SettlementDetails134.ExposureType, com.tools20022.repository.msg.SettlementDetails137.ExposureType,
					com.tools20022.repository.msg.SettlementDetails132.ExposureType, com.tools20022.repository.msg.SettlementDetails138.ExposureType, com.tools20022.repository.msg.SettlementDetails133.ExposureType,
					com.tools20022.repository.msg.Obligation5.ExposureType);
			elementContext_lazy = () -> ExposureTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExposureType";
			definition = "Specifies the underlying business area/type of trade causing the collateral movement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExposureTypeCode.mmObject();
		}
	};
	/**
	 * Minimum amount to pay/receive as specified in the agreement in the base
	 * currency (to avoid the need to transfer an inconveniently small amount of
	 * variation margin).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#MinimumTransferAmount
	 * VariationMargin1.MinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#MinimumTransferAmount
	 * SegregatedIndependentAmountMargin1.MinimumTransferAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#MinimumTransferAmount
	 * SummaryAmounts1.MinimumTransferAmount}</li>
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
	public static final MMBusinessAttribute MinimumTransferAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin1.MinimumTransferAmount, com.tools20022.repository.msg.SegregatedIndependentAmountMargin1.MinimumTransferAmount,
					com.tools20022.repository.msg.SummaryAmounts1.MinimumTransferAmount);
			elementContext_lazy = () -> ExposureTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumTransferAmount";
			definition = "Minimum amount to pay/receive as specified in the agreement in the base currency (to avoid the need to transfer an inconveniently small amount of variation margin).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount specified to avoid the need to transfer uneven amounts of
	 * collateral.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#RoundingAmount
	 * VariationMargin1.RoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#RoundingAmount
	 * SegregatedIndependentAmountMargin1.RoundingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#RoundingAmount
	 * SummaryAmounts1.RoundingAmount}</li>
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
	public static final MMBusinessAttribute RoundingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin1.RoundingAmount, com.tools20022.repository.msg.SegregatedIndependentAmountMargin1.RoundingAmount,
					com.tools20022.repository.msg.SummaryAmounts1.RoundingAmount);
			elementContext_lazy = () -> ExposureTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Amount specified to avoid the need to transfer uneven amounts of collateral.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Defines how the rounding amount is applied in the calculation to avoid
	 * the need to transfer uneven amounts of collateral. For example, should
	 * the amount of collateral required be rounded up, down, to the closer
	 * integral multiple specified or not rounded.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#RoundingMethod
	 * VariationMargin1.RoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SegregatedIndependentAmountMargin1#RoundingMethod
	 * SegregatedIndependentAmountMargin1.RoundingMethod}</li>
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
	public static final MMBusinessAttribute RoundingMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.VariationMargin1.RoundingMethod, com.tools20022.repository.msg.SegregatedIndependentAmountMargin1.RoundingMethod);
			elementContext_lazy = () -> ExposureTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingMethod";
			definition = "Defines how the rounding amount is applied in the calculation to avoid the need to transfer uneven amounts of collateral. For example, should the amount of collateral required be rounded up, down, to the closer integral multiple specified or not rounded.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RoundingMethodCode.mmObject();
		}
	};
	/**
	 * Agreement in which the exposure terms are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#ExposureTerm
	 * CollateralAgreement.ExposureTerm}</li>
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
	public static final MMBusinessAssociationEnd RelatedCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ExposureTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralAgreement";
			definition = "Agreement in which the exposure terms are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CollateralAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.ExposureTerm;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum requirement for a participant if their requirement falls below a
	 * specific amount set by the central counterparty.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.Margin2#MinimumRequirementDeposit
	 * Margin2.MinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation1#MinimumRequirementDeposit
	 * MarginCalculation1.MinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MarginCalculation2#MinimumRequirementDeposit
	 * MarginCalculation2.MinimumRequirementDeposit}</li>
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
	public static final MMBusinessAttribute MinimumRequirementDeposit = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin2.MinimumRequirementDeposit, com.tools20022.repository.msg.MarginCalculation1.MinimumRequirementDeposit,
					com.tools20022.repository.msg.MarginCalculation2.MinimumRequirementDeposit);
			elementContext_lazy = () -> ExposureTerm.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement for a participant if their requirement falls below a specific amount set by the central counterparty.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ExposureTerm";
				definition = "Specifies the terms used to calculate a risk exposure and its coverage.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralAgreement.ExposureTerm);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarginTerms1Choice.MarginDetails);
				subType_lazy = () -> Arrays.asList(IndependentAmountTerm.mmObject(), VariationMarginTerm.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExposureTerm.ExposureType, com.tools20022.repository.entity.ExposureTerm.MinimumTransferAmount,
						com.tools20022.repository.entity.ExposureTerm.RoundingAmount, com.tools20022.repository.entity.ExposureTerm.RoundingMethod, com.tools20022.repository.entity.ExposureTerm.RelatedCollateralAgreement,
						com.tools20022.repository.entity.ExposureTerm.MinimumRequirementDeposit);
				derivationComponent_lazy = () -> Arrays.asList(ExposureType1Choice.mmObject(), ExposureType3Choice.mmObject(), ExposureType7Choice.mmObject(), ExposureType2Choice.mmObject(), ExposureType4Choice.mmObject(),
						ExposureType6Choice.mmObject(), ExposureType9Choice.mmObject(), ExposureType5Choice.mmObject(), Margin1.mmObject(), MarginTerms1Choice.mmObject(), ExposureType8Choice.mmObject(), ExposureType10Choice.mmObject(),
						ExposureType11Choice.mmObject(), ExposureType12Choice.mmObject(), ExposureType13Choice.mmObject(), ExposureType14Choice.mmObject(), ExposureType16Choice.mmObject(), ExposureType17Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}