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
import com.tools20022.repository.choice.FinancialInstrumentProperties1Choice;
import com.tools20022.repository.choice.InstrumentSubStructureType1Choice;
import com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode;
import com.tools20022.repository.codeset.InstrumentSubStructureTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Asset" src="doc-files/Asset.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#ExpiryDate
 * Asset.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#MaturityDate
 * Asset.MaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Derivative
 * Asset.Derivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetValue
 * Asset.AssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetClassification
 * Asset.AssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#FinancialAssetCategory
 * Asset.FinancialAssetCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetPartyRole
 * Asset.AssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Issuance
 * Asset.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Portfolio
 * Asset.Portfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentAmount
 * Asset.InvestmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentRate
 * Asset.InvestmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#EffectiveDate
 * Asset.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#FinancialInstrumentSubStructure
 * Asset.FinancialInstrumentSubStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentPlan
 * Asset.InvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Trade Asset.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Tranche Asset.Tranche}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#LegAdditionalInformation
 * Asset.LegAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#StandingSettlementInstruction
 * Asset.StandingSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Asset Trade.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Asset
 * InvestmentPlan.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#AssetDescription
 * Portfolio.AssetDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Asset
 * AssetHolding.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole#Asset
 * AssetPartyRole.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#Asset
 * AssetClassification.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#UnderlyingAsset
 * Derivative.UnderlyingAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuedAsset
 * Issuance.IssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Asset
 * StandingSettlementInstruction.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#RelatedAsset
 * Leg.RelatedAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#Asset Tranche.Asset}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#Properties
 * FinancialInstrumentAttributes1.Properties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#AdditionalUnderlyingAttributes
 * FinancialInstrumentAttributes1.AdditionalUnderlyingAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#OtherTypeOfCollateral
 * OtherCollateral1.OtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#OtherCollateral
 * CollateralSubstitution1.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#OtherCollateralDetails
 * CollateralValuation1.OtherCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes1#FinancialInstrumentType
 * SecurityAttributes1.FinancialInstrumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#OtherCollateral
 * CollateralSubstitution2.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#OtherCollateral
 * CollateralValuation2.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#OtherTypeOfCollateral
 * OtherCollateral2.OtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#LetterOfCreditIdentification
 * OtherCollateral3.LetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#OtherTypeOfCollateral
 * OtherCollateral3.OtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#OtherTypeOfCollateral
 * OtherCollateral4.OtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#OtherCollateral
 * CollateralSubstitution3.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#OtherCollateral
 * CollateralSubstitution5.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#OtherCollateral
 * CollateralSubstitution4.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#OtherTypeOfCollateral
 * OtherCollateral7.OtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#OtherCollateral
 * CollateralValuation5.OtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#LetterOfCreditIdentification
 * OtherCollateral6.LetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#OtherTypeOfCollateral
 * OtherCollateral6.OtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#OtherTypeOfCollateral
 * OtherCollateral5.OtherTypeOfCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Money Money}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit
 * LetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee Guarantee}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8
 * FinancialInstrumentAttributes8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20
 * FinancialInstrumentAttributes20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35
 * FinancialInstrumentAttributes35}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41
 * FinancialInstrumentAttributes41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6
 * FinancialInstrumentAttributes6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9
 * FinancialInstrumentAttributes9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18
 * FinancialInstrumentAttributes18}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22
 * FinancialInstrumentAttributes22}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32
 * FinancialInstrumentAttributes32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38
 * FinancialInstrumentAttributes38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7
 * FinancialInstrumentAttributes7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5
 * FinancialInstrumentAttributes5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11
 * FinancialInstrumentAttributes11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10
 * FinancialInstrumentAttributes10}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19
 * FinancialInstrumentAttributes19}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16
 * FinancialInstrumentAttributes16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23
 * FinancialInstrumentAttributes23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24
 * FinancialInstrumentAttributes24}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33
 * FinancialInstrumentAttributes33}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34
 * FinancialInstrumentAttributes34}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39
 * FinancialInstrumentAttributes39}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40
 * FinancialInstrumentAttributes40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43
 * FinancialInstrumentAttributes43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45
 * FinancialInstrumentAttributes45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3
 * FinancialInstrumentAttributes3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12
 * FinancialInstrumentAttributes12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17
 * FinancialInstrumentAttributes17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25
 * FinancialInstrumentAttributes25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46
 * FinancialInstrumentAttributes46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47
 * FinancialInstrumentAttributes47}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4
 * FinancialInstrumentAttributes4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13
 * FinancialInstrumentAttributes13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21
 * FinancialInstrumentAttributes21}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26
 * FinancialInstrumentAttributes26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
 * FinancialInstrumentAttributes36}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42
 * FinancialInstrumentAttributes42}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27
 * FinancialInstrumentAttributes27}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14
 * FinancialInstrumentAttributes14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30
 * FinancialInstrumentAttributes30}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28
 * FinancialInstrumentAttributes28}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProperties1Choice
 * FinancialInstrumentProperties1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingAttributes
 * UnderlyingAttributes}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1
 * FinancialInstrumentAttributes1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31
 * FinancialInstrumentAttributes31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44
 * FinancialInstrumentAttributes44}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15
 * FinancialInstrumentAttributes15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral1
 * OtherTypeOfCollateral1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral1
 * OtherCollateral1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29
 * FinancialInstrumentAttributes29}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType1Choice
 * InstrumentSubStructureType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnderlyingAttributes2
 * UnderlyingAttributes2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityAttributes1
 * SecurityAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2
 * FinancialInstrumentAttributes2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48
 * FinancialInstrumentAttributes48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50
 * FinancialInstrumentAttributes50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49
 * FinancialInstrumentAttributes49}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55
 * FinancialInstrumentAttributes55}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57
 * FinancialInstrumentAttributes57}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56
 * FinancialInstrumentAttributes56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral2
 * OtherCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherTypeOfCollateral2
 * OtherTypeOfCollateral2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral3
 * OtherCollateral3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral4
 * OtherCollateral4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63
 * FinancialInstrumentAttributes63}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
 * FinancialInstrumentAttributes64}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68
 * FinancialInstrumentAttributes68}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66
 * FinancialInstrumentAttributes66}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65
 * FinancialInstrumentAttributes65}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67
 * FinancialInstrumentAttributes67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral7
 * OtherCollateral7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral6
 * OtherCollateral6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherCollateral5
 * OtherCollateral5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73
 * FinancialInstrumentAttributes73}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70
 * FinancialInstrumentAttributes70}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69
 * FinancialInstrumentAttributes69}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71
 * FinancialInstrumentAttributes71}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75
 * FinancialInstrumentAttributes75}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78
 * FinancialInstrumentAttributes78}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79
 * FinancialInstrumentAttributes79}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81
 * FinancialInstrumentAttributes81}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80
 * FinancialInstrumentAttributes80}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85
 * FinancialInstrumentAttributes85}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84
 * FinancialInstrumentAttributes84}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83
 * FinancialInstrumentAttributes83}</li>
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
 * "Asset"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * </ul>
 */
