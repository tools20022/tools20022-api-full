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
import com.tools20022.repository.choice.GlobalNote1Choice;
import com.tools20022.repository.codeset.GlobalNoteCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.msg.Issuance1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Preparation/bringing to market of a security (also known as primary market or
 * Initial Public Offering (IPO) issuance).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Issuance" src="doc-files/Issuance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueDate
 * Issuance.IssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#IssueDiscountAllowance
 * Issuance.IssueDiscountAllowance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#InterestShortfall
 * Issuance.InterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#RealisedLoss
 * Issuance.RealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#Purpose
 * Issuance.Purpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueSize
 * Issuance.IssueSize}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssueNominalAmount
 * Issuance.IssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#EventInformation
 * Issuance.EventInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuedAsset
 * Issuance.IssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#OriginalIssueDiscount
 * Issuance.OriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuePlace
 * Issuance.IssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#GlobalNoteType
 * Issuance.GlobalNoteType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#CapitalRaised
 * Issuance.CapitalRaised}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#SubscriptionPeriod
 * Issuance.SubscriptionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#Minimum
 * Issuance.Minimum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuePrice
 * Issuance.IssuePrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Issuance
 * Asset.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Issuance
 * SecuritiesPricing.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#Issuance
 * TradingMarket.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#Issuance
 * DateTimePeriod.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedIssuance
 * SecuritiesQuantity.RelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Issuance
 * SecuritiesQuantity.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Issuance
 * CorporateActionEvent.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#InterestRelatedIssuance
 * RateAndAmount.InterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#LossRelatedIssuance
 * RateAndAmount.LossRelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Capital#AssetIssuance
 * Capital.AssetIssuance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.GlobalNote1Choice
 * GlobalNote1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1 Issuance1}</li>
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
 * "Issuance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance)."
 * </li>
 * </ul>
 */
