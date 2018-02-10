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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.GlobalNote1Choice;
import com.tools20022.repository.choice.GlobalNote2Choice;
import com.tools20022.repository.codeset.GlobalNoteCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssueDate
 * Issuance.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueDiscountAllowance
 * Issuance.mmIssueDiscountAllowance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmInterestShortfall
 * Issuance.mmInterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmRealisedLoss
 * Issuance.mmRealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmPurpose
 * Issuance.mmPurpose}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssueSize
 * Issuance.mmIssueSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssueNominalAmount
 * Issuance.mmIssueNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmEventInformation
 * Issuance.mmEventInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuedAsset
 * Issuance.mmIssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
 * Issuance.mmOriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuePlace
 * Issuance.mmIssuePlace}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmGlobalNoteType
 * Issuance.mmGlobalNoteType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmCapitalRaised
 * Issuance.mmCapitalRaised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmSubscriptionPeriod
 * Issuance.mmSubscriptionPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmMinimum
 * Issuance.mmMinimum}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
 * Issuance.mmIssuePrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmIssuance
 * Asset.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIssuance
 * SecuritiesPricing.mmIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradingMarket#mmIssuance
 * TradingMarket.mmIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmIssuance
 * DateTimePeriod.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedIssuance
 * SecuritiesQuantity.mmRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIssuance
 * SecuritiesQuantity.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmIssuance
 * CorporateActionEvent.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmInterestRelatedIssuance
 * RateAndAmount.mmInterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmLossRelatedIssuance
 * RateAndAmount.mmLossRelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Capital#mmAssetIssuance
 * Capital.mmAssetIssuance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.GlobalNote1Choice
 * GlobalNote1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance1 Issuance1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GlobalNote2Choice
 * GlobalNote2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Issuance3 Issuance3}</li>
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
	protected ISODateTime issueDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmIssueDate
	 * FinancialInstrumentAttributes8.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmIssueDate
	 * FinancialInstrumentAttributes20.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmIssueDate
	 * FinancialInstrumentAttributes35.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmIssueDate
	 * FinancialInstrumentAttributes41.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmIssueDate
	 * FinancialInstrumentAttributes6.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmIssueDate
	 * FinancialInstrumentAttributes9.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmIssueDate
	 * FinancialInstrumentAttributes18.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmIssueDate
	 * FinancialInstrumentAttributes22.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmIssueDate
	 * FinancialInstrumentAttributes32.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmIssueDate
	 * FinancialInstrumentAttributes38.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmIssueDate
	 * FinancialInstrumentAttributes7.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmIssueDate
	 * FinancialInstrumentAttributes5.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmIssueDate
	 * FinancialInstrumentAttributes11.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmIssueDate
	 * FinancialInstrumentAttributes10.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmIssueDate
	 * FinancialInstrumentAttributes19.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmIssueDate
	 * FinancialInstrumentAttributes16.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmIssueDate
	 * FinancialInstrumentAttributes23.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmIssueDate
	 * FinancialInstrumentAttributes24.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmIssueDate
	 * FinancialInstrumentAttributes33.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmIssueDate
	 * FinancialInstrumentAttributes34.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmIssueDate
	 * FinancialInstrumentAttributes39.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmIssueDate
	 * FinancialInstrumentAttributes40.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmIssueDate
	 * FinancialInstrumentAttributes43.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmIssueDate
	 * FinancialInstrumentAttributes45.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmIssueDate
	 * FinancialInstrumentAttributes4.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmIssueDate
	 * FinancialInstrumentAttributes13.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmIssueDate
	 * FinancialInstrumentAttributes21.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmIssueDate
	 * FinancialInstrumentAttributes26.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmIssueDate
	 * FinancialInstrumentAttributes36.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmIssueDate
	 * FinancialInstrumentAttributes42.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmIssueDate
	 * FinancialInstrumentAttributes27.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmIssueDate
	 * FinancialInstrumentAttributes14.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmIssueDate
	 * FinancialInstrumentAttributes30.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmIssueDate
	 * FinancialInstrumentAttributes28.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmIssueDate
	 * FinancialInstrumentAttributes1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmIssueDate
	 * FinancialInstrumentStipulations.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmIssueDate
	 * FinancialInstrumentAttributes31.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssueDate
	 * FinancialInstrumentStipulations2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmAnnouncementDate
	 * FutureOrOptionDetails1.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmIssueDate
	 * FinancialInstrumentAttributes44.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmIssueDate
	 * FinancialInstrumentAttributes15.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmIssueDate
	 * OtherCollateral1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmIssueDate
	 * FinancialInstrumentAttributes29.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssueDate
	 * Issuance1.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmIssueDate
	 * FinancialInstrumentAttributes2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmIssueDate
	 * FinancialInstrumentAttributes48.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmIssueDate
	 * FinancialInstrumentAttributes50.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmIssueDate
	 * FinancialInstrumentAttributes49.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmIssueDate
	 * FinancialInstrumentAttributes55.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmIssueDate
	 * FinancialInstrumentAttributes57.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmIssueDate
	 * FinancialInstrumentAttributes56.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmIssueDate
	 * OtherCollateral2.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmIssueDate
	 * OtherCollateral3.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmIssueDate
	 * OtherCollateral4.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmStartDate
	 * LoanContract1.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmIssueDate
	 * FinancialInstrumentAttributes63.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmIssueDate
	 * FinancialInstrumentAttributes64.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmIssueDate
	 * FinancialInstrumentAttributes66.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmIssueDate
	 * FinancialInstrumentAttributes65.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmIssueDate
	 * FinancialInstrumentAttributes67.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmIssueDate
	 * OtherCollateral7.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmIssueDate
	 * OtherCollateral6.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmIssueDate
	 * OtherCollateral5.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmIssueDate
	 * FinancialInstrumentAttributes70.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmIssueDate
	 * FinancialInstrumentAttributes69.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmIssueDate
	 * FinancialInstrumentAttributes71.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmIssueDate
	 * FinancialInstrumentAttributes75.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmIssueDate
	 * FinancialInstrumentAttributes78.mmIssueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssueDate
	 * Issuance3.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmIssueDate
	 * FinancialInstrumentAttributes79.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmIssueDate
	 * FinancialInstrumentAttributes81.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmIssueDate
	 * FinancialInstrumentAttributes80.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmIssueDate
	 * FinancialInstrumentAttributes85.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmIssueDate
	 * FinancialInstrumentAttributes84.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmIssueDate
	 * FinancialInstrumentAttributes83.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmIssueDate
	 * FinancialInstrumentAttributes91.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmIssueDate
	 * FinancialInstrumentAttributes92.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmIssueDate
	 * FinancialInstrumentAttributes95.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmIssueDate
	 * FinancialInstrumentAttributes97.mmIssueDate}</li>
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
	public static final MMBusinessAttribute mmIssueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmIssueDate, FinancialInstrumentAttributes20.mmIssueDate, FinancialInstrumentAttributes35.mmIssueDate, FinancialInstrumentAttributes41.mmIssueDate,
					FinancialInstrumentAttributes6.mmIssueDate, FinancialInstrumentAttributes9.mmIssueDate, FinancialInstrumentAttributes18.mmIssueDate, FinancialInstrumentAttributes22.mmIssueDate,
					FinancialInstrumentAttributes32.mmIssueDate, FinancialInstrumentAttributes38.mmIssueDate, FinancialInstrumentAttributes7.mmIssueDate, FinancialInstrumentAttributes5.mmIssueDate,
					FinancialInstrumentAttributes11.mmIssueDate, FinancialInstrumentAttributes10.mmIssueDate, FinancialInstrumentAttributes19.mmIssueDate, FinancialInstrumentAttributes16.mmIssueDate,
					FinancialInstrumentAttributes23.mmIssueDate, FinancialInstrumentAttributes24.mmIssueDate, FinancialInstrumentAttributes33.mmIssueDate, FinancialInstrumentAttributes34.mmIssueDate,
					FinancialInstrumentAttributes39.mmIssueDate, FinancialInstrumentAttributes40.mmIssueDate, FinancialInstrumentAttributes43.mmIssueDate, FinancialInstrumentAttributes45.mmIssueDate,
					FinancialInstrumentAttributes4.mmIssueDate, FinancialInstrumentAttributes13.mmIssueDate, FinancialInstrumentAttributes21.mmIssueDate, FinancialInstrumentAttributes26.mmIssueDate,
					FinancialInstrumentAttributes36.mmIssueDate, FinancialInstrumentAttributes42.mmIssueDate, FinancialInstrumentAttributes27.mmIssueDate, FinancialInstrumentAttributes14.mmIssueDate,
					FinancialInstrumentAttributes30.mmIssueDate, FinancialInstrumentAttributes28.mmIssueDate, FinancialInstrumentAttributes1.mmIssueDate, FinancialInstrumentStipulations.mmIssueDate,
					FinancialInstrumentAttributes31.mmIssueDate, FinancialInstrumentStipulations2.mmIssueDate, FutureOrOptionDetails1.mmAnnouncementDate, FinancialInstrumentAttributes44.mmIssueDate,
					FinancialInstrumentAttributes15.mmIssueDate, OtherCollateral1.mmIssueDate, FinancialInstrumentAttributes29.mmIssueDate, Issuance1.mmIssueDate, FinancialInstrumentAttributes2.mmIssueDate,
					FinancialInstrumentAttributes48.mmIssueDate, FinancialInstrumentAttributes50.mmIssueDate, FinancialInstrumentAttributes49.mmIssueDate, FinancialInstrumentAttributes55.mmIssueDate,
					FinancialInstrumentAttributes57.mmIssueDate, FinancialInstrumentAttributes56.mmIssueDate, OtherCollateral2.mmIssueDate, OtherCollateral3.mmIssueDate, OtherCollateral4.mmIssueDate, LoanContract1.mmStartDate,
					FinancialInstrumentAttributes63.mmIssueDate, FinancialInstrumentAttributes64.mmIssueDate, FinancialInstrumentAttributes66.mmIssueDate, FinancialInstrumentAttributes65.mmIssueDate,
					FinancialInstrumentAttributes67.mmIssueDate, OtherCollateral7.mmIssueDate, OtherCollateral6.mmIssueDate, OtherCollateral5.mmIssueDate, FinancialInstrumentAttributes70.mmIssueDate,
					FinancialInstrumentAttributes69.mmIssueDate, FinancialInstrumentAttributes71.mmIssueDate, FinancialInstrumentAttributes75.mmIssueDate, FinancialInstrumentAttributes78.mmIssueDate, Issuance3.mmIssueDate,
					FinancialInstrumentAttributes79.mmIssueDate, FinancialInstrumentAttributes81.mmIssueDate, FinancialInstrumentAttributes80.mmIssueDate, FinancialInstrumentAttributes85.mmIssueDate,
					FinancialInstrumentAttributes84.mmIssueDate, FinancialInstrumentAttributes83.mmIssueDate, FinancialInstrumentAttributes91.mmIssueDate, FinancialInstrumentAttributes92.mmIssueDate,
					FinancialInstrumentAttributes95.mmIssueDate, FinancialInstrumentAttributes97.mmIssueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDate";
			definition = "Date/time at which the security was made available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Issuance.class.getMethod("getIssueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount issueDiscountAllowance;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts12#mmIssueDiscountAllowance
	 * OtherAmounts12.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts14#mmIssueDiscountAllowance
	 * OtherAmounts14.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts20#mmIssueDiscountAllowance
	 * OtherAmounts20.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts4#mmIssueDiscountAllowance
	 * OtherAmounts4.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts5#mmIssueDiscountAllowance
	 * OtherAmounts5.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts17#mmIssueDiscountAllowance
	 * OtherAmounts17.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts23#mmIssueDiscountAllowance
	 * OtherAmounts23.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts3#mmIssueDiscountAllowance
	 * OtherAmounts3.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts7#mmIssueDiscountAllowance
	 * OtherAmounts7.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts9#mmIssueDiscountAllowance
	 * OtherAmounts9.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts10#mmIssueDiscountAllowance
	 * OtherAmounts10.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts18#mmIssueDiscountAllowance
	 * OtherAmounts18.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts24#mmIssueDiscountAllowance
	 * OtherAmounts24.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts13#mmIssueDiscountAllowance
	 * OtherAmounts13.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts1#mmIssueDiscountAllowance
	 * OtherAmounts1.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmIssueDiscountAllowance
	 * OtherAmounts16.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmIssueDiscountAmount
	 * CorporateActionAmounts1.mmIssueDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmIssueDiscountAllowance
	 * OtherAmounts28.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmIssueDiscountAllowance
	 * OtherAmounts30.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmIssueDiscountAllowance
	 * OtherAmounts31.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts35#mmIssueDiscountAllowance
	 * OtherAmounts35.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts34#mmIssueDiscountAllowance
	 * OtherAmounts34.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts38#mmIssueDiscountAllowance
	 * OtherAmounts38.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmIssueDiscountAllowance
	 * OtherAmounts41.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmIssueDiscountAllowance
	 * OtherAmounts39.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmIssueDiscountAllowance
	 * OtherAmounts40.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts42#mmIssueDiscountAllowance
	 * OtherAmounts42.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts43#mmIssueDiscountAllowance
	 * OtherAmounts43.mmIssueDiscountAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts44#mmIssueDiscountAllowance
	 * OtherAmounts44.mmIssueDiscountAllowance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Issuance
	 * Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ISDI</li>
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
	public static final MMBusinessAttribute mmIssueDiscountAllowance = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts12.mmIssueDiscountAllowance, OtherAmounts14.mmIssueDiscountAllowance, OtherAmounts20.mmIssueDiscountAllowance, OtherAmounts4.mmIssueDiscountAllowance,
					OtherAmounts5.mmIssueDiscountAllowance, OtherAmounts17.mmIssueDiscountAllowance, OtherAmounts23.mmIssueDiscountAllowance, OtherAmounts3.mmIssueDiscountAllowance, OtherAmounts7.mmIssueDiscountAllowance,
					OtherAmounts9.mmIssueDiscountAllowance, OtherAmounts10.mmIssueDiscountAllowance, OtherAmounts18.mmIssueDiscountAllowance, OtherAmounts24.mmIssueDiscountAllowance, OtherAmounts13.mmIssueDiscountAllowance,
					OtherAmounts1.mmIssueDiscountAllowance, OtherAmounts16.mmIssueDiscountAllowance, CorporateActionAmounts1.mmIssueDiscountAmount, OtherAmounts28.mmIssueDiscountAllowance, OtherAmounts30.mmIssueDiscountAllowance,
					OtherAmounts31.mmIssueDiscountAllowance, OtherAmounts35.mmIssueDiscountAllowance, OtherAmounts34.mmIssueDiscountAllowance, OtherAmounts38.mmIssueDiscountAllowance, OtherAmounts41.mmIssueDiscountAllowance,
					OtherAmounts39.mmIssueDiscountAllowance, OtherAmounts40.mmIssueDiscountAllowance, OtherAmounts42.mmIssueDiscountAllowance, OtherAmounts43.mmIssueDiscountAllowance, OtherAmounts44.mmIssueDiscountAllowance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ISDI"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueDiscountAllowance";
			definition = "Discount on a new issue or tranche of an existing issue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Issuance.class.getMethod("getIssueDiscountAllowance", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount interestShortfall;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmInterestRelatedIssuance
	 * RateAndAmount.mmInterestRelatedIssuance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmInterestShortfall
	 * CorporateActionRate27.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmInterestShortfall
	 * CorporateActionRate32.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmInterestShortfall
	 * CorporateActionRate35.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmInterestShortfall
	 * CorporateActionRate41.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmInterestShortfall
	 * CorporateActionRate43.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmInterestShortfall
	 * CorporateActionRate56.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmInterestShortfall
	 * CorporateActionRate66.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmInterestShortfall
	 * CorporateActionRate78.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmInterestShortfall
	 * CorporateActionRate91.mmInterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate96#mmInterestShortfall
	 * CorporateActionRate96.mmInterestShortfall}</li>
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
	 * "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterestShortfall = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate27.mmInterestShortfall, CorporateActionRate32.mmInterestShortfall, CorporateActionRate35.mmInterestShortfall, CorporateActionRate41.mmInterestShortfall,
					CorporateActionRate43.mmInterestShortfall, CorporateActionRate56.mmInterestShortfall, CorporateActionRate66.mmInterestShortfall, CorporateActionRate78.mmInterestShortfall, CorporateActionRate91.mmInterestShortfall,
					CorporateActionRate96.mmInterestShortfall);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestShortfall";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the interest payment and the expected or scheduled rate of the interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmInterestRelatedIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount realisedLoss;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmLossRelatedIssuance
	 * RateAndAmount.mmLossRelatedIssuance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmRealisedLoss
	 * CorporateActionRate27.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmRealisedLoss
	 * CorporateActionRate32.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmRealisedLoss
	 * CorporateActionRate35.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmRealisedLoss
	 * CorporateActionRate41.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmRealisedLoss
	 * CorporateActionRate43.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmRealisedLoss
	 * CorporateActionRate56.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmRealisedLoss
	 * CorporateActionRate66.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmRealisedLoss
	 * CorporateActionRate78.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate91#mmRealisedLoss
	 * CorporateActionRate91.mmRealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate96#mmRealisedLoss
	 * CorporateActionRate96.mmRealisedLoss}</li>
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
	public static final MMBusinessAssociationEnd mmRealisedLoss = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate27.mmRealisedLoss, CorporateActionRate32.mmRealisedLoss, CorporateActionRate35.mmRealisedLoss, CorporateActionRate41.mmRealisedLoss, CorporateActionRate43.mmRealisedLoss,
					CorporateActionRate56.mmRealisedLoss, CorporateActionRate66.mmRealisedLoss, CorporateActionRate78.mmRealisedLoss, CorporateActionRate91.mmRealisedLoss, CorporateActionRate96.mmRealisedLoss);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RealisedLoss";
			definition = "For structured security issues where there is a set schedule of principal and interest payments for the life of the issue, this is the difference between the actual rate of the capital or principal repayment and the scheduled capital repayment.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmLossRelatedIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected Max256Text purpose;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmPurpose
	 * FinancialInstrumentAttributes1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmPurpose
	 * FinancialInstrumentStipulations.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmPurpose
	 * FinancialInstrumentStipulations2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmPurpose
	 * FutureOrOptionDetails1.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPurpose
	 * Debt2.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmPurpose
	 * CommonFinancialInstrumentAttributes1.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes4#mmPurpose
	 * CommonFinancialInstrumentAttributes4.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPurpose
	 * Debt3.mmPurpose}</li>
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
	public static final MMBusinessAttribute mmPurpose = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmPurpose, FinancialInstrumentStipulations.mmPurpose, FinancialInstrumentStipulations2.mmPurpose, FutureOrOptionDetails1.mmPurpose, Debt2.mmPurpose,
					CommonFinancialInstrumentAttributes1.mmPurpose, CommonFinancialInstrumentAttributes4.mmPurpose, Debt3.mmPurpose);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Purpose";
			definition = "Reason for which money is raised through the issuance of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Issuance.class.getMethod("getPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number issueSize;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmIssueSize
	 * FinancialInstrumentStipulations.mmIssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmIssueSize
	 * FinancialInstrumentStipulations2.mmIssueSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssueSize
	 * Issuance1.mmIssueSize}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssueSize
	 * Issuance3.mmIssueSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmHoldingsExceedingTotalVotingRightThreshold
	 * TransparencyDataReport11.mmHoldingsExceedingTotalVotingRightThreshold}</li>
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
	public static final MMBusinessAttribute mmIssueSize = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations.mmIssueSize, FinancialInstrumentStipulations2.mmIssueSize, Issuance1.mmIssueSize, Issuance3.mmIssueSize,
					TransparencyDataReport11.mmHoldingsExceedingTotalVotingRightThreshold);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueSize";
			definition = "Identifies the issue size range.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Issuance.class.getMethod("getIssueSize", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity issueNominalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmIssuance
	 * SecuritiesQuantity.mmIssuance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmIssueNominalAmount
	 * Issuance1.mmIssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance1#mmFullIssuedAmount
	 * Issuance1.mmFullIssuedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance3#mmIssueNominalAmount
	 * Issuance3.mmIssueNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Issuance3#mmFullIssuedAmount
	 * Issuance3.mmFullIssuedAmount}</li>
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
	public static final MMBusinessAssociationEnd mmIssueNominalAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Issuance1.mmIssueNominalAmount, Issuance1.mmFullIssuedAmount, Issuance3.mmIssueNominalAmount, Issuance3.mmFullIssuedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssueNominalAmount";
			definition = "Total original amount or quantity published.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionEvent eventInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmIssuance
	 * CorporateActionEvent.mmIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmEventInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EventInformation";
			definition = "Parameters of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected Asset issuedAsset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmIssuance
	 * Asset.mmIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmIssuedAsset = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuedAsset";
			definition = "Asset which is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
		}
	};
	protected SecuritiesPricing originalIssueDiscount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIssuance
	 * SecuritiesPricing.mmIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmOriginalIssueDiscount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalIssueDiscount";
			definition = "Discount from par value at the time the security is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected TradingMarket issuePlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmIssuance
	 * TradingMarket.mmIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmIssuePlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuePlace";
			definition = "Primary market or country where an asset is issued by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected GlobalNoteCode globalNoteType;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GlobalNote1Choice#mmCode
	 * GlobalNote1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GlobalNote1Choice#mmProprietary
	 * GlobalNote1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GlobalNote2Choice#mmCode
	 * GlobalNote2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GlobalNote2Choice#mmProprietary
	 * GlobalNote2Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmGlobalNoteType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GlobalNote1Choice.mmCode, GlobalNote1Choice.mmProprietary, GlobalNote2Choice.mmCode, GlobalNote2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalNoteType";
			definition = "Identifies if the security will be issued in New Global Note (NGN) or Classical Global Note (CGN).\r\nNew Global Note (NGN): Form of global certificate which refers to the books and records of the ICSDs to determine the issue outstanding amount (IOA). \r\nClassical Global Note (CGN): Form of global certificate which requires physical annotation on the attached schedule to reflect changes in the issue outstanding amount (IOA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GlobalNoteCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Issuance.class.getMethod("getGlobalNoteType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Capital> capitalRaised;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Capital#mmAssetIssuance
	 * Capital.mmAssetIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmCapitalRaised = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalRaised";
			definition = "Capital raised through the issuance of an asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Capital.mmAssetIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Capital.mmObject();
		}
	};
	protected DateTimePeriod subscriptionPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmIssuance
	 * DateTimePeriod.mmIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmSubscriptionPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionPeriod";
			definition = "Period during which the security can be subscribed to.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected SecuritiesQuantity minimum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedIssuance
	 * SecuritiesQuantity.mmRelatedIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmMinimum = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Minimum";
			definition = "Minimum or incremental denomination required for the transfer or change of ownership of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedIssuance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CurrencyAndAmount issuePrice;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmIssuePrice
	 * CorporateActionPrice8.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmIssuePrice
	 * CorporateActionPrice11.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmIssuePrice
	 * CorporateActionPrice19.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmIssuePrice
	 * CorporateActionPrice20.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmIssuePrice
	 * CorporateActionPrice29.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmIssuePrice
	 * CorporateActionPrice35.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1#mmIssuePrice
	 * FutureOrOptionDetails1.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmIssuePrice
	 * CorporateActionPrice1.mmIssuePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance1#mmIssuePrice
	 * Issuance1.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmIssuePrice
	 * CorporateActionPrice44.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmIssuePrice
	 * CorporateActionPrice52.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmIssuePrice
	 * CorporateActionPrice60.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmIssuePrice
	 * CorporateActionPrice62.mmIssuePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Issuance3#mmIssuePrice
	 * Issuance3.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmIssuanceSize
	 * TransparencyDataReport11.mmIssuanceSize}</li>
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
	public static final MMBusinessAttribute mmIssuePrice = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice8.mmIssuePrice, CorporateActionPrice11.mmIssuePrice, CorporateActionPrice19.mmIssuePrice, CorporateActionPrice20.mmIssuePrice, CorporateActionPrice29.mmIssuePrice,
					CorporateActionPrice35.mmIssuePrice, FutureOrOptionDetails1.mmIssuePrice, CorporateActionPrice1.mmIssuePrice, Issuance1.mmIssuePrice, CorporateActionPrice44.mmIssuePrice, CorporateActionPrice52.mmIssuePrice,
					CorporateActionPrice60.mmIssuePrice, CorporateActionPrice62.mmIssuePrice, Issuance3.mmIssuePrice, TransparencyDataReport11.mmIssuanceSize);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Issuance.class.getMethod("getIssuePrice", new Class[]{});
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
				name = "Issuance";
				definition = "Preparation/bringing to market of a security (also known as primary market or Initial Public Offering (IPO) issuance).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmIssuance, com.tools20022.repository.entity.SecuritiesPricing.mmIssuance, com.tools20022.repository.entity.TradingMarket.mmIssuance,
						com.tools20022.repository.entity.DateTimePeriod.mmIssuance, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedIssuance, com.tools20022.repository.entity.SecuritiesQuantity.mmIssuance,
						com.tools20022.repository.entity.CorporateActionEvent.mmIssuance, com.tools20022.repository.entity.RateAndAmount.mmInterestRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.mmLossRelatedIssuance,
						com.tools20022.repository.entity.Capital.mmAssetIssuance);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Issuance.mmIssueDate, com.tools20022.repository.entity.Issuance.mmIssueDiscountAllowance, com.tools20022.repository.entity.Issuance.mmInterestShortfall,
						com.tools20022.repository.entity.Issuance.mmRealisedLoss, com.tools20022.repository.entity.Issuance.mmPurpose, com.tools20022.repository.entity.Issuance.mmIssueSize,
						com.tools20022.repository.entity.Issuance.mmIssueNominalAmount, com.tools20022.repository.entity.Issuance.mmEventInformation, com.tools20022.repository.entity.Issuance.mmIssuedAsset,
						com.tools20022.repository.entity.Issuance.mmOriginalIssueDiscount, com.tools20022.repository.entity.Issuance.mmIssuePlace, com.tools20022.repository.entity.Issuance.mmGlobalNoteType,
						com.tools20022.repository.entity.Issuance.mmCapitalRaised, com.tools20022.repository.entity.Issuance.mmSubscriptionPeriod, com.tools20022.repository.entity.Issuance.mmMinimum,
						com.tools20022.repository.entity.Issuance.mmIssuePrice);
				derivationComponent_lazy = () -> Arrays.asList(GlobalNote1Choice.mmObject(), Issuance1.mmObject(), GlobalNote2Choice.mmObject(), Issuance3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Issuance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getIssueDate() {
		return issueDate;
	}

	public Issuance setIssueDate(ISODateTime issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public CurrencyAndAmount getIssueDiscountAllowance() {
		return issueDiscountAllowance;
	}

	public Issuance setIssueDiscountAllowance(CurrencyAndAmount issueDiscountAllowance) {
		this.issueDiscountAllowance = Objects.requireNonNull(issueDiscountAllowance);
		return this;
	}

	public RateAndAmount getInterestShortfall() {
		return interestShortfall;
	}

	public Issuance setInterestShortfall(com.tools20022.repository.entity.RateAndAmount interestShortfall) {
		this.interestShortfall = Objects.requireNonNull(interestShortfall);
		return this;
	}

	public RateAndAmount getRealisedLoss() {
		return realisedLoss;
	}

	public Issuance setRealisedLoss(com.tools20022.repository.entity.RateAndAmount realisedLoss) {
		this.realisedLoss = Objects.requireNonNull(realisedLoss);
		return this;
	}

	public Max256Text getPurpose() {
		return purpose;
	}

	public Issuance setPurpose(Max256Text purpose) {
		this.purpose = Objects.requireNonNull(purpose);
		return this;
	}

	public Number getIssueSize() {
		return issueSize;
	}

	public Issuance setIssueSize(Number issueSize) {
		this.issueSize = Objects.requireNonNull(issueSize);
		return this;
	}

	public SecuritiesQuantity getIssueNominalAmount() {
		return issueNominalAmount;
	}

	public Issuance setIssueNominalAmount(com.tools20022.repository.entity.SecuritiesQuantity issueNominalAmount) {
		this.issueNominalAmount = Objects.requireNonNull(issueNominalAmount);
		return this;
	}

	public CorporateActionEvent getEventInformation() {
		return eventInformation;
	}

	public Issuance setEventInformation(com.tools20022.repository.entity.CorporateActionEvent eventInformation) {
		this.eventInformation = Objects.requireNonNull(eventInformation);
		return this;
	}

	public Optional<Asset> getIssuedAsset() {
		return issuedAsset == null ? Optional.empty() : Optional.of(issuedAsset);
	}

	public Issuance setIssuedAsset(com.tools20022.repository.entity.Asset issuedAsset) {
		this.issuedAsset = issuedAsset;
		return this;
	}

	public SecuritiesPricing getOriginalIssueDiscount() {
		return originalIssueDiscount;
	}

	public Issuance setOriginalIssueDiscount(com.tools20022.repository.entity.SecuritiesPricing originalIssueDiscount) {
		this.originalIssueDiscount = Objects.requireNonNull(originalIssueDiscount);
		return this;
	}

	public TradingMarket getIssuePlace() {
		return issuePlace;
	}

	public Issuance setIssuePlace(com.tools20022.repository.entity.TradingMarket issuePlace) {
		this.issuePlace = Objects.requireNonNull(issuePlace);
		return this;
	}

	public GlobalNoteCode getGlobalNoteType() {
		return globalNoteType;
	}

	public Issuance setGlobalNoteType(GlobalNoteCode globalNoteType) {
		this.globalNoteType = Objects.requireNonNull(globalNoteType);
		return this;
	}

	public List<Capital> getCapitalRaised() {
		return capitalRaised == null ? capitalRaised = new ArrayList<>() : capitalRaised;
	}

	public Issuance setCapitalRaised(List<com.tools20022.repository.entity.Capital> capitalRaised) {
		this.capitalRaised = Objects.requireNonNull(capitalRaised);
		return this;
	}

	public DateTimePeriod getSubscriptionPeriod() {
		return subscriptionPeriod;
	}

	public Issuance setSubscriptionPeriod(com.tools20022.repository.entity.DateTimePeriod subscriptionPeriod) {
		this.subscriptionPeriod = Objects.requireNonNull(subscriptionPeriod);
		return this;
	}

	public SecuritiesQuantity getMinimum() {
		return minimum;
	}

	public Issuance setMinimum(com.tools20022.repository.entity.SecuritiesQuantity minimum) {
		this.minimum = Objects.requireNonNull(minimum);
		return this;
	}

	public CurrencyAndAmount getIssuePrice() {
		return issuePrice;
	}

	public Issuance setIssuePrice(CurrencyAndAmount issuePrice) {
		this.issuePrice = Objects.requireNonNull(issuePrice);
		return this;
	}
}