public class Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which an order, a privilege, an entitlement or an offer
	 * terminates. For an interest bearing asset, it is the date/time at which
	 * it becomes due and has to be repaid.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#ExpiryDate
	 * FinancialInstrumentAttributes8.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#ExpiryDate
	 * FinancialInstrumentAttributes20.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#ExpiryDate
	 * FinancialInstrumentAttributes35.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#ExpiryDate
	 * FinancialInstrumentAttributes41.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#ExpiryDate
	 * FinancialInstrumentAttributes6.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#ExpiryDate
	 * FinancialInstrumentAttributes9.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#ExpiryDate
	 * FinancialInstrumentAttributes18.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#ExpiryDate
	 * FinancialInstrumentAttributes22.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#ExpiryDate
	 * FinancialInstrumentAttributes32.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#ExpiryDate
	 * FinancialInstrumentAttributes38.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#ExpiryDate
	 * FinancialInstrumentAttributes7.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#ExpiryDate
	 * FinancialInstrumentAttributes11.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#ExpiryDate
	 * FinancialInstrumentAttributes19.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#ExpiryDate
	 * FinancialInstrumentAttributes23.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#ExpiryDate
	 * FinancialInstrumentAttributes33.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#ExpiryDate
	 * FinancialInstrumentAttributes39.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#ExpiryDate
	 * FinancialInstrumentAttributes43.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#ExpiryDate
	 * FinancialInstrumentAttributes45.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#ExpiryDate
	 * FinancialInstrumentAttributes3.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#ExpiryDate
	 * FinancialInstrumentAttributes12.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#ExpiryDate
	 * FinancialInstrumentAttributes17.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#ExpiryDate
	 * FinancialInstrumentAttributes25.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#ExpiryDate
	 * FinancialInstrumentAttributes46.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#ExpiryDate
	 * FinancialInstrumentAttributes47.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#ExpiryDate
	 * FinancialInstrumentAttributes4.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#ExpiryDate
	 * FinancialInstrumentAttributes13.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#ExpiryDate
	 * FinancialInstrumentAttributes21.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#ExpiryDate
	 * FinancialInstrumentAttributes26.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#ExpiryDate
	 * FinancialInstrumentAttributes36.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#ExpiryDate
	 * FinancialInstrumentAttributes42.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#ExpiryDate
	 * FinancialInstrumentAttributes27.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#ExpiryDate
	 * FinancialInstrumentAttributes14.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#ExpiryDate
	 * FinancialInstrumentAttributes30.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#ExpiryDate
	 * FinancialInstrumentAttributes28.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#ExpiryDate
	 * Option1.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant1#ExpiryDate
	 * Warrant1.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#ExpiryDate
	 * Future1.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#ExpirationDate
	 * FinancialInstrumentStipulations.ExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ExpiryDate
	 * FinancialInstrumentAttributes31.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#ExpirationDate
	 * FinancialInstrumentStipulations2.ExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ExpiryDate
	 * FinancialInstrumentAttributes44.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#ExpiryDate
	 * FinancialInstrumentAttributes15.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#ExpiryDate
	 * OtherCollateral1.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#ExpiryDate
	 * FinancialInstrumentAttributes29.ExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#ExpirationDate
	 * Debt2.ExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#ExpiryDate
	 * CommonFinancialInstrumentAttributes1.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ExpiryDate
	 * FinancialInstrumentAttributes2.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#ExpiryDate
	 * FinancialInstrumentAttributes48.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#ExpiryDate
	 * FinancialInstrumentAttributes50.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#ExpiryDate
	 * FinancialInstrumentAttributes55.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#ExpiryDate
	 * FinancialInstrumentAttributes57.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#ExpiryDate
	 * OtherCollateral2.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#ExpiryDate
	 * OtherCollateral3.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#ExpiryDate
	 * OtherCollateral4.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#ExpiryDate
	 * FinancialInstrumentAttributes63.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#ExpiryDate
	 * FinancialInstrumentAttributes64.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#ExpiryDate
	 * FinancialInstrumentAttributes68.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#ExpiryDate
	 * FinancialInstrumentAttributes66.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ExpiryDate
	 * FinancialInstrumentAttributes65.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#ExpiryDate
	 * OtherCollateral7.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#ExpiryDate
	 * OtherCollateral6.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#ExpiryDate
	 * OtherCollateral5.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#ExpiryDate
	 * FinancialInstrumentAttributes73.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#ExpiryDate
	 * FinancialInstrumentAttributes70.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#ExpiryDate
	 * FinancialInstrumentAttributes69.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#ExpiryDate
	 * FinancialInstrumentAttributes75.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#ExpiryDate
	 * FinancialInstrumentAttributes78.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#ExpiryDate
	 * FinancialInstrumentAttributes79.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ExpiryDate
	 * FinancialInstrumentAttributes81.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#ExpiryDate
	 * FinancialInstrumentAttributes85.ExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#ExpiryDate
	 * FinancialInstrumentAttributes84.ExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes18.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes22.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes32.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes38.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes7.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes19.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes33.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes43.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes45.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes3.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes12.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes17.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes25.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes46.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes47.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes4.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes13.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes21.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes26.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes36.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes42.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes27.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes14.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes30.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes28.ExpiryDate, com.tools20022.repository.msg.Option1.ExpiryDate, com.tools20022.repository.msg.Warrant1.ExpiryDate,
					com.tools20022.repository.msg.Future1.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentStipulations.ExpirationDate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.ExpirationDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.ExpiryDate, com.tools20022.repository.msg.OtherCollateral1.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes29.ExpiryDate,
					com.tools20022.repository.msg.Debt2.ExpirationDate, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes2.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes50.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.ExpiryDate, com.tools20022.repository.msg.OtherCollateral2.ExpiryDate,
					com.tools20022.repository.msg.OtherCollateral3.ExpiryDate, com.tools20022.repository.msg.OtherCollateral4.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes63.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes68.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes65.ExpiryDate, com.tools20022.repository.msg.OtherCollateral7.ExpiryDate,
					com.tools20022.repository.msg.OtherCollateral6.ExpiryDate, com.tools20022.repository.msg.OtherCollateral5.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes73.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes69.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes75.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes78.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes79.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes81.ExpiryDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.ExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.ExpiryDate);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Planned date, at the time of issuance, on which an interest bearing
	 * financial instrument becomes due and principal is repaid by the issuer to
	 * the investor.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#MaturityDate
	 * FinancialInstrumentAttributes8.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#MaturityDate
	 * FinancialInstrumentAttributes20.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#MaturityDate
	 * FinancialInstrumentAttributes35.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#MaturityDate
	 * FinancialInstrumentAttributes41.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#MaturityDate
	 * FinancialInstrumentAttributes6.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#MaturityDate
	 * FinancialInstrumentAttributes9.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#MaturityDate
	 * FinancialInstrumentAttributes18.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#MaturityDate
	 * FinancialInstrumentAttributes22.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#MaturityDate
	 * FinancialInstrumentAttributes32.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#MaturityDate
	 * FinancialInstrumentAttributes38.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#MaturityDate
	 * FinancialInstrumentAttributes7.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#MaturityDate
	 * FinancialInstrumentAttributes5.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#MaturityDate
	 * FinancialInstrumentAttributes11.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#MaturityDate
	 * FinancialInstrumentAttributes10.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#MaturityDate
	 * FinancialInstrumentAttributes19.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#MaturityDate
	 * FinancialInstrumentAttributes16.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#MaturityDate
	 * FinancialInstrumentAttributes23.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#MaturityDate
	 * FinancialInstrumentAttributes24.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#MaturityDate
	 * FinancialInstrumentAttributes33.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#MaturityDate
	 * FinancialInstrumentAttributes34.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#MaturityDate
	 * FinancialInstrumentAttributes39.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#MaturityDate
	 * FinancialInstrumentAttributes40.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#MaturityDate
	 * FinancialInstrumentAttributes43.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#MaturityDate
	 * FinancialInstrumentAttributes45.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#MaturityDate
	 * CorporateActionDate1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#MaturityDate
	 * CorporateActionDate13.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#NewMaturityDate
	 * CorporateActionDate14.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#NewMaturityDate
	 * CorporateActionDate21.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#NewMaturityDate
	 * CorporateActionDate22.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#NewMaturityDate
	 * CorporateActionDate25.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#NewMaturityDate
	 * CorporateActionDate27.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#NewMaturityDate
	 * CorporateActionDate28.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#MaturityDate
	 * FinancialInstrumentAttributes4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#MaturityDate
	 * FinancialInstrumentAttributes13.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#MaturityDate
	 * FinancialInstrumentAttributes21.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#MaturityDate
	 * FinancialInstrumentAttributes26.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#MaturityDate
	 * FinancialInstrumentAttributes36.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#MaturityDate
	 * FinancialInstrumentAttributes42.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#MaturityDate
	 * FinancialInstrumentAttributes27.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#MaturityDate
	 * FinancialInstrumentAttributes14.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#MaturityDate
	 * FinancialInstrumentAttributes30.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#MaturityDate
	 * FinancialInstrumentAttributes28.MaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#MaturityDate
	 * Equity1.MaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#MaturityDate
	 * Debt1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#MaturityDate
	 * FinancialInstrumentStipulations.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#MaturityDate
	 * FinancialInstrumentAttributes31.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#MaturityDate
	 * FinancialInstrumentStipulations2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#MaturityDate
	 * FinancialInstrumentAttributes44.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#MaturityDate
	 * CorporateActionDate2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#MaturityDate
	 * SecurityInstrumentDescription1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#MaturityDate
	 * SecurityInstrumentDescription2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#MaturityDate
	 * FinancialInstrumentAttributes15.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#MaturityDate
	 * SecuritiesCollateral1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#MaturityDate
	 * CashCollateral1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#MaturityDate
	 * FinancialInstrumentAttributes29.MaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#MaturityDate
	 * Equity2.MaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#MaturityDate
	 * Debt2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#MaturityDate
	 * FinancialInstrumentAttributes2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#MaturityDate
	 * FinancialInstrumentAttributes48.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#MaturityDate
	 * FinancialInstrumentAttributes50.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#MaturityDate
	 * FinancialInstrumentAttributes49.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#MaturityDate
	 * FinancialInstrumentAttributes55.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#MaturityDate
	 * FinancialInstrumentAttributes57.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#MaturityDate
	 * FinancialInstrumentAttributes56.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#MaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#MaturityDate
	 * SecuritiesCollateral2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#MaturityDate
	 * CashCollateral3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#MaturityDate
	 * SecuritiesCollateral3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#MaturityDate
	 * CashCollateral4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#MaturityDate
	 * CashCollateral2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#MaturityDate
	 * SecuritiesCollateral4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#MaturityDate
	 * CashCollateral5.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#MaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#MaturityDate
	 * ForeignExchangeSwapTransaction1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#MaturityDate
	 * UnsecuredMarketTransaction1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#MaturityDate
	 * OvernightIndexSwapTransaction1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#MaturityDate
	 * SecuredMarketTransaction1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#MaturityDate
	 * DebtInstrument2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#ExpectedDate
	 * LoanContractTranche1.ExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#DueDate
	 * LoanContractTranche1.DueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#MaturityDate
	 * LoanContract1.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#MaturityDate
	 * FinancialInstrumentAttributes63.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#MaturityDate
	 * FinancialInstrumentAttributes64.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#MaturityDate
	 * FinancialInstrumentAttributes66.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#MaturityDate
	 * FinancialInstrumentAttributes65.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#MaturityDate
	 * FinancialInstrumentAttributes67.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#NewMaturityDate
	 * CorporateActionDate44.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#MaturityDate
	 * SecuritiesCollateral6.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#MaturityDate
	 * SecuritiesCollateral5.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#MaturityDate
	 * SecuritiesCollateral7.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#MaturityDate
	 * FinancialInstrumentAttributes70.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#MaturityDate
	 * FinancialInstrumentAttributes69.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#NewMaturityDate
	 * CorporateActionDate58.NewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#MaturityDate
	 * FinancialInstrumentAttributes71.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#MaturityDate
	 * FinancialInstrumentAttributes75.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#MaturityDate
	 * FinancialInstrumentAttributes78.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD4#MaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#MaturityDate
	 * UnsecuredMarketTransaction2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#MaturityDate
	 * ForeignExchangeSwapTransaction2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#MaturityDate
	 * SecuredMarketTransaction2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#MaturityDate
	 * UnsecuredMarketTransaction3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#MaturityDate
	 * OvernightIndexSwapTransaction3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#MaturityDate
	 * SecuredMarketTransaction3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument4#MaturityDate
	 * DebtInstrument4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#MaturityDate
	 * TransparencyDataReport10.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument5#IssuanceDate
	 * DebtInstrument5.IssuanceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#UnderlyingSwapMaturityDate
	 * InterestRateDerivative5.UnderlyingSwapMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BondDerivative2#MaturityDate
	 * BondDerivative2.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#MaturityDate
	 * FinancialInstrumentAttributes79.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#MaturityDate
	 * FinancialInstrumentAttributes81.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#MaturityDate
	 * FinancialInstrumentAttributes80.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD5#MaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD5.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#MaturityDate
	 * SecuritiesCollateral8.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#MaturityDate
	 * FinancialInstrumentAttributes85.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#MaturityDate
	 * FinancialInstrumentAttributes84.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#MaturityDate
	 * FinancialInstrumentAttributes83.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#MaturityDate
	 * SecuredMarketTransaction4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#MaturityDate
	 * ForeignExchangeSwapTransaction3.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#MaturityDate
	 * OvernightIndexSwapTransaction4.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#MaturityDate
	 * UnsecuredMarketTransaction4.MaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes20.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes41.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes9.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes22.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes38.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes5.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes10.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes16.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes24.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes34.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes40.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes45.MaturityDate, com.tools20022.repository.msg.CorporateActionDate1.MaturityDate,
					com.tools20022.repository.msg.CorporateActionDate13.MaturityDate, com.tools20022.repository.msg.CorporateActionDate14.NewMaturityDate, com.tools20022.repository.msg.CorporateActionDate21.NewMaturityDate,
					com.tools20022.repository.msg.CorporateActionDate22.NewMaturityDate, com.tools20022.repository.msg.CorporateActionDate25.NewMaturityDate, com.tools20022.repository.msg.CorporateActionDate27.NewMaturityDate,
					com.tools20022.repository.msg.CorporateActionDate28.NewMaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes4.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes13.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes26.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes42.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes14.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes28.MaturityDate, com.tools20022.repository.msg.Equity1.MaturityDate,
					com.tools20022.repository.msg.Debt1.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentStipulations.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes31.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentStipulations2.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes44.MaturityDate, com.tools20022.repository.msg.CorporateActionDate2.MaturityDate,
					com.tools20022.repository.msg.SecurityInstrumentDescription1.MaturityDate, com.tools20022.repository.msg.SecurityInstrumentDescription2.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.MaturityDate, com.tools20022.repository.msg.SecuritiesCollateral1.MaturityDate, com.tools20022.repository.msg.CashCollateral1.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.MaturityDate, com.tools20022.repository.msg.Equity2.MaturityDate, com.tools20022.repository.msg.Debt2.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes48.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes50.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes49.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes55.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes57.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes56.MaturityDate, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2.MaturityDate,
					com.tools20022.repository.msg.SecuritiesCollateral2.MaturityDate, com.tools20022.repository.msg.CashCollateral3.MaturityDate, com.tools20022.repository.msg.SecuritiesCollateral3.MaturityDate,
					com.tools20022.repository.msg.CashCollateral4.MaturityDate, com.tools20022.repository.msg.CashCollateral2.MaturityDate, com.tools20022.repository.msg.SecuritiesCollateral4.MaturityDate,
					com.tools20022.repository.msg.CashCollateral5.MaturityDate, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3.MaturityDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.MaturityDate, com.tools20022.repository.msg.UnsecuredMarketTransaction1.MaturityDate,
					com.tools20022.repository.msg.OvernightIndexSwapTransaction1.MaturityDate, com.tools20022.repository.msg.SecuredMarketTransaction1.MaturityDate, com.tools20022.repository.msg.DebtInstrument2.MaturityDate,
					com.tools20022.repository.msg.LoanContractTranche1.ExpectedDate, com.tools20022.repository.msg.LoanContractTranche1.DueDate, com.tools20022.repository.msg.LoanContract1.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes63.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes64.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes66.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes65.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes67.MaturityDate, com.tools20022.repository.msg.CorporateActionDate44.NewMaturityDate, com.tools20022.repository.msg.SecuritiesCollateral6.MaturityDate,
					com.tools20022.repository.msg.SecuritiesCollateral5.MaturityDate, com.tools20022.repository.msg.SecuritiesCollateral7.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes70.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes69.MaturityDate, com.tools20022.repository.msg.CorporateActionDate58.NewMaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes75.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.MaturityDate, com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD4.MaturityDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.MaturityDate, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.MaturityDate, com.tools20022.repository.msg.SecuredMarketTransaction2.MaturityDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction3.MaturityDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction3.MaturityDate, com.tools20022.repository.msg.SecuredMarketTransaction3.MaturityDate,
					com.tools20022.repository.msg.DebtInstrument4.MaturityDate, com.tools20022.repository.msg.TransparencyDataReport10.MaturityDate, com.tools20022.repository.msg.DebtInstrument5.IssuanceDate,
					com.tools20022.repository.msg.InterestRateDerivative5.UnderlyingSwapMaturityDate, com.tools20022.repository.msg.BondDerivative2.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes79.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes80.MaturityDate,
					com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD5.MaturityDate, com.tools20022.repository.msg.SecuritiesCollateral8.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.MaturityDate, com.tools20022.repository.msg.FinancialInstrumentAttributes84.MaturityDate,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.MaturityDate, com.tools20022.repository.msg.SecuredMarketTransaction4.MaturityDate,
					com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.MaturityDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.MaturityDate,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.MaturityDate);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the parameters of a derivative instrument based on a specific
	 * asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#UnderlyingAsset
	 * Derivative.UnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation8.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation11.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation13.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation15.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation17.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation19.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation22.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation23.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#FutureOrOptionDetails
	 * TwoLegTransactionType1Choice.FutureOrOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument28#Derivative
	 * FinancialInstrument28.Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument2#AdditionalDerivativeAttributes
	 * FinancialInstrument2.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation26.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation27.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation31.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#AdditionalDerivativeAttributes
	 * AggregateBalanceInformation32.AdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#DerivativeInstrumentAttributes
	 * SecuritiesReferenceDataReport5.DerivativeInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#Derivative
	 * TransparencyDataReport10.Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#DerivativeInstrumentAttributes
	 * SecurityInstrumentDescription13.DerivativeInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of a derivative instrument based on a specific asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Derivative = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalanceInformation8.AdditionalDerivativeAttributes, com.tools20022.repository.msg.AggregateBalanceInformation11.AdditionalDerivativeAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation13.AdditionalDerivativeAttributes, com.tools20022.repository.msg.AggregateBalanceInformation15.AdditionalDerivativeAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation17.AdditionalDerivativeAttributes, com.tools20022.repository.msg.AggregateBalanceInformation19.AdditionalDerivativeAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation22.AdditionalDerivativeAttributes, com.tools20022.repository.msg.AggregateBalanceInformation23.AdditionalDerivativeAttributes,
					com.tools20022.repository.choice.TwoLegTransactionType1Choice.FutureOrOptionDetails, com.tools20022.repository.msg.FinancialInstrument28.Derivative,
					com.tools20022.repository.msg.FinancialInstrument2.AdditionalDerivativeAttributes, com.tools20022.repository.msg.AggregateBalanceInformation26.AdditionalDerivativeAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation27.AdditionalDerivativeAttributes, com.tools20022.repository.msg.AggregateBalanceInformation31.AdditionalDerivativeAttributes,
					com.tools20022.repository.msg.AggregateBalanceInformation32.AdditionalDerivativeAttributes, com.tools20022.repository.msg.SecuritiesReferenceDataReport5.DerivativeInstrumentAttributes,
					com.tools20022.repository.msg.TransparencyDataReport10.Derivative, com.tools20022.repository.msg.SecurityInstrumentDescription13.DerivativeInstrumentAttributes);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.UnderlyingAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different values of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Asset
	 * AssetHolding.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#AccountBaseCurrencyAmounts
	 * QuantityBreakdown4.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#InstrumentCurrencyAmounts
	 * QuantityBreakdown4.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown4.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#AccountBaseCurrencyAmounts
	 * QuantityBreakdown8.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#InstrumentCurrencyAmounts
	 * QuantityBreakdown8.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown8.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#AccountBaseCurrencyAmounts
	 * QuantityBreakdown14.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#InstrumentCurrencyAmounts
	 * QuantityBreakdown14.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown14.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#AccountBaseCurrencyAmounts
	 * QuantityBreakdown19.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#InstrumentCurrencyAmounts
	 * QuantityBreakdown19.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown19.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#AccountBaseCurrencyAmounts
	 * QuantityBreakdown24.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#InstrumentCurrencyAmounts
	 * QuantityBreakdown24.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown24.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#AccountBaseCurrencyAmounts
	 * QuantityBreakdown25.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#InstrumentCurrencyAmounts
	 * QuantityBreakdown25.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown25.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#AccountBaseCurrencyAmounts
	 * QuantityBreakDown2.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#InstrumentCurrencyAmounts
	 * QuantityBreakDown2.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#AlternateReportingCurrencyAmounts
	 * QuantityBreakDown2.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#AccountBaseCurrencyAmounts
	 * QuantityBreakdown28.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#InstrumentCurrencyAmounts
	 * QuantityBreakdown28.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown28.AlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#AccountBaseCurrencyAmounts
	 * QuantityBreakdown39.AccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#InstrumentCurrencyAmounts
	 * QuantityBreakdown39.InstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#AlternateReportingCurrencyAmounts
	 * QuantityBreakdown39.AlternateReportingCurrencyAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the different values of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityBreakdown4.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown4.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown4.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown8.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown8.InstrumentCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown8.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown14.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown14.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown14.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown19.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown19.InstrumentCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown19.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown24.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown24.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown24.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown25.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown25.InstrumentCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown25.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakDown2.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakDown2.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakDown2.AlternateReportingCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown28.AccountBaseCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown28.InstrumentCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown28.AlternateReportingCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown39.AccountBaseCurrencyAmounts, com.tools20022.repository.msg.QuantityBreakdown39.InstrumentCurrencyAmounts,
					com.tools20022.repository.msg.QuantityBreakdown39.AlternateReportingCurrencyAmounts);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetValue";
			definition = "Specifies the different values of an asset.";
			minOccurs = 0;
			type_lazy = () -> AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Classification of the asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#Asset
	 * AssetClassification.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#ClassificationType
	 * AdditionalInformation3.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#ClassificationType
	 * AdditionalInformation4.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#ClassificationType
	 * AdditionalInformation7.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#ClassificationType
	 * AdditionalInformation8.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#ProductType
	 * FinancialInstrumentAttributes1.ProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#ClassificationType
	 * CommonFinancialInstrumentAttributes1.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#ClassificationType
	 * AdditionalInformation9.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#ClassificationType
	 * AdditionalInformation10.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#ClassificationType
	 * AdditionalInformation11.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#ClassificationType
	 * AdditionalInformation12.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#ClassificationType
	 * AdditionalInformation13.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#ClassificationType
	 * AdditionalInformation14.ClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classification of the asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetClassification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalInformation3.ClassificationType, com.tools20022.repository.msg.AdditionalInformation4.ClassificationType,
					com.tools20022.repository.msg.AdditionalInformation7.ClassificationType, com.tools20022.repository.msg.AdditionalInformation8.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes1.ProductType,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.ClassificationType, com.tools20022.repository.msg.AdditionalInformation9.ClassificationType,
					com.tools20022.repository.msg.AdditionalInformation10.ClassificationType, com.tools20022.repository.msg.AdditionalInformation11.ClassificationType,
					com.tools20022.repository.msg.AdditionalInformation12.ClassificationType, com.tools20022.repository.msg.AdditionalInformation13.ClassificationType,
					com.tools20022.repository.msg.AdditionalInformation14.ClassificationType);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClassification";
			definition = "Classification of the asset.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Categorization of financial asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#Category
	 * BalanceDetails6.Category}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#FXType
	 * DerivativeForeignExchange3.FXType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAssetCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Categorization of financial asset type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialAssetCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails6.Category, com.tools20022.repository.msg.DerivativeForeignExchange3.FXType);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetCategory";
			definition = "Categorization of financial asset type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
		}
	};
	/**
	 * Party which plays a role for a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetPartyRole#Asset
	 * AssetPartyRole.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetPartyRole
	 * AssetPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#OtherBusinessParties
	 * InstrumentLeg2.OtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#OtherBusinessParties
	 * InstrumentLeg3.OtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which plays a role for a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg2.OtherBusinessParties, com.tools20022.repository.msg.InstrumentLeg3.OtherBusinessParties);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetPartyRole";
			definition = "Party which plays a role for a specific asset.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details regarding the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssuedAsset
	 * Issuance.IssuedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#GlobalType
	 * Debt2.GlobalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#Issuance
	 * CommonFinancialInstrumentAttributes1.Issuance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding the issuance of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt2.GlobalType, com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.Issuance);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssuedAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset which is part of a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#AssetDescription
	 * Portfolio.AssetDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is part of a portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Asset which is part of a portfolio.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.AssetDescription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invested amount of the portfolio asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invested amount of the portfolio asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAmount";
			definition = "Invested amount of the portfolio asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Invested percentage of the portfolio asset.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invested percentage of the portfolio asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentRate";
			definition = "Invested percentage of the portfolio asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Cut off date/time for the information of the specified portfolio asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cut off date/time for the information of the specified portfolio asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Cut off date/time for the information of the specified portfolio asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the type of deal for structured finance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType1Choice#Code
	 * InstrumentSubStructureType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType1Choice#Proprietary
	 * InstrumentSubStructureType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#InstrumentStructureType
	 * Debt2.InstrumentStructureType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentSubStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of deal for structured finance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialInstrumentSubStructure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstrumentSubStructureType1Choice.Code, com.tools20022.repository.choice.InstrumentSubStructureType1Choice.Proprietary,
					com.tools20022.repository.msg.Debt2.InstrumentStructureType);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentSubStructure";
			definition = "Indicates the type of deal for structured finance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
		}
	};
	/**
	 * Investment plan that invests in a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#Asset
	 * InvestmentPlan.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan that invests in a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan that invests in a specific asset.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade which which involves a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#Asset
	 * Trade.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which which involves a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade which which involves a specific asset.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * One of a number of related assets offered as part of the same
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tranche#Asset
	 * Tranche.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tranche Tranche}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Tranche
	 * LoanContract1.Tranche}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranche"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of a number of related assets offered as part of the same transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tranche = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.Tranche);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One of a number of related assets offered as part of the same transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tranche.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides details about the leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Leg#RelatedAsset
	 * Leg.RelatedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#LegAttributes
	 * FinancialInstrumentAttributes1.LegAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#InstrumentLegGroupDetails
	 * QuoteEntry2.InstrumentLegGroupDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#LegFinancialInstrumentAttributes
	 * QuoteEntry2.LegFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry1#InstrumentLegGroupDetails
	 * QuoteEntry1.InstrumentLegGroupDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1#LegGroupDetails
	 * MultiLegOrder1.LegGroupDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#InstrumentLegGroupDetails
	 * IndicationOfInterest1.InstrumentLegGroupDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LegAdditionalInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.LegAttributes, com.tools20022.repository.msg.QuoteEntry2.InstrumentLegGroupDetails,
					com.tools20022.repository.msg.QuoteEntry2.LegFinancialInstrumentAttributes, com.tools20022.repository.msg.QuoteEntry1.InstrumentLegGroupDetails, com.tools20022.repository.msg.MultiLegOrder1.LegGroupDetails,
					com.tools20022.repository.msg.IndicationOfInterest1.InstrumentLegGroupDetails);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegAdditionalInformation";
			definition = "Provides details about the leg.";
			minOccurs = 0;
			type_lazy = () -> Leg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.RelatedAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing settlement instruction for which an asset is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Asset
	 * StandingSettlementInstruction.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing settlement instruction for which an asset is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Standing settlement instruction for which an asset is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Asset";
				definition = "Tangible items of value to a business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Asset, com.tools20022.repository.entity.InvestmentPlan.Asset, com.tools20022.repository.entity.Portfolio.AssetDescription,
						com.tools20022.repository.entity.AssetHolding.Asset, com.tools20022.repository.entity.AssetPartyRole.Asset, com.tools20022.repository.entity.AssetClassification.Asset,
						com.tools20022.repository.entity.Derivative.UnderlyingAsset, com.tools20022.repository.entity.Issuance.IssuedAsset, com.tools20022.repository.entity.StandingSettlementInstruction.Asset,
						com.tools20022.repository.entity.Leg.RelatedAsset, com.tools20022.repository.entity.Tranche.Asset);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.Properties, com.tools20022.repository.msg.FinancialInstrumentAttributes1.AdditionalUnderlyingAttributes,
						com.tools20022.repository.msg.OtherCollateral1.OtherTypeOfCollateral, com.tools20022.repository.msg.CollateralSubstitution1.OtherCollateral, com.tools20022.repository.msg.CollateralValuation1.OtherCollateralDetails,
						com.tools20022.repository.msg.SecurityAttributes1.FinancialInstrumentType, com.tools20022.repository.msg.CollateralSubstitution2.OtherCollateral, com.tools20022.repository.msg.CollateralValuation2.OtherCollateral,
						com.tools20022.repository.msg.OtherCollateral2.OtherTypeOfCollateral, com.tools20022.repository.msg.OtherCollateral3.LetterOfCreditIdentification,
						com.tools20022.repository.msg.OtherCollateral3.OtherTypeOfCollateral, com.tools20022.repository.msg.OtherCollateral4.OtherTypeOfCollateral, com.tools20022.repository.msg.CollateralSubstitution3.OtherCollateral,
						com.tools20022.repository.msg.CollateralSubstitution5.OtherCollateral, com.tools20022.repository.msg.CollateralSubstitution4.OtherCollateral, com.tools20022.repository.msg.OtherCollateral7.OtherTypeOfCollateral,
						com.tools20022.repository.msg.CollateralValuation5.OtherCollateral, com.tools20022.repository.msg.OtherCollateral6.LetterOfCreditIdentification, com.tools20022.repository.msg.OtherCollateral6.OtherTypeOfCollateral,
						com.tools20022.repository.msg.OtherCollateral5.OtherTypeOfCollateral);
				subType_lazy = () -> Arrays.asList(Security.mmObject(), com.tools20022.repository.entity.Derivative.mmObject(), Money.mmObject(), LetterOfCredit.mmObject(), Guarantee.mmObject(), Commodity.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.ExpiryDate, com.tools20022.repository.entity.Asset.MaturityDate, com.tools20022.repository.entity.Asset.Derivative,
						com.tools20022.repository.entity.Asset.AssetValue, com.tools20022.repository.entity.Asset.AssetClassification, com.tools20022.repository.entity.Asset.FinancialAssetCategory,
						com.tools20022.repository.entity.Asset.AssetPartyRole, com.tools20022.repository.entity.Asset.Issuance, com.tools20022.repository.entity.Asset.Portfolio, com.tools20022.repository.entity.Asset.InvestmentAmount,
						com.tools20022.repository.entity.Asset.InvestmentRate, com.tools20022.repository.entity.Asset.EffectiveDate, com.tools20022.repository.entity.Asset.FinancialInstrumentSubStructure,
						com.tools20022.repository.entity.Asset.InvestmentPlan, com.tools20022.repository.entity.Asset.Trade, com.tools20022.repository.entity.Asset.Tranche, com.tools20022.repository.entity.Asset.LegAdditionalInformation,
						com.tools20022.repository.entity.Asset.StandingSettlementInstruction);
				derivationComponent_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmObject(), FinancialInstrumentAttributes20.mmObject(), FinancialInstrumentAttributes35.mmObject(), FinancialInstrumentAttributes41.mmObject(),
						FinancialInstrumentAttributes6.mmObject(), FinancialInstrumentAttributes9.mmObject(), FinancialInstrumentAttributes18.mmObject(), FinancialInstrumentAttributes22.mmObject(),
						FinancialInstrumentAttributes32.mmObject(), FinancialInstrumentAttributes38.mmObject(), FinancialInstrumentAttributes7.mmObject(), FinancialInstrumentAttributes5.mmObject(),
						FinancialInstrumentAttributes11.mmObject(), FinancialInstrumentAttributes10.mmObject(), FinancialInstrumentAttributes19.mmObject(), FinancialInstrumentAttributes16.mmObject(),
						FinancialInstrumentAttributes23.mmObject(), FinancialInstrumentAttributes24.mmObject(), FinancialInstrumentAttributes33.mmObject(), FinancialInstrumentAttributes34.mmObject(),
						FinancialInstrumentAttributes39.mmObject(), FinancialInstrumentAttributes40.mmObject(), FinancialInstrumentAttributes43.mmObject(), FinancialInstrumentAttributes45.mmObject(),
						FinancialInstrumentAttributes3.mmObject(), FinancialInstrumentAttributes12.mmObject(), FinancialInstrumentAttributes17.mmObject(), FinancialInstrumentAttributes25.mmObject(),
						FinancialInstrumentAttributes46.mmObject(), FinancialInstrumentAttributes47.mmObject(), FinancialInstrumentAttributes4.mmObject(), FinancialInstrumentAttributes13.mmObject(),
						FinancialInstrumentAttributes21.mmObject(), FinancialInstrumentAttributes26.mmObject(), FinancialInstrumentAttributes36.mmObject(), FinancialInstrumentAttributes42.mmObject(),
						FinancialInstrumentAttributes27.mmObject(), FinancialInstrumentAttributes14.mmObject(), FinancialInstrumentAttributes30.mmObject(), FinancialInstrumentAttributes28.mmObject(),
						FinancialInstrumentProperties1Choice.mmObject(), UnderlyingAttributes.mmObject(), FinancialInstrumentAttributes1.mmObject(), FinancialInstrumentAttributes31.mmObject(), FinancialInstrumentAttributes44.mmObject(),
						FinancialInstrumentAttributes15.mmObject(), OtherTypeOfCollateral1.mmObject(), OtherCollateral1.mmObject(), FinancialInstrumentAttributes29.mmObject(), InstrumentSubStructureType1Choice.mmObject(),
						UnderlyingAttributes2.mmObject(), SecurityAttributes1.mmObject(), FinancialInstrumentAttributes2.mmObject(), FinancialInstrumentAttributes48.mmObject(), FinancialInstrumentAttributes50.mmObject(),
						FinancialInstrumentAttributes49.mmObject(), FinancialInstrumentAttributes55.mmObject(), FinancialInstrumentAttributes57.mmObject(), FinancialInstrumentAttributes56.mmObject(), OtherCollateral2.mmObject(),
						OtherTypeOfCollateral2.mmObject(), OtherCollateral3.mmObject(), OtherCollateral4.mmObject(), FinancialInstrumentAttributes63.mmObject(), FinancialInstrumentAttributes64.mmObject(),
						FinancialInstrumentAttributes68.mmObject(), FinancialInstrumentAttributes66.mmObject(), FinancialInstrumentAttributes65.mmObject(), FinancialInstrumentAttributes67.mmObject(), OtherCollateral7.mmObject(),
						OtherCollateral6.mmObject(), OtherCollateral5.mmObject(), FinancialInstrumentAttributes73.mmObject(), FinancialInstrumentAttributes70.mmObject(), FinancialInstrumentAttributes69.mmObject(),
						FinancialInstrumentAttributes71.mmObject(), FinancialInstrumentAttributes75.mmObject(), FinancialInstrumentAttributes78.mmObject(), FinancialInstrumentAttributes79.mmObject(),
						FinancialInstrumentAttributes81.mmObject(), FinancialInstrumentAttributes80.mmObject(), FinancialInstrumentAttributes85.mmObject(), FinancialInstrumentAttributes84.mmObject(),
						FinancialInstrumentAttributes83.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}