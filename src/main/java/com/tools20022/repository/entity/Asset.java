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
import com.tools20022.repository.choice.FinancialInstrumentProperties1Choice;
import com.tools20022.repository.choice.InstrumentSubStructureType1Choice;
import com.tools20022.repository.choice.TwoLegTransactionType1Choice;
import com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode;
import com.tools20022.repository.codeset.InstrumentSubStructureTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
 * Asset.mmExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
 * Asset.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmDerivative
 * Asset.mmDerivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetValue
 * Asset.mmAssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
 * Asset.mmAssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialAssetCategory
 * Asset.mmFinancialAssetCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetPartyRole
 * Asset.mmAssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmIssuance
 * Asset.mmIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmPortfolio
 * Asset.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentAmount
 * Asset.mmInvestmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentRate
 * Asset.mmInvestmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmEffectiveDate
 * Asset.mmEffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmFinancialInstrumentSubStructure
 * Asset.mmFinancialInstrumentSubStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmInvestmentPlan
 * Asset.mmInvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTrade Asset.mmTrade}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmTranche
 * Asset.mmTranche}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmLegAdditionalInformation
 * Asset.mmLegAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#mmStandingSettlementInstruction
 * Asset.mmStandingSettlementInstruction}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmAsset Trade.mmAsset}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#mmAsset
 * InvestmentPlan.mmAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAssetDescription
 * Portfolio.mmAssetDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
 * AssetHolding.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole#mmAsset
 * AssetPartyRole.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
 * AssetClassification.mmAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
 * Derivative.mmUnderlyingAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#mmIssuedAsset
 * Issuance.mmIssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmAsset
 * StandingSettlementInstruction.mmAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
 * Leg.mmRelatedAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#mmAsset
 * Tranche.mmAsset}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmProperties
 * FinancialInstrumentAttributes1.mmProperties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmAdditionalUnderlyingAttributes
 * FinancialInstrumentAttributes1.mmAdditionalUnderlyingAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmOtherTypeOfCollateral
 * OtherCollateral1.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution1#mmOtherCollateral
 * CollateralSubstitution1.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmOtherCollateralDetails
 * CollateralValuation1.mmOtherCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityAttributes1#mmFinancialInstrumentType
 * SecurityAttributes1.mmFinancialInstrumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution2#mmOtherCollateral
 * CollateralSubstitution2.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmOtherCollateral
 * CollateralValuation2.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmOtherTypeOfCollateral
 * OtherCollateral2.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmLetterOfCreditIdentification
 * OtherCollateral3.mmLetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmOtherTypeOfCollateral
 * OtherCollateral3.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmOtherTypeOfCollateral
 * OtherCollateral4.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution3#mmOtherCollateral
 * CollateralSubstitution3.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmOtherCollateral
 * CollateralSubstitution5.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution4#mmOtherCollateral
 * CollateralSubstitution4.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmOtherTypeOfCollateral
 * OtherCollateral7.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmOtherCollateral
 * CollateralValuation5.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmLetterOfCreditIdentification
 * OtherCollateral6.mmLetterOfCreditIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmOtherTypeOfCollateral
 * OtherCollateral6.mmOtherTypeOfCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmOtherTypeOfCollateral
 * OtherCollateral5.mmOtherTypeOfCollateral}</li>
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
 * "Asset"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * </ul>
 */