public class Issuance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date/time at which the security was made available.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#IssueDate
	 * FinancialInstrumentAttributes8.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#IssueDate
	 * FinancialInstrumentAttributes20.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#IssueDate
	 * FinancialInstrumentAttributes35.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#IssueDate
	 * FinancialInstrumentAttributes41.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#IssueDate
	 * FinancialInstrumentAttributes6.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#IssueDate
	 * FinancialInstrumentAttributes9.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#IssueDate
	 * FinancialInstrumentAttributes18.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#IssueDate
	 * FinancialInstrumentAttributes22.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#IssueDate
	 * FinancialInstrumentAttributes32.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#IssueDate
	 * FinancialInstrumentAttributes38.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#IssueDate
	 * FinancialInstrumentAttributes7.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#IssueDate
	 * FinancialInstrumentAttributes5.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#IssueDate
	 * FinancialInstrumentAttributes11.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#IssueDate
	 * FinancialInstrumentAttributes10.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#IssueDate
	 * FinancialInstrumentAttributes19.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#IssueDate
	 * FinancialInstrumentAttributes16.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#IssueDate
	 * FinancialInstrumentAttributes23.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#IssueDate
	 * FinancialInstrumentAttributes24.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#IssueDate
	 * FinancialInstrumentAttributes33.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#IssueDate
	 * FinancialInstrumentAttributes34.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#IssueDate
	 * FinancialInstrumentAttributes39.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#IssueDate
	 * FinancialInstrumentAttributes40.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#IssueDate
	 * FinancialInstrumentAttributes43.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#IssueDate
	 * FinancialInstrumentAttributes45.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#IssueDate
	 * FinancialInstrumentAttributes4.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#IssueDate
	 * FinancialInstrumentAttributes13.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#IssueDate
	 * FinancialInstrumentAttributes21.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#IssueDate
	 * FinancialInstrumentAttributes26.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#IssueDate
	 * FinancialInstrumentAttributes36.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#IssueDate
	 * FinancialInstrumentAttributes42.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#IssueDate
	 * FinancialInstrumentAttributes27.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#IssueDate
	 * FinancialInstrumentAttributes14.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#IssueDate
	 * FinancialInstrumentAttributes30.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#IssueDate
	 * FinancialInstrumentAttributes28.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#IssueDate
	 * FinancialInstrumentAttributes1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#IssueDate
	 * FinancialInstrumentStipulations.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#IssueDate
	 * FinancialInstrumentAttributes31.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#IssueDate
	 * FinancialInstrumentStipulations2.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#AnnouncementDate
	 * FutureOrOptionDetails1.AnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#IssueDate
	 * FinancialInstrumentAttributes44.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#IssueDate
	 * FinancialInstrumentAttributes15.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral1#IssueDate
	 * OtherCollateral1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#IssueDate
	 * FinancialInstrumentAttributes29.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssueDate
	 * Issuance1.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#IssueDate
	 * FinancialInstrumentAttributes2.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#IssueDate
	 * FinancialInstrumentAttributes48.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#IssueDate
	 * FinancialInstrumentAttributes50.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#IssueDate
	 * FinancialInstrumentAttributes49.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#IssueDate
	 * FinancialInstrumentAttributes55.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#IssueDate
	 * FinancialInstrumentAttributes57.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#IssueDate
	 * FinancialInstrumentAttributes56.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral2#IssueDate
	 * OtherCollateral2.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3#IssueDate
	 * OtherCollateral3.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4#IssueDate
	 * OtherCollateral4.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#StartDate
	 * LoanContract1.StartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#IssueDate
	 * FinancialInstrumentAttributes63.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#IssueDate
	 * FinancialInstrumentAttributes64.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#IssueDate
	 * FinancialInstrumentAttributes66.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#IssueDate
	 * FinancialInstrumentAttributes65.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#IssueDate
	 * FinancialInstrumentAttributes67.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7#IssueDate
	 * OtherCollateral7.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6#IssueDate
	 * OtherCollateral6.IssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5#IssueDate
	 * OtherCollateral5.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#IssueDate
	 * FinancialInstrumentAttributes70.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#IssueDate
	 * FinancialInstrumentAttributes69.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#IssueDate
	 * FinancialInstrumentAttributes71.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#IssueDate
	 * FinancialInstrumentAttributes75.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#IssueDate
	 * FinancialInstrumentAttributes78.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#IssueDate
	 * FinancialInstrumentAttributes79.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#IssueDate
	 * FinancialInstrumentAttributes81.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#IssueDate
	 * FinancialInstrumentAttributes80.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#IssueDate
	 * FinancialInstrumentAttributes85.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#IssueDate
	 * FinancialInstrumentAttributes84.IssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#IssueDate
	 * FinancialInstrumentAttributes83.IssueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time at which the security was made available."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes6.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes9.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes18.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes7.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes5.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes11.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes23.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes24.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes33.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes43.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes4.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes27.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes1.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentStipulations.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.IssueDate, com.tools20022.repository.msg.FinancialInstrumentStipulations2.IssueDate,
					com.tools20022.repository.msg.FutureOrOptionDetails1.AnnouncementDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes15.IssueDate,
					com.tools20022.repository.msg.OtherCollateral1.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.IssueDate, com.tools20022.repository.msg.Issuance1.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes48.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes50.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes55.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.IssueDate, com.tools20022.repository.msg.OtherCollateral2.IssueDate, com.tools20022.repository.msg.OtherCollateral3.IssueDate,
					com.tools20022.repository.msg.OtherCollateral4.IssueDate, com.tools20022.repository.msg.LoanContract1.StartDate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes66.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes65.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.IssueDate, com.tools20022.repository.msg.OtherCollateral7.IssueDate, com.tools20022.repository.msg.OtherCollateral6.IssueDate,
					com.tools20022.repository.msg.OtherCollateral5.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes70.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes69.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes78.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes80.IssueDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.IssueDate, com.tools20022.repository.msg.FinancialInstrumentAttributes83.IssueDate);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Discount on a new issue or tranche of an existing issue.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#IssueDiscountAllowance
	 * OtherAmounts12.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#IssueDiscountAllowance
	 * OtherAmounts14.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#IssueDiscountAllowance
	 * OtherAmounts20.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#IssueDiscountAllowance
	 * OtherAmounts4.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#IssueDiscountAllowance
	 * OtherAmounts5.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#IssueDiscountAllowance
	 * OtherAmounts17.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#IssueDiscountAllowance
	 * OtherAmounts23.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#IssueDiscountAllowance
	 * OtherAmounts3.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#IssueDiscountAllowance
	 * OtherAmounts7.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#IssueDiscountAllowance
	 * OtherAmounts9.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#IssueDiscountAllowance
	 * OtherAmounts10.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#IssueDiscountAllowance
	 * OtherAmounts18.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#IssueDiscountAllowance
	 * OtherAmounts24.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#IssueDiscountAllowance
	 * OtherAmounts13.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#IssueDiscountAllowance
	 * OtherAmounts1.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#IssueDiscountAllowance
	 * OtherAmounts16.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#IssueDiscountAmount
	 * CorporateActionAmounts1.IssueDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#IssueDiscountAllowance
	 * OtherAmounts28.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#IssueDiscountAllowance
	 * OtherAmounts30.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#IssueDiscountAllowance
	 * OtherAmounts31.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#IssueDiscountAllowance
	 * OtherAmounts35.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#IssueDiscountAllowance
	 * OtherAmounts34.IssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#IssueDiscountAllowance
	 * OtherAmounts38.IssueDiscountAllowance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDiscountAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Discount on a new issue or tranche of an existing issue."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueDiscountAllowance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherAmounts12.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts14.IssueDiscountAllowance,
					com.tools20022.repository.msg.OtherAmounts20.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts4.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts5.IssueDiscountAllowance,
					com.tools20022.repository.msg.OtherAmounts17.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts23.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts3.IssueDiscountAllowance,
					com.tools20022.repository.msg.OtherAmounts7.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts9.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts10.IssueDiscountAllowance,
					com.tools20022.repository.msg.OtherAmounts18.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts24.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts13.IssueDiscountAllowance,
					com.tools20022.repository.msg.OtherAmounts1.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts16.IssueDiscountAllowance, com.tools20022.repository.msg.CorporateActionAmounts1.IssueDiscountAmount,
					com.tools20022.repository.msg.OtherAmounts28.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts30.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts31.IssueDiscountAllowance,
					com.tools20022.repository.msg.OtherAmounts35.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts34.IssueDiscountAllowance, com.tools20022.repository.msg.OtherAmounts38.IssueDiscountAllowance);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Discount on a new issue or tranche of an existing issue.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * For structured security issues where there is a set schedule of principal
	 * and interest payments for the life of the issue, this is the difference
	 * between the actual rate of the interest payment and the expected or
	 * scheduled rate of the interest payment .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#InterestRelatedIssuance
	 * RateAndAmount.InterestRelatedIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#InterestShortfall
	 * CorporateActionRate27.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#InterestShortfall
	 * CorporateActionRate32.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#InterestShortfall
	 * CorporateActionRate35.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#InterestShortfall
	 * CorporateActionRate41.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#InterestShortfall
	 * CorporateActionRate43.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#InterestShortfall
	 * CorporateActionRate56.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#InterestShortfall
	 * CorporateActionRate66.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#InterestShortfall
	 * CorporateActionRate78.InterestShortfall}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestShortfall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment ."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestShortfall = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate27.InterestShortfall, com.tools20022.repository.msg.CorporateActionRate32.InterestShortfall,
					com.tools20022.repository.msg.CorporateActionRate35.InterestShortfall, com.tools20022.repository.msg.CorporateActionRate41.InterestShortfall, com.tools20022.repository.msg.CorporateActionRate43.InterestShortfall,
					com.tools20022.repository.msg.CorporateActionRate56.InterestShortfall, com.tools20022.repository.msg.CorporateActionRate66.InterestShortfall, com.tools20022.repository.msg.CorporateActionRate78.InterestShortfall);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestShortfall";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment .";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * For structured security issues where there is a set schedule of principal
	 * and interest payments for the life of the issue, this is the difference
	 * between the actual rate of the capital or principal repayment and the
	 * scheduled capital repayment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#LossRelatedIssuance
	 * RateAndAmount.LossRelatedIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#RealisedLoss
	 * CorporateActionRate27.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#RealisedLoss
	 * CorporateActionRate32.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#RealisedLoss
	 * CorporateActionRate35.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#RealisedLoss
	 * CorporateActionRate41.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#RealisedLoss
	 * CorporateActionRate43.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#RealisedLoss
	 * CorporateActionRate56.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#RealisedLoss
	 * CorporateActionRate66.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#RealisedLoss
	 * CorporateActionRate78.RealisedLoss}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealisedLoss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RealisedLoss = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate27.RealisedLoss, com.tools20022.repository.msg.CorporateActionRate32.RealisedLoss,
					com.tools20022.repository.msg.CorporateActionRate35.RealisedLoss, com.tools20022.repository.msg.CorporateActionRate41.RealisedLoss, com.tools20022.repository.msg.CorporateActionRate43.RealisedLoss,
					com.tools20022.repository.msg.CorporateActionRate56.RealisedLoss, com.tools20022.repository.msg.CorporateActionRate66.RealisedLoss, com.tools20022.repository.msg.CorporateActionRate78.RealisedLoss);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RealisedLoss";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reason for which money is raised through the issuance of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#Purpose
	 * FinancialInstrumentAttributes1.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#Purpose
	 * FinancialInstrumentStipulations.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#Purpose
	 * FinancialInstrumentStipulations2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#Purpose
	 * FutureOrOptionDetails1.Purpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#Purpose
	 * Debt2.Purpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#Purpose
	 * CommonFinancialInstrumentAttributes1.Purpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for which money is raised through the issuance of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Purpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.Purpose, com.tools20022.repository.msg.FinancialInstrumentStipulations.Purpose,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.Purpose, com.tools20022.repository.msg.FutureOrOptionDetails1.Purpose, com.tools20022.repository.msg.Debt2.Purpose,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.Purpose);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	/**
	 * Identifies the issue size range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#IssueSize
	 * FinancialInstrumentStipulations.IssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#IssueSize
	 * FinancialInstrumentStipulations2.IssueSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssueSize
	 * Issuance1.IssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#HoldingsExceedingTotalVotingRightThreshold
	 * TransparencyDataReport11.HoldingsExceedingTotalVotingRightThreshold}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the issue size range."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssueSize = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentStipulations.IssueSize, com.tools20022.repository.msg.FinancialInstrumentStipulations2.IssueSize,
					com.tools20022.repository.msg.Issuance1.IssueSize, com.tools20022.repository.msg.TransparencyDataReport11.HoldingsExceedingTotalVotingRightThreshold);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueSize";
			definition = "Identifies the issue size range.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Total original amount or quantity published.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Issuance
	 * SecuritiesQuantity.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance1#IssueNominalAmount
	 * Issuance1.IssueNominalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#FullIssuedAmount
	 * Issuance1.FullIssuedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total original amount or quantity published."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssueNominalAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Issuance1.IssueNominalAmount, com.tools20022.repository.msg.Issuance1.FullIssuedAmount);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Parameters of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#Issuance
	 * CorporateActionEvent.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parameters of the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EventInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EventInformation";
			definition = "Parameters of the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset which is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Asset#Issuance
	 * Asset.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuedAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssuedAsset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuedAsset";
			definition = "Asset which is issued.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Discount from par value at the time the security is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Issuance
	 * SecuritiesPricing.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalIssueDiscount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Discount from par value at the time the security is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OriginalIssueDiscount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalIssueDiscount";
			definition = "Discount from par value at the time the security is issued.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Primary market or country where an asset is issued by the issuer or its
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#Issuance
	 * TradingMarket.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primary market or country where an asset is issued by the issuer or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IssuePlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuePlace";
			definition = "Primary market or country where an asset is issued by the issuer or its agent.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies if the security will be issued in New Global Note (NGN) or
	 * Classical Global Note (CGN).<br>
	 * New Global Note (NGN): Form of global certificate which refers to the
	 * books and records of the ICSDs to determine the issue outstanding amount
	 * (IOA). <br>
	 * Classical Global Note (CGN): Form of global certificate which requires
	 * physical annotation on the attached schedule to reflect changes in the
	 * issue outstanding amount (IOA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GlobalNoteCode
	 * GlobalNoteCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.GlobalNote1Choice#Code
	 * GlobalNote1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GlobalNote1Choice#Proprietary
	 * GlobalNote1Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalNoteType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute GlobalNoteType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GlobalNote1Choice.Code, com.tools20022.repository.choice.GlobalNote1Choice.Proprietary);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalNoteType";
			definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> GlobalNoteCode.mmObject();
		}
	};
	/**
	 * Capital raised through the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Capital#AssetIssuance
	 * Capital.AssetIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Capital Capital}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalRaised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Capital raised through the issuance of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CapitalRaised = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CapitalRaised";
			definition = "Capital raised through the issuance of an asset.";
			minOccurs = 0;
			type_lazy = () -> Capital.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Capital.AssetIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Period during which the security can be subscribed to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#Issuance
	 * DateTimePeriod.Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the security can be subscribed to."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubscriptionPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPeriod";
			definition = "Period during which the security can be subscribed to.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.Issuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum or incremental denomination required for the transfer or change
	 * of ownership of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedIssuance
	 * SecuritiesQuantity.RelatedIssuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minimum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum or incremental denomination required for the transfer or change of ownership of a security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Minimum = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Minimum";
			definition = "Minimum or incremental denomination required for the transfer or change of ownership of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Initial issue price of a financial instrument.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#IssuePrice
	 * CorporateActionPrice8.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#IssuePrice
	 * CorporateActionPrice11.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#IssuePrice
	 * CorporateActionPrice19.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#IssuePrice
	 * CorporateActionPrice20.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#IssuePrice
	 * CorporateActionPrice29.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#IssuePrice
	 * CorporateActionPrice35.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#IssuePrice
	 * FutureOrOptionDetails1.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#IssuePrice
	 * CorporateActionPrice1.IssuePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#IssuePrice
	 * Issuance1.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#IssuePrice
	 * CorporateActionPrice44.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#IssuePrice
	 * CorporateActionPrice52.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#IssuePrice
	 * CorporateActionPrice60.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#IssuePrice
	 * CorporateActionPrice62.IssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#IssuanceSize
	 * TransparencyDataReport11.IssuanceSize}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IssuePrice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice11.IssuePrice,
					com.tools20022.repository.msg.CorporateActionPrice19.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice20.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice29.IssuePrice,
					com.tools20022.repository.msg.CorporateActionPrice35.IssuePrice, com.tools20022.repository.msg.FutureOrOptionDetails1.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice1.IssuePrice,
					com.tools20022.repository.msg.Issuance1.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice44.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice52.IssuePrice,
					com.tools20022.repository.msg.CorporateActionPrice60.IssuePrice, com.tools20022.repository.msg.CorporateActionPrice62.IssuePrice, com.tools20022.repository.msg.TransparencyDataReport11.IssuanceSize);
			elementContext_lazy = () -> Issuance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Issuance";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.Issuance, com.tools20022.repository.entity.SecuritiesPricing.Issuance, com.tools20022.repository.entity.TradingMarket.Issuance,
						com.tools20022.repository.entity.DateTimePeriod.Issuance, com.tools20022.repository.entity.SecuritiesQuantity.RelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.Issuance,
						com.tools20022.repository.entity.CorporateActionEvent.Issuance, com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance,
						com.tools20022.repository.entity.Capital.AssetIssuance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Issuance.IssueDate, com.tools20022.repository.entity.Issuance.IssueDiscountAllowance, com.tools20022.repository.entity.Issuance.InterestShortfall,
						com.tools20022.repository.entity.Issuance.RealisedLoss, com.tools20022.repository.entity.Issuance.Purpose, com.tools20022.repository.entity.Issuance.IssueSize,
						com.tools20022.repository.entity.Issuance.IssueNominalAmount, com.tools20022.repository.entity.Issuance.EventInformation, com.tools20022.repository.entity.Issuance.IssuedAsset,
						com.tools20022.repository.entity.Issuance.OriginalIssueDiscount, com.tools20022.repository.entity.Issuance.IssuePlace, com.tools20022.repository.entity.Issuance.GlobalNoteType,
						com.tools20022.repository.entity.Issuance.CapitalRaised, com.tools20022.repository.entity.Issuance.SubscriptionPeriod, com.tools20022.repository.entity.Issuance.Minimum,
						com.tools20022.repository.entity.Issuance.IssuePrice);
				derivationComponent_lazy = () -> Arrays.asList(GlobalNote1Choice.mmObject(), Issuance1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}