public class Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime expiryDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmExpiryDate
	 * FinancialInstrumentAttributes8.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmExpiryDate
	 * FinancialInstrumentAttributes20.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmExpiryDate
	 * FinancialInstrumentAttributes35.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmExpiryDate
	 * FinancialInstrumentAttributes41.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmExpiryDate
	 * FinancialInstrumentAttributes6.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmExpiryDate
	 * FinancialInstrumentAttributes9.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmExpiryDate
	 * FinancialInstrumentAttributes18.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmExpiryDate
	 * FinancialInstrumentAttributes22.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmExpiryDate
	 * FinancialInstrumentAttributes32.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmExpiryDate
	 * FinancialInstrumentAttributes38.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmExpiryDate
	 * FinancialInstrumentAttributes7.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmExpiryDate
	 * FinancialInstrumentAttributes11.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmExpiryDate
	 * FinancialInstrumentAttributes19.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmExpiryDate
	 * FinancialInstrumentAttributes23.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmExpiryDate
	 * FinancialInstrumentAttributes33.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmExpiryDate
	 * FinancialInstrumentAttributes39.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmExpiryDate
	 * FinancialInstrumentAttributes43.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmExpiryDate
	 * FinancialInstrumentAttributes45.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes3#mmExpiryDate
	 * FinancialInstrumentAttributes3.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes12#mmExpiryDate
	 * FinancialInstrumentAttributes12.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes17#mmExpiryDate
	 * FinancialInstrumentAttributes17.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes25#mmExpiryDate
	 * FinancialInstrumentAttributes25.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes46#mmExpiryDate
	 * FinancialInstrumentAttributes46.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes47#mmExpiryDate
	 * FinancialInstrumentAttributes47.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmExpiryDate
	 * FinancialInstrumentAttributes4.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmExpiryDate
	 * FinancialInstrumentAttributes13.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmExpiryDate
	 * FinancialInstrumentAttributes21.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmExpiryDate
	 * FinancialInstrumentAttributes26.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmExpiryDate
	 * FinancialInstrumentAttributes36.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmExpiryDate
	 * FinancialInstrumentAttributes42.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmExpiryDate
	 * FinancialInstrumentAttributes27.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmExpiryDate
	 * FinancialInstrumentAttributes14.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmExpiryDate
	 * FinancialInstrumentAttributes30.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmExpiryDate
	 * FinancialInstrumentAttributes28.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmExpiryDate
	 * Option1.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Warrant1#mmExpiryDate
	 * Warrant1.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Future1#mmExpiryDate
	 * Future1.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmExpirationDate
	 * FinancialInstrumentStipulations.mmExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmExpiryDate
	 * FinancialInstrumentAttributes31.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmExpirationDate
	 * FinancialInstrumentStipulations2.mmExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmExpiryDate
	 * FinancialInstrumentAttributes44.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmExpiryDate
	 * FinancialInstrumentAttributes15.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral1#mmExpiryDate
	 * OtherCollateral1.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmExpiryDate
	 * FinancialInstrumentAttributes29.mmExpiryDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmExpirationDate
	 * Debt2.mmExpirationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmExpiryDate
	 * CommonFinancialInstrumentAttributes1.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmExpiryDate
	 * FinancialInstrumentAttributes2.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmExpiryDate
	 * FinancialInstrumentAttributes48.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmExpiryDate
	 * FinancialInstrumentAttributes50.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmExpiryDate
	 * FinancialInstrumentAttributes55.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmExpiryDate
	 * FinancialInstrumentAttributes57.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmExpiryDate
	 * OtherCollateral2.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmExpiryDate
	 * OtherCollateral3.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmExpiryDate
	 * OtherCollateral4.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmExpiryDate
	 * FinancialInstrumentAttributes63.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmExpiryDate
	 * FinancialInstrumentAttributes64.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes68#mmExpiryDate
	 * FinancialInstrumentAttributes68.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmExpiryDate
	 * FinancialInstrumentAttributes66.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmExpiryDate
	 * FinancialInstrumentAttributes65.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmExpiryDate
	 * OtherCollateral7.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmExpiryDate
	 * OtherCollateral6.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmExpiryDate
	 * OtherCollateral5.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes73#mmExpiryDate
	 * FinancialInstrumentAttributes73.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmExpiryDate
	 * FinancialInstrumentAttributes70.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmExpiryDate
	 * FinancialInstrumentAttributes69.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmExpiryDate
	 * FinancialInstrumentAttributes75.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmExpiryDate
	 * FinancialInstrumentAttributes78.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmExpiryDate
	 * FinancialInstrumentAttributes79.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmExpiryDate
	 * FinancialInstrumentAttributes81.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmExpiryDate
	 * FinancialInstrumentAttributes85.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmExpiryDate
	 * FinancialInstrumentAttributes84.mmExpiryDate}</li>
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
	public static final MMBusinessAttribute mmExpiryDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmExpiryDate, FinancialInstrumentAttributes20.mmExpiryDate, FinancialInstrumentAttributes35.mmExpiryDate, FinancialInstrumentAttributes41.mmExpiryDate,
					FinancialInstrumentAttributes6.mmExpiryDate, FinancialInstrumentAttributes9.mmExpiryDate, FinancialInstrumentAttributes18.mmExpiryDate, FinancialInstrumentAttributes22.mmExpiryDate,
					FinancialInstrumentAttributes32.mmExpiryDate, FinancialInstrumentAttributes38.mmExpiryDate, FinancialInstrumentAttributes7.mmExpiryDate, FinancialInstrumentAttributes11.mmExpiryDate,
					FinancialInstrumentAttributes19.mmExpiryDate, FinancialInstrumentAttributes23.mmExpiryDate, FinancialInstrumentAttributes33.mmExpiryDate, FinancialInstrumentAttributes39.mmExpiryDate,
					FinancialInstrumentAttributes43.mmExpiryDate, FinancialInstrumentAttributes45.mmExpiryDate, FinancialInstrumentAttributes3.mmExpiryDate, FinancialInstrumentAttributes12.mmExpiryDate,
					FinancialInstrumentAttributes17.mmExpiryDate, FinancialInstrumentAttributes25.mmExpiryDate, FinancialInstrumentAttributes46.mmExpiryDate, FinancialInstrumentAttributes47.mmExpiryDate,
					FinancialInstrumentAttributes4.mmExpiryDate, FinancialInstrumentAttributes13.mmExpiryDate, FinancialInstrumentAttributes21.mmExpiryDate, FinancialInstrumentAttributes26.mmExpiryDate,
					FinancialInstrumentAttributes36.mmExpiryDate, FinancialInstrumentAttributes42.mmExpiryDate, FinancialInstrumentAttributes27.mmExpiryDate, FinancialInstrumentAttributes14.mmExpiryDate,
					FinancialInstrumentAttributes30.mmExpiryDate, FinancialInstrumentAttributes28.mmExpiryDate, Option1.mmExpiryDate, Warrant1.mmExpiryDate, Future1.mmExpiryDate, FinancialInstrumentStipulations.mmExpirationDate,
					FinancialInstrumentAttributes31.mmExpiryDate, FinancialInstrumentStipulations2.mmExpirationDate, FinancialInstrumentAttributes44.mmExpiryDate, FinancialInstrumentAttributes15.mmExpiryDate, OtherCollateral1.mmExpiryDate,
					FinancialInstrumentAttributes29.mmExpiryDate, Debt2.mmExpirationDate, CommonFinancialInstrumentAttributes1.mmExpiryDate, FinancialInstrumentAttributes2.mmExpiryDate, FinancialInstrumentAttributes48.mmExpiryDate,
					FinancialInstrumentAttributes50.mmExpiryDate, FinancialInstrumentAttributes55.mmExpiryDate, FinancialInstrumentAttributes57.mmExpiryDate, OtherCollateral2.mmExpiryDate, OtherCollateral3.mmExpiryDate,
					OtherCollateral4.mmExpiryDate, FinancialInstrumentAttributes63.mmExpiryDate, FinancialInstrumentAttributes64.mmExpiryDate, FinancialInstrumentAttributes68.mmExpiryDate, FinancialInstrumentAttributes66.mmExpiryDate,
					FinancialInstrumentAttributes65.mmExpiryDate, OtherCollateral7.mmExpiryDate, OtherCollateral6.mmExpiryDate, OtherCollateral5.mmExpiryDate, FinancialInstrumentAttributes73.mmExpiryDate,
					FinancialInstrumentAttributes70.mmExpiryDate, FinancialInstrumentAttributes69.mmExpiryDate, FinancialInstrumentAttributes75.mmExpiryDate, FinancialInstrumentAttributes78.mmExpiryDate,
					FinancialInstrumentAttributes79.mmExpiryDate, FinancialInstrumentAttributes81.mmExpiryDate, FinancialInstrumentAttributes85.mmExpiryDate, FinancialInstrumentAttributes84.mmExpiryDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getExpiryDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime maturityDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmMaturityDate
	 * FinancialInstrumentAttributes8.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmMaturityDate
	 * FinancialInstrumentAttributes20.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmMaturityDate
	 * FinancialInstrumentAttributes35.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmMaturityDate
	 * FinancialInstrumentAttributes41.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmMaturityDate
	 * FinancialInstrumentAttributes6.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmMaturityDate
	 * FinancialInstrumentAttributes9.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmMaturityDate
	 * FinancialInstrumentAttributes18.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmMaturityDate
	 * FinancialInstrumentAttributes22.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmMaturityDate
	 * FinancialInstrumentAttributes32.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmMaturityDate
	 * FinancialInstrumentAttributes38.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmMaturityDate
	 * FinancialInstrumentAttributes7.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmMaturityDate
	 * FinancialInstrumentAttributes5.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmMaturityDate
	 * FinancialInstrumentAttributes11.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmMaturityDate
	 * FinancialInstrumentAttributes10.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmMaturityDate
	 * FinancialInstrumentAttributes19.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmMaturityDate
	 * FinancialInstrumentAttributes16.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmMaturityDate
	 * FinancialInstrumentAttributes23.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmMaturityDate
	 * FinancialInstrumentAttributes24.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmMaturityDate
	 * FinancialInstrumentAttributes33.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmMaturityDate
	 * FinancialInstrumentAttributes34.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmMaturityDate
	 * FinancialInstrumentAttributes39.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmMaturityDate
	 * FinancialInstrumentAttributes40.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmMaturityDate
	 * FinancialInstrumentAttributes43.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmMaturityDate
	 * FinancialInstrumentAttributes45.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmMaturityDate
	 * CorporateActionDate1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmMaturityDate
	 * CorporateActionDate13.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmNewMaturityDate
	 * CorporateActionDate14.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmNewMaturityDate
	 * CorporateActionDate21.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmNewMaturityDate
	 * CorporateActionDate22.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmNewMaturityDate
	 * CorporateActionDate25.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmNewMaturityDate
	 * CorporateActionDate27.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmNewMaturityDate
	 * CorporateActionDate28.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmMaturityDate
	 * FinancialInstrumentAttributes4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmMaturityDate
	 * FinancialInstrumentAttributes13.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmMaturityDate
	 * FinancialInstrumentAttributes21.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmMaturityDate
	 * FinancialInstrumentAttributes26.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmMaturityDate
	 * FinancialInstrumentAttributes36.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmMaturityDate
	 * FinancialInstrumentAttributes42.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmMaturityDate
	 * FinancialInstrumentAttributes27.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmMaturityDate
	 * FinancialInstrumentAttributes14.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmMaturityDate
	 * FinancialInstrumentAttributes30.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmMaturityDate
	 * FinancialInstrumentAttributes28.mmMaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmMaturityDate
	 * Equity1.mmMaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmMaturityDate
	 * Debt1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations#mmMaturityDate
	 * FinancialInstrumentStipulations.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmMaturityDate
	 * FinancialInstrumentAttributes31.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmMaturityDate
	 * FinancialInstrumentStipulations2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmMaturityDate
	 * FinancialInstrumentAttributes44.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmMaturityDate
	 * CorporateActionDate2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#mmMaturityDate
	 * SecurityInstrumentDescription1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#mmMaturityDate
	 * SecurityInstrumentDescription2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmMaturityDate
	 * FinancialInstrumentAttributes15.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1#mmMaturityDate
	 * SecuritiesCollateral1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral1#mmMaturityDate
	 * CashCollateral1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmMaturityDate
	 * FinancialInstrumentAttributes29.mmMaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Equity2#mmMaturityDate
	 * Equity2.mmMaturityDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmMaturityDate
	 * Debt2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmMaturityDate
	 * FinancialInstrumentAttributes2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmMaturityDate
	 * FinancialInstrumentAttributes48.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmMaturityDate
	 * FinancialInstrumentAttributes50.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmMaturityDate
	 * FinancialInstrumentAttributes49.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmMaturityDate
	 * FinancialInstrumentAttributes55.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmMaturityDate
	 * FinancialInstrumentAttributes57.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmMaturityDate
	 * FinancialInstrumentAttributes56.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD2#mmMaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmMaturityDate
	 * SecuritiesCollateral2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral3#mmMaturityDate
	 * CashCollateral3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmMaturityDate
	 * SecuritiesCollateral3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmMaturityDate
	 * CashCollateral4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral2#mmMaturityDate
	 * CashCollateral2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmMaturityDate
	 * SecuritiesCollateral4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmMaturityDate
	 * CashCollateral5.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD3#mmMaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmMaturityDate
	 * ForeignExchangeSwapTransaction1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmMaturityDate
	 * UnsecuredMarketTransaction1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction1#mmMaturityDate
	 * OvernightIndexSwapTransaction1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmMaturityDate
	 * SecuredMarketTransaction1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmMaturityDate
	 * DebtInstrument2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#mmExpectedDate
	 * LoanContractTranche1.mmExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#mmDueDate
	 * LoanContractTranche1.mmDueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContract1#mmMaturityDate
	 * LoanContract1.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmMaturityDate
	 * FinancialInstrumentAttributes63.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmMaturityDate
	 * FinancialInstrumentAttributes64.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmMaturityDate
	 * FinancialInstrumentAttributes66.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmMaturityDate
	 * FinancialInstrumentAttributes65.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmMaturityDate
	 * FinancialInstrumentAttributes67.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmNewMaturityDate
	 * CorporateActionDate44.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmMaturityDate
	 * SecuritiesCollateral6.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmMaturityDate
	 * SecuritiesCollateral5.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmMaturityDate
	 * SecuritiesCollateral7.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmMaturityDate
	 * FinancialInstrumentAttributes70.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmMaturityDate
	 * FinancialInstrumentAttributes69.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmNewMaturityDate
	 * CorporateActionDate58.mmNewMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmMaturityDate
	 * FinancialInstrumentAttributes71.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmMaturityDate
	 * FinancialInstrumentAttributes75.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmMaturityDate
	 * FinancialInstrumentAttributes78.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD4#mmMaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmMaturityDate
	 * UnsecuredMarketTransaction2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmMaturityDate
	 * ForeignExchangeSwapTransaction2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmMaturityDate
	 * SecuredMarketTransaction2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmMaturityDate
	 * UnsecuredMarketTransaction3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction3#mmMaturityDate
	 * OvernightIndexSwapTransaction3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmMaturityDate
	 * SecuredMarketTransaction3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument4#mmMaturityDate
	 * DebtInstrument4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmMaturityDate
	 * TransparencyDataReport10.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument5#mmIssuanceDate
	 * DebtInstrument5.mmIssuanceDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingSwapMaturityDate
	 * InterestRateDerivative5.mmUnderlyingSwapMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BondDerivative2#mmMaturityDate
	 * BondDerivative2.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmMaturityDate
	 * FinancialInstrumentAttributes79.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmMaturityDate
	 * FinancialInstrumentAttributes81.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmMaturityDate
	 * FinancialInstrumentAttributes80.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionConfirmationSecuritiesMovementDetailsSD5#mmMaturityDate
	 * CorporateActionConfirmationSecuritiesMovementDetailsSD5.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmMaturityDate
	 * SecuritiesCollateral8.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmMaturityDate
	 * FinancialInstrumentAttributes85.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmMaturityDate
	 * FinancialInstrumentAttributes84.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmMaturityDate
	 * FinancialInstrumentAttributes83.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmMaturityDate
	 * SecuredMarketTransaction4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmMaturityDate
	 * ForeignExchangeSwapTransaction3.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmMaturityDate
	 * OvernightIndexSwapTransaction4.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmMaturityDate
	 * UnsecuredMarketTransaction4.mmMaturityDate}</li>
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
	public static final MMBusinessAttribute mmMaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmMaturityDate, FinancialInstrumentAttributes20.mmMaturityDate, FinancialInstrumentAttributes35.mmMaturityDate,
					FinancialInstrumentAttributes41.mmMaturityDate, FinancialInstrumentAttributes6.mmMaturityDate, FinancialInstrumentAttributes9.mmMaturityDate, FinancialInstrumentAttributes18.mmMaturityDate,
					FinancialInstrumentAttributes22.mmMaturityDate, FinancialInstrumentAttributes32.mmMaturityDate, FinancialInstrumentAttributes38.mmMaturityDate, FinancialInstrumentAttributes7.mmMaturityDate,
					FinancialInstrumentAttributes5.mmMaturityDate, FinancialInstrumentAttributes11.mmMaturityDate, FinancialInstrumentAttributes10.mmMaturityDate, FinancialInstrumentAttributes19.mmMaturityDate,
					FinancialInstrumentAttributes16.mmMaturityDate, FinancialInstrumentAttributes23.mmMaturityDate, FinancialInstrumentAttributes24.mmMaturityDate, FinancialInstrumentAttributes33.mmMaturityDate,
					FinancialInstrumentAttributes34.mmMaturityDate, FinancialInstrumentAttributes39.mmMaturityDate, FinancialInstrumentAttributes40.mmMaturityDate, FinancialInstrumentAttributes43.mmMaturityDate,
					FinancialInstrumentAttributes45.mmMaturityDate, CorporateActionDate1.mmMaturityDate, CorporateActionDate13.mmMaturityDate, CorporateActionDate14.mmNewMaturityDate, CorporateActionDate21.mmNewMaturityDate,
					CorporateActionDate22.mmNewMaturityDate, CorporateActionDate25.mmNewMaturityDate, CorporateActionDate27.mmNewMaturityDate, CorporateActionDate28.mmNewMaturityDate, FinancialInstrumentAttributes4.mmMaturityDate,
					FinancialInstrumentAttributes13.mmMaturityDate, FinancialInstrumentAttributes21.mmMaturityDate, FinancialInstrumentAttributes26.mmMaturityDate, FinancialInstrumentAttributes36.mmMaturityDate,
					FinancialInstrumentAttributes42.mmMaturityDate, FinancialInstrumentAttributes27.mmMaturityDate, FinancialInstrumentAttributes14.mmMaturityDate, FinancialInstrumentAttributes30.mmMaturityDate,
					FinancialInstrumentAttributes28.mmMaturityDate, Equity1.mmMaturityDate, Debt1.mmMaturityDate, FinancialInstrumentStipulations.mmMaturityDate, FinancialInstrumentAttributes31.mmMaturityDate,
					FinancialInstrumentStipulations2.mmMaturityDate, FinancialInstrumentAttributes44.mmMaturityDate, CorporateActionDate2.mmMaturityDate, SecurityInstrumentDescription1.mmMaturityDate,
					SecurityInstrumentDescription2.mmMaturityDate, FinancialInstrumentAttributes15.mmMaturityDate, SecuritiesCollateral1.mmMaturityDate, CashCollateral1.mmMaturityDate, FinancialInstrumentAttributes29.mmMaturityDate,
					Equity2.mmMaturityDate, Debt2.mmMaturityDate, FinancialInstrumentAttributes2.mmMaturityDate, FinancialInstrumentAttributes48.mmMaturityDate, FinancialInstrumentAttributes50.mmMaturityDate,
					FinancialInstrumentAttributes49.mmMaturityDate, FinancialInstrumentAttributes55.mmMaturityDate, FinancialInstrumentAttributes57.mmMaturityDate, FinancialInstrumentAttributes56.mmMaturityDate,
					CorporateActionConfirmationSecuritiesMovementDetailsSD2.mmMaturityDate, SecuritiesCollateral2.mmMaturityDate, CashCollateral3.mmMaturityDate, SecuritiesCollateral3.mmMaturityDate, CashCollateral4.mmMaturityDate,
					CashCollateral2.mmMaturityDate, SecuritiesCollateral4.mmMaturityDate, CashCollateral5.mmMaturityDate, CorporateActionConfirmationSecuritiesMovementDetailsSD3.mmMaturityDate,
					ForeignExchangeSwapTransaction1.mmMaturityDate, UnsecuredMarketTransaction1.mmMaturityDate, OvernightIndexSwapTransaction1.mmMaturityDate, SecuredMarketTransaction1.mmMaturityDate, DebtInstrument2.mmMaturityDate,
					LoanContractTranche1.mmExpectedDate, LoanContractTranche1.mmDueDate, LoanContract1.mmMaturityDate, FinancialInstrumentAttributes63.mmMaturityDate, FinancialInstrumentAttributes64.mmMaturityDate,
					FinancialInstrumentAttributes66.mmMaturityDate, FinancialInstrumentAttributes65.mmMaturityDate, FinancialInstrumentAttributes67.mmMaturityDate, CorporateActionDate44.mmNewMaturityDate,
					SecuritiesCollateral6.mmMaturityDate, SecuritiesCollateral5.mmMaturityDate, SecuritiesCollateral7.mmMaturityDate, FinancialInstrumentAttributes70.mmMaturityDate, FinancialInstrumentAttributes69.mmMaturityDate,
					CorporateActionDate58.mmNewMaturityDate, FinancialInstrumentAttributes71.mmMaturityDate, FinancialInstrumentAttributes75.mmMaturityDate, FinancialInstrumentAttributes78.mmMaturityDate,
					CorporateActionConfirmationSecuritiesMovementDetailsSD4.mmMaturityDate, UnsecuredMarketTransaction2.mmMaturityDate, ForeignExchangeSwapTransaction2.mmMaturityDate, SecuredMarketTransaction2.mmMaturityDate,
					UnsecuredMarketTransaction3.mmMaturityDate, OvernightIndexSwapTransaction3.mmMaturityDate, SecuredMarketTransaction3.mmMaturityDate, DebtInstrument4.mmMaturityDate, TransparencyDataReport10.mmMaturityDate,
					DebtInstrument5.mmIssuanceDate, InterestRateDerivative5.mmUnderlyingSwapMaturityDate, BondDerivative2.mmMaturityDate, FinancialInstrumentAttributes79.mmMaturityDate, FinancialInstrumentAttributes81.mmMaturityDate,
					FinancialInstrumentAttributes80.mmMaturityDate, CorporateActionConfirmationSecuritiesMovementDetailsSD5.mmMaturityDate, SecuritiesCollateral8.mmMaturityDate, FinancialInstrumentAttributes85.mmMaturityDate,
					FinancialInstrumentAttributes84.mmMaturityDate, FinancialInstrumentAttributes83.mmMaturityDate, SecuredMarketTransaction4.mmMaturityDate, ForeignExchangeSwapTransaction3.mmMaturityDate,
					OvernightIndexSwapTransaction4.mmMaturityDate, UnsecuredMarketTransaction4.mmMaturityDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getMaturityDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Derivative> derivative;
	/**
	 * Specifies the parameters of a derivative instrument based on a specific
	 * asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation8.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation11.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation13.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation15.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation17.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation19.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation22.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation23.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TwoLegTransactionType1Choice#mmFutureOrOptionDetails
	 * TwoLegTransactionType1Choice.mmFutureOrOptionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument28#mmDerivative
	 * FinancialInstrument28.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument2#mmAdditionalDerivativeAttributes
	 * FinancialInstrument2.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation26.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation27.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation31.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmAdditionalDerivativeAttributes
	 * AggregateBalanceInformation32.mmAdditionalDerivativeAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5#mmDerivativeInstrumentAttributes
	 * SecuritiesReferenceDataReport5.mmDerivativeInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmDerivative
	 * TransparencyDataReport10.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription13#mmDerivativeInstrumentAttributes
	 * SecurityInstrumentDescription13.mmDerivativeInstrumentAttributes}</li>
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
	public static final MMBusinessAssociationEnd mmDerivative = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AggregateBalanceInformation8.mmAdditionalDerivativeAttributes, AggregateBalanceInformation11.mmAdditionalDerivativeAttributes,
					AggregateBalanceInformation13.mmAdditionalDerivativeAttributes, AggregateBalanceInformation15.mmAdditionalDerivativeAttributes, AggregateBalanceInformation17.mmAdditionalDerivativeAttributes,
					AggregateBalanceInformation19.mmAdditionalDerivativeAttributes, AggregateBalanceInformation22.mmAdditionalDerivativeAttributes, AggregateBalanceInformation23.mmAdditionalDerivativeAttributes,
					TwoLegTransactionType1Choice.mmFutureOrOptionDetails, FinancialInstrument28.mmDerivative, FinancialInstrument2.mmAdditionalDerivativeAttributes, AggregateBalanceInformation26.mmAdditionalDerivativeAttributes,
					AggregateBalanceInformation27.mmAdditionalDerivativeAttributes, AggregateBalanceInformation31.mmAdditionalDerivativeAttributes, AggregateBalanceInformation32.mmAdditionalDerivativeAttributes,
					SecuritiesReferenceDataReport5.mmDerivativeInstrumentAttributes, TransparencyDataReport10.mmDerivative, SecurityInstrumentDescription13.mmDerivativeInstrumentAttributes);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.mmUnderlyingAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> assetValue;
	/**
	 * Specifies the different values of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAsset
	 * AssetHolding.mmAsset}</li>
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
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown4.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown4.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown4#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown4.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown8.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown8.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown8#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown8.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown14.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown14.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown14#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown14.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown19.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown19.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown19#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown19.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown24.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown24.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown24#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown24.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown25.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown25.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown25#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown25.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmAccountBaseCurrencyAmounts
	 * QuantityBreakDown2.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmInstrumentCurrencyAmounts
	 * QuantityBreakDown2.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakDown2#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakDown2.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown28.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown28.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown28.mmAlternateReportingCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmAccountBaseCurrencyAmounts
	 * QuantityBreakdown39.mmAccountBaseCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmInstrumentCurrencyAmounts
	 * QuantityBreakdown39.mmInstrumentCurrencyAmounts}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown39#mmAlternateReportingCurrencyAmounts
	 * QuantityBreakdown39.mmAlternateReportingCurrencyAmounts}</li>
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
	public static final MMBusinessAssociationEnd mmAssetValue = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(QuantityBreakdown4.mmAccountBaseCurrencyAmounts, QuantityBreakdown4.mmInstrumentCurrencyAmounts, QuantityBreakdown4.mmAlternateReportingCurrencyAmounts,
					QuantityBreakdown8.mmAccountBaseCurrencyAmounts, QuantityBreakdown8.mmInstrumentCurrencyAmounts, QuantityBreakdown8.mmAlternateReportingCurrencyAmounts, QuantityBreakdown14.mmAccountBaseCurrencyAmounts,
					QuantityBreakdown14.mmInstrumentCurrencyAmounts, QuantityBreakdown14.mmAlternateReportingCurrencyAmounts, QuantityBreakdown19.mmAccountBaseCurrencyAmounts, QuantityBreakdown19.mmInstrumentCurrencyAmounts,
					QuantityBreakdown19.mmAlternateReportingCurrencyAmounts, QuantityBreakdown24.mmAccountBaseCurrencyAmounts, QuantityBreakdown24.mmInstrumentCurrencyAmounts, QuantityBreakdown24.mmAlternateReportingCurrencyAmounts,
					QuantityBreakdown25.mmAccountBaseCurrencyAmounts, QuantityBreakdown25.mmInstrumentCurrencyAmounts, QuantityBreakdown25.mmAlternateReportingCurrencyAmounts, QuantityBreakDown2.mmAccountBaseCurrencyAmounts,
					QuantityBreakDown2.mmInstrumentCurrencyAmounts, QuantityBreakDown2.mmAlternateReportingCurrencyAmounts, QuantityBreakdown28.mmAccountBaseCurrencyAmounts, QuantityBreakdown28.mmInstrumentCurrencyAmounts,
					QuantityBreakdown28.mmAlternateReportingCurrencyAmounts, QuantityBreakdown39.mmAccountBaseCurrencyAmounts, QuantityBreakdown39.mmInstrumentCurrencyAmounts, QuantityBreakdown39.mmAlternateReportingCurrencyAmounts);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetValue";
			definition = "Specifies the different values of an asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetClassification> assetClassification;
	/**
	 * Classification of the asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
	 * AssetClassification.mmAsset}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation3#mmClassificationType
	 * AdditionalInformation3.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation4#mmClassificationType
	 * AdditionalInformation4.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation7#mmClassificationType
	 * AdditionalInformation7.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation8#mmClassificationType
	 * AdditionalInformation8.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmProductType
	 * FinancialInstrumentAttributes1.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmClassificationType
	 * CommonFinancialInstrumentAttributes1.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation9#mmClassificationType
	 * AdditionalInformation9.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation10#mmClassificationType
	 * AdditionalInformation10.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation11#mmClassificationType
	 * AdditionalInformation11.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation12#mmClassificationType
	 * AdditionalInformation12.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation13#mmClassificationType
	 * AdditionalInformation13.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation14#mmClassificationType
	 * AdditionalInformation14.mmClassificationType}</li>
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
	public static final MMBusinessAssociationEnd mmAssetClassification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AdditionalInformation3.mmClassificationType, AdditionalInformation4.mmClassificationType, AdditionalInformation7.mmClassificationType, AdditionalInformation8.mmClassificationType,
					FinancialInstrumentAttributes1.mmProductType, CommonFinancialInstrumentAttributes1.mmClassificationType, AdditionalInformation9.mmClassificationType, AdditionalInformation10.mmClassificationType,
					AdditionalInformation11.mmClassificationType, AdditionalInformation12.mmClassificationType, AdditionalInformation13.mmClassificationType, AdditionalInformation14.mmClassificationType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetClassification";
			definition = "Classification of the asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
		}
	};
	protected FinancialAssetTypeCategoryCode financialAssetCategory;
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
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmCategory
	 * BalanceDetails6.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#mmFXType
	 * DerivativeForeignExchange3.mmFXType}</li>
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
	public static final MMBusinessAttribute mmFinancialAssetCategory = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails6.mmCategory, DerivativeForeignExchange3.mmFXType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetCategory";
			definition = "Categorization of financial asset type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getFinancialAssetCategory", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AssetPartyRole assetPartyRole;
	/**
	 * Party which plays a role for a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetPartyRole#mmAsset
	 * AssetPartyRole.mmAsset}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmOtherBusinessParties
	 * InstrumentLeg2.mmOtherBusinessParties}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmOtherBusinessParties
	 * InstrumentLeg3.mmOtherBusinessParties}</li>
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
	public static final MMBusinessAssociationEnd mmAssetPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InstrumentLeg2.mmOtherBusinessParties, InstrumentLeg3.mmOtherBusinessParties);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetPartyRole";
			definition = "Party which plays a role for a specific asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Issuance> issuance;
	/**
	 * Details regarding the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuedAsset
	 * Issuance.mmIssuedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmGlobalType
	 * Debt2.mmGlobalType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmIssuance
	 * CommonFinancialInstrumentAttributes1.mmIssuance}</li>
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
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(Debt2.mmGlobalType, CommonFinancialInstrumentAttributes1.mmIssuance);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmIssuedAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected Portfolio portfolio;
	/**
	 * Asset which is part of a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmAssetDescription
	 * Portfolio.mmAssetDescription}</li>
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
	public static final MMBusinessAssociationEnd mmPortfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Asset which is part of a portfolio.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmAssetDescription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected CurrencyAndAmount investmentAmount;
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
	public static final MMBusinessAttribute mmInvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAmount";
			definition = "Invested amount of the portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getInvestmentAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate investmentRate;
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
	public static final MMBusinessAttribute mmInvestmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentRate";
			definition = "Invested percentage of the portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getInvestmentRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime effectiveDate;
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
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Cut off date/time for the information of the specified portfolio asset.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getEffectiveDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstrumentSubStructureTypeCode financialInstrumentSubStructure;
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
	 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType1Choice#mmCode
	 * InstrumentSubStructureType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstrumentSubStructureType1Choice#mmProprietary
	 * InstrumentSubStructureType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Debt2#mmInstrumentStructureType
	 * Debt2.mmInstrumentStructureType}</li>
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
	public static final MMBusinessAttribute mmFinancialInstrumentSubStructure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(InstrumentSubStructureType1Choice.mmCode, InstrumentSubStructureType1Choice.mmProprietary, Debt2.mmInstrumentStructureType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentSubStructure";
			definition = "Indicates the type of deal for structured finance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Asset.class.getMethod("getFinancialInstrumentSubStructure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentPlan investmentPlan;
	/**
	 * Investment plan that invests in a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmAsset
	 * InvestmentPlan.mmAsset}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan that invests in a specific asset.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Trade> trade;
	/**
	 * Trade which which involves a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmAsset
	 * Trade.mmAsset}</li>
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
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade which which involves a specific asset.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Tranche tranche;
	/**
	 * One of a number of related assets offered as part of the same
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tranche#mmAsset
	 * Tranche.mmAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tranche Tranche}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#mmTranche
	 * LoanContract1.mmTranche}</li>
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
	public static final MMBusinessAssociationEnd mmTranche = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LoanContract1.mmTranche);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One of a number of related assets offered as part of the same transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tranche.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Leg> legAdditionalInformation;
	/**
	 * Provides details about the leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Leg#mmRelatedAsset
	 * Leg.mmRelatedAsset}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmLegAttributes
	 * FinancialInstrumentAttributes1.mmLegAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmInstrumentLegGroupDetails
	 * QuoteEntry2.mmInstrumentLegGroupDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry2#mmLegFinancialInstrumentAttributes
	 * QuoteEntry2.mmLegFinancialInstrumentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuoteEntry1#mmInstrumentLegGroupDetails
	 * QuoteEntry1.mmInstrumentLegGroupDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultiLegOrder1#mmLegGroupDetails
	 * MultiLegOrder1.mmLegGroupDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmInstrumentLegGroupDetails
	 * IndicationOfInterest1.mmInstrumentLegGroupDetails}</li>
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
	public static final MMBusinessAssociationEnd mmLegAdditionalInformation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmLegAttributes, QuoteEntry2.mmInstrumentLegGroupDetails, QuoteEntry2.mmLegFinancialInstrumentAttributes, QuoteEntry1.mmInstrumentLegGroupDetails,
					MultiLegOrder1.mmLegGroupDetails, IndicationOfInterest1.mmInstrumentLegGroupDetails);
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegAdditionalInformation";
			definition = "Provides details about the leg.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.mmRelatedAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Leg.mmObject();
		}
	};
	protected StandingSettlementInstruction standingSettlementInstruction;
	/**
	 * Standing settlement instruction for which an asset is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#mmAsset
	 * StandingSettlementInstruction.mmAsset}</li>
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
	public static final MMBusinessAssociationEnd mmStandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Standing settlement instruction for which an asset is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmAsset;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Asset";
				definition = "Tangible items of value to a business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmAsset, com.tools20022.repository.entity.InvestmentPlan.mmAsset, com.tools20022.repository.entity.Portfolio.mmAssetDescription,
						com.tools20022.repository.entity.AssetHolding.mmAsset, com.tools20022.repository.entity.AssetPartyRole.mmAsset, com.tools20022.repository.entity.AssetClassification.mmAsset,
						com.tools20022.repository.entity.Derivative.mmUnderlyingAsset, com.tools20022.repository.entity.Issuance.mmIssuedAsset, com.tools20022.repository.entity.StandingSettlementInstruction.mmAsset,
						com.tools20022.repository.entity.Leg.mmRelatedAsset, com.tools20022.repository.entity.Tranche.mmAsset);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmProperties, FinancialInstrumentAttributes1.mmAdditionalUnderlyingAttributes, OtherCollateral1.mmOtherTypeOfCollateral,
						CollateralSubstitution1.mmOtherCollateral, CollateralValuation1.mmOtherCollateralDetails, SecurityAttributes1.mmFinancialInstrumentType, CollateralSubstitution2.mmOtherCollateral,
						CollateralValuation2.mmOtherCollateral, OtherCollateral2.mmOtherTypeOfCollateral, OtherCollateral3.mmLetterOfCreditIdentification, OtherCollateral3.mmOtherTypeOfCollateral, OtherCollateral4.mmOtherTypeOfCollateral,
						CollateralSubstitution3.mmOtherCollateral, CollateralSubstitution5.mmOtherCollateral, CollateralSubstitution4.mmOtherCollateral, OtherCollateral7.mmOtherTypeOfCollateral, CollateralValuation5.mmOtherCollateral,
						OtherCollateral6.mmLetterOfCreditIdentification, OtherCollateral6.mmOtherTypeOfCollateral, OtherCollateral5.mmOtherTypeOfCollateral);
				subType_lazy = () -> Arrays.asList(Security.mmObject(), com.tools20022.repository.entity.Derivative.mmObject(), Money.mmObject(), LetterOfCredit.mmObject(), Guarantee.mmObject(), Commodity.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmExpiryDate, com.tools20022.repository.entity.Asset.mmMaturityDate, com.tools20022.repository.entity.Asset.mmDerivative,
						com.tools20022.repository.entity.Asset.mmAssetValue, com.tools20022.repository.entity.Asset.mmAssetClassification, com.tools20022.repository.entity.Asset.mmFinancialAssetCategory,
						com.tools20022.repository.entity.Asset.mmAssetPartyRole, com.tools20022.repository.entity.Asset.mmIssuance, com.tools20022.repository.entity.Asset.mmPortfolio,
						com.tools20022.repository.entity.Asset.mmInvestmentAmount, com.tools20022.repository.entity.Asset.mmInvestmentRate, com.tools20022.repository.entity.Asset.mmEffectiveDate,
						com.tools20022.repository.entity.Asset.mmFinancialInstrumentSubStructure, com.tools20022.repository.entity.Asset.mmInvestmentPlan, com.tools20022.repository.entity.Asset.mmTrade,
						com.tools20022.repository.entity.Asset.mmTranche, com.tools20022.repository.entity.Asset.mmLegAdditionalInformation, com.tools20022.repository.entity.Asset.mmStandingSettlementInstruction);
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

			@Override
			public Class<?> getInstanceClass() {
				return Asset.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(ISODateTime expiryDate) {
		this.expiryDate = expiryDate;
	}

	public ISODateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	public List<Derivative> getDerivative() {
		return derivative;
	}

	public void setDerivative(List<com.tools20022.repository.entity.Derivative> derivative) {
		this.derivative = derivative;
	}

	public List<AssetHolding> getAssetValue() {
		return assetValue;
	}

	public void setAssetValue(List<com.tools20022.repository.entity.AssetHolding> assetValue) {
		this.assetValue = assetValue;
	}

	public List<AssetClassification> getAssetClassification() {
		return assetClassification;
	}

	public void setAssetClassification(List<com.tools20022.repository.entity.AssetClassification> assetClassification) {
		this.assetClassification = assetClassification;
	}

	public FinancialAssetTypeCategoryCode getFinancialAssetCategory() {
		return financialAssetCategory;
	}

	public void setFinancialAssetCategory(FinancialAssetTypeCategoryCode financialAssetCategory) {
		this.financialAssetCategory = financialAssetCategory;
	}

	public AssetPartyRole getAssetPartyRole() {
		return assetPartyRole;
	}

	public void setAssetPartyRole(com.tools20022.repository.entity.AssetPartyRole assetPartyRole) {
		this.assetPartyRole = assetPartyRole;
	}

	public List<Issuance> getIssuance() {
		return issuance;
	}

	public void setIssuance(List<com.tools20022.repository.entity.Issuance> issuance) {
		this.issuance = issuance;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.entity.Portfolio portfolio) {
		this.portfolio = portfolio;
	}

	public CurrencyAndAmount getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(CurrencyAndAmount investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public PercentageRate getInvestmentRate() {
		return investmentRate;
	}

	public void setInvestmentRate(PercentageRate investmentRate) {
		this.investmentRate = investmentRate;
	}

	public ISODateTime getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODateTime effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public InstrumentSubStructureTypeCode getFinancialInstrumentSubStructure() {
		return financialInstrumentSubStructure;
	}

	public void setFinancialInstrumentSubStructure(InstrumentSubStructureTypeCode financialInstrumentSubStructure) {
		this.financialInstrumentSubStructure = financialInstrumentSubStructure;
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
	}

	public void setInvestmentPlan(com.tools20022.repository.entity.InvestmentPlan investmentPlan) {
		this.investmentPlan = investmentPlan;
	}

	public List<Trade> getTrade() {
		return trade;
	}

	public void setTrade(List<com.tools20022.repository.entity.Trade> trade) {
		this.trade = trade;
	}

	public Tranche getTranche() {
		return tranche;
	}

	public void setTranche(com.tools20022.repository.entity.Tranche tranche) {
		this.tranche = tranche;
	}

	public List<Leg> getLegAdditionalInformation() {
		return legAdditionalInformation;
	}

	public void setLegAdditionalInformation(List<com.tools20022.repository.entity.Leg> legAdditionalInformation) {
		this.legAdditionalInformation = legAdditionalInformation;
	}

	public StandingSettlementInstruction getStandingSettlementInstruction() {
		return standingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(com.tools20022.repository.entity.StandingSettlementInstruction standingSettlementInstruction) {
		this.standingSettlementInstruction = standingSettlementInstruction;
	}
}