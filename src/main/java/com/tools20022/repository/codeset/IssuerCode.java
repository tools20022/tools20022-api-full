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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.IssuerCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the institution issuing a proprietary code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ClearstreamBankLuxemburg
 * IssuerCode.ClearstreamBankLuxemburg}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#CajaDeValores
 * IssuerCode.CajaDeValores}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#AustraclearLtd
 * IssuerCode.AustraclearLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#AustralianBankStateBranch
 * IssuerCode.AustralianBankStateBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ClearingHouseElectronicSettlementSystems
 * IssuerCode.ClearingHouseElectronicSettlementSystems}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#AustrianBankLeitzahl
 * IssuerCode.AustrianBankLeitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#OesterreichischeKontrollbank
 * IssuerCode.OesterreichischeKontrollbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#CaisseInterprofessionelleDepotsVirementsTitres
 * IssuerCode.CaisseInterprofessionelleDepotsVirementsTitres}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#Euroclear
 * IssuerCode.Euroclear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#BanqueNationaleDeBelgique
 * IssuerCode.BanqueNationaleDeBelgique}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#CamaraLiquidacaoCustodia
 * IssuerCode.CamaraLiquidacaoCustodia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#CanadianDepositorySecuritiesLtd
 * IssuerCode.CanadianDepositorySecuritiesLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#CanadianPaymentsAssociation
 * IssuerCode.CanadianPaymentsAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#CentralSecuritiesDepositoryDepositoCentralValores
 * IssuerCode.CentralSecuritiesDepositoryDepositoCentralValores}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ShanghaiSecuritiesCentralClearingRegistrationCompany
 * IssuerCode.ShanghaiSecuritiesCentralClearingRegistrationCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ShenzhenSecuritiesClearingCompany
 * IssuerCode.ShenzhenSecuritiesClearingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ColombiaCentralDepositorySystem
 * IssuerCode.ColombiaCentralDepositorySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DenmarkVaerdipapircentralen
 * IssuerCode.DenmarkVaerdipapircentralen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#FinnishCentralSecuritiesDepositoryLtd
 * IssuerCode.FinnishCentralSecuritiesDepositoryLtd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#FranceRIB
 * IssuerCode.FranceRIB}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#SICOVAM
 * IssuerCode.SICOVAM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#PragueStockExchange
 * IssuerCode.PragueStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#BundesausichtsamtWertpapierhandel
 * IssuerCode.BundesausichtsamtWertpapierhandel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DeutscheBoerseAGDeutscheTerminborse
 * IssuerCode.DeutscheBoerseAGDeutscheTerminborse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DeutscheBoerseAGFrankfurterWertpapierborse
 * IssuerCode.DeutscheBoerseAGFrankfurterWertpapierborse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DeutscheBoerseAGXETRA
 * IssuerCode.DeutscheBoerseAGXETRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DeutscheBorseClearingAG
 * IssuerCode.DeutscheBorseClearingAG}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DeutscheBundesbank
 * IssuerCode.DeutscheBundesbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#GermanBankleitzahl
 * IssuerCode.GermanBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ZentralerKreditausschuss
 * IssuerCode.ZentralerKreditausschuss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#HongKongCentralClearingSecuritiesSettlementSystem
 * IssuerCode.HongKongCentralClearingSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#HongKongNationalClearing
 * IssuerCode.HongKongNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#IndianNationalSecuritiesDepository
 * IssuerCode.IndianNationalSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#IndonesianSecuritiesCentralDepository
 * IssuerCode.IndonesianSecuritiesCentralDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#IrishNationalClearing
 * IssuerCode.IrishNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#TelAvivStockExchange
 * IssuerCode.TelAvivStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ItalianDomesticIdentification
 * IssuerCode.ItalianDomesticIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#MonteTitoli
 * IssuerCode.MonteTitoli}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#JapanSecuritiesClearingCorporation
 * IssuerCode.JapanSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#JapanSecuritiesDepositoryCenter
 * IssuerCode.JapanSecuritiesDepositoryCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#KoreanSecuritiesDepository
 * IssuerCode.KoreanSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#MalaysianCentralDepository
 * IssuerCode.MalaysianCentralDepository}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#IndevalSA
 * IssuerCode.IndevalSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#AmsterdamseEffectenbeurs
 * IssuerCode.AmsterdamseEffectenbeurs}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#NECIGEF
 * IssuerCode.NECIGEF}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#NewZealandNationalClearing
 * IssuerCode.NewZealandNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#NewZealandStockExchange
 * IssuerCode.NewZealandStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#Verdipapirsentralen
 * IssuerCode.Verdipapirsentralen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#PhilippineCentralDepository
 * IssuerCode.PhilippineCentralDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#PolandNationalDepositorySecurities
 * IssuerCode.PolandNationalDepositorySecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#CentralValoresMobiliaros
 * IssuerCode.CentralValoresMobiliaros}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#PortugueseNationalClearing
 * IssuerCode.PortugueseNationalClearing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#INTERBOLSA
 * IssuerCode.INTERBOLSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#RussianCentralBankIdentification
 * IssuerCode.RussianCentralBankIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#SingaporeCentralDepositoryLtd
 * IssuerCode.SingaporeCentralDepositoryLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#SingaporeInternationalMonetaryExchange
 * IssuerCode.SingaporeInternationalMonetaryExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#BratislavaStockExchange
 * IssuerCode.BratislavaStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#SouthAfricanNationalClearing
 * IssuerCode.SouthAfricanNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#StrateClearingSettlementLtd
 * IssuerCode.StrateClearingSettlementLtd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#BancoEspana
 * IssuerCode.BancoEspana}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ServicioCompensacionLiquidacionValores
 * IssuerCode.ServicioCompensacionLiquidacionValores}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#SpanishDomesticInterbanking
 * IssuerCode.SpanishDomesticInterbanking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#Vardepapperscentralen
 * IssuerCode.Vardepapperscentralen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#SISSEGAIntersettle
 * IssuerCode.SISSEGAIntersettle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#SwissClearingCode
 * IssuerCode.SwissClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ThailandSecuritiesDepositoryCompany
 * IssuerCode.ThailandSecuritiesDepositoryCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#TaiwanSecuritiesCentralDepository
 * IssuerCode.TaiwanSecuritiesCentralDepository}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#Takasbank
 * IssuerCode.Takasbank}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#UKDomesticSort
 * IssuerCode.UKDomesticSort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#BankOfEnglandCMO
 * IssuerCode.BankOfEnglandCMO}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#CrestCo
 * IssuerCode.CrestCo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#FinancialServicesAuthority
 * IssuerCode.FinancialServicesAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#LondonClearingHouse
 * IssuerCode.LondonClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#InternationalSecuritiesMarketAssociation
 * IssuerCode.InternationalSecuritiesMarketAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#LondonStockExchange
 * IssuerCode.LondonStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#AmericanStockExchange
 * IssuerCode.AmericanStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#DepositoryTrustCompany
 * IssuerCode.DepositoryTrustCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#EmergingMarketsClearingCorporation
 * IssuerCode.EmergingMarketsClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#FedwireRoutingNumber
 * IssuerCode.FedwireRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#GovernmentSecuritiesClearingCorporation
 * IssuerCode.GovernmentSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#InternationalSecuritiesClearingCorporation
 * IssuerCode.InternationalSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#MortgageBackedSecuritiesClearingCorporation
 * IssuerCode.MortgageBackedSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#NationalAssociationSecuritiesDealers
 * IssuerCode.NationalAssociationSecuritiesDealers}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#NASDAQ
 * IssuerCode.NASDAQ}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#NationalSecuritiesClearingCorporation
 * IssuerCode.NationalSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#NewYorkClearingHouse
 * IssuerCode.NewYorkClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#NewYorkStockExchange
 * IssuerCode.NewYorkStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#OptionsClearingCorporation
 * IssuerCode.OptionsClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IssuerCode#ParticipantTrustCompany
 * IssuerCode.ParticipantTrustCompany}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.IssuerCode#XClear
 * IssuerCode.XClear}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode
 * PartyIssuerCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: Format C, Party Identification</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CEDE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the institution issuing a proprietary code."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IssuerCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Based in Luxembourg, the holding, clearing and settlement agency for
	 * certain international securities, especially Eurobonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearstreamBankLuxemburg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Based in Luxembourg, the holding, clearing and settlement agency for certain international securities, especially Eurobonds."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode ClearstreamBankLuxemburg = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearstreamBankLuxemburg";
			definition = "Based in Luxembourg, the holding, clearing and settlement agency for certain international securities, especially Eurobonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CEDE";
		}
	};
	/**
	 * Caja de Valores S.A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CajaDeValores"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Caja de Valores S.A."</li>
	 * </ul>
	 */
	public static final IssuerCode CajaDeValores = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CajaDeValores";
			definition = "Caja de Valores S.A.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CAVL";
		}
	};
	/**
	 * Austraclear Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustraclearLtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Austraclear Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode AustraclearLtd = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustraclearLtd";
			definition = "Austraclear Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ACLR";
		}
	};
	/**
	 * Australian Bank State Branch Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBankStateBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Australian Bank State Branch Code."</li>
	 * </ul>
	 */
	public static final IssuerCode AustralianBankStateBranch = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBankStateBranch";
			definition = "Australian Bank State Branch Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "AUAU";
		}
	};
	/**
	 * Clearing House Electronic Settlements Systems.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingHouseElectronicSettlementSystems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing House Electronic Settlements Systems."</li>
	 * </ul>
	 */
	public static final IssuerCode ClearingHouseElectronicSettlementSystems = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseElectronicSettlementSystems";
			definition = "Clearing House Electronic Settlements Systems.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CHES";
		}
	};
	/**
	 * Austrian Bankleitzahl.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankLeitzahl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Austrian Bankleitzahl."</li>
	 * </ul>
	 */
	public static final IssuerCode AustrianBankLeitzahl = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustrianBankLeitzahl";
			definition = "Austrian Bankleitzahl.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ATAT";
		}
	};
	/**
	 * OKB - Oesterreichische Kontrollbank AG.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OEKO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OesterreichischeKontrollbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "OKB - Oesterreichische Kontrollbank AG."</li>
	 * </ul>
	 */
	public static final IssuerCode OesterreichischeKontrollbank = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OesterreichischeKontrollbank";
			definition = "OKB - Oesterreichische Kontrollbank AG.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "OEKO";
		}
	};
	/**
	 * CIK - Caisse Interprofessionelle de Depots et de Virements de Titres S.A.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CIKB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaisseInterprofessionelleDepotsVirementsTitres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CIK - Caisse Interprofessionelle de Depots et de Virements de Titres S.A."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode CaisseInterprofessionelleDepotsVirementsTitres = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaisseInterprofessionelleDepotsVirementsTitres";
			definition = "CIK - Caisse Interprofessionelle de Depots et de Virements de Titres S.A.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CIKB";
		}
	};
	/**
	 * Euroclear.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EOCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euroclear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Euroclear."</li>
	 * </ul>
	 */
	public static final IssuerCode Euroclear = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euroclear";
			definition = "Euroclear.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "EOCC";
		}
	};
	/**
	 * Banque Nationale de Belgique.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NBBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BanqueNationaleDeBelgique"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Banque Nationale de Belgique."</li>
	 * </ul>
	 */
	public static final IssuerCode BanqueNationaleDeBelgique = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BanqueNationaleDeBelgique";
			definition = "Banque Nationale de Belgique.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "NBBE";
		}
	};
	/**
	 * CLC - Camara de Liquidacao e Custodia S.A. (Brazil).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CamaraLiquidacaoCustodia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CLC - Camara de Liquidacao e Custodia S.A. (Brazil)."</li>
	 * </ul>
	 */
	public static final IssuerCode CamaraLiquidacaoCustodia = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CamaraLiquidacaoCustodia";
			definition = "CLC - Camara de Liquidacao e Custodia S.A. (Brazil).";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CLCB";
		}
	};
	/**
	 * CDS - Canadian Depository for Securities Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositorySecuritiesLtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CDS - Canadian Depository for Securities Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode CanadianDepositorySecuritiesLtd = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositorySecuritiesLtd";
			definition = "CDS - Canadian Depository for Securities Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CDSL";
		}
	};
	/**
	 * Canadian Payments Association Payment Routing Number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Canadian Payments Association Payment Routing Number."</li>
	 * </ul>
	 */
	public static final IssuerCode CanadianPaymentsAssociation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianPaymentsAssociation";
			definition = "Canadian Payments Association Payment Routing Number.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CACC";
		}
	};
	/**
	 * Chile Central Securities Depository Deposito Central de Valores.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepositoryDepositoCentralValores"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chile Central Securities Depository Deposito Central de Valores."</li>
	 * </ul>
	 */
	public static final IssuerCode CentralSecuritiesDepositoryDepositoCentralValores = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepositoryDepositoCentralValores";
			definition = "Chile Central Securities Depository Deposito Central de Valores.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CSDD";
		}
	};
	/**
	 * Shanghai Securities Central Clearing &amp; Registration Company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShanghaiSecuritiesCentralClearingRegistrationCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Shanghai Securities Central Clearing &amp; Registration Company."</li>
	 * </ul>
	 */
	public static final IssuerCode ShanghaiSecuritiesCentralClearingRegistrationCompany = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShanghaiSecuritiesCentralClearingRegistrationCompany";
			definition = "Shanghai Securities Central Clearing & Registration Company.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "SCRC";
		}
	};
	/**
	 * Shenzhen Securities Clearing Company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShenzhenSecuritiesClearingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Shenzhen Securities Clearing Company."</li>
	 * </ul>
	 */
	public static final IssuerCode ShenzhenSecuritiesClearingCompany = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShenzhenSecuritiesClearingCompany";
			definition = "Shenzhen Securities Clearing Company.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "SSCC";
		}
	};
	/**
	 * Colombia Central Depository System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ColombiaCentralDepositorySystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Colombia Central Depository System."</li>
	 * </ul>
	 */
	public static final IssuerCode ColombiaCentralDepositorySystem = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ColombiaCentralDepositorySystem";
			definition = "Colombia Central Depository System.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CDSY";
		}
	};
	/**
	 * Denmark Vaerdipapircentralen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VPDK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenmarkVaerdipapircentralen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denmark Vaerdipapircentralen."</li>
	 * </ul>
	 */
	public static final IssuerCode DenmarkVaerdipapircentralen = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenmarkVaerdipapircentralen";
			definition = "Denmark Vaerdipapircentralen.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "VPDK";
		}
	};
	/**
	 * Finnish Central Securities Depository Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "APKE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinnishCentralSecuritiesDepositoryLtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Finnish Central Securities Depository Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode FinnishCentralSecuritiesDepositoryLtd = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinnishCentralSecuritiesDepositoryLtd";
			definition = "Finnish Central Securities Depository Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "APKE";
		}
	};
	/**
	 * French R.I.B.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FranceRIB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "French R.I.B."</li>
	 * </ul>
	 */
	public static final IssuerCode FranceRIB = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FranceRIB";
			definition = "French R.I.B.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "FRRI";
		}
	};
	/**
	 * Societe Interprofessional Pour La Compensation des Valeurs Mobiliers in
	 * France.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SICV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SICOVAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Societe Interprofessional Pour La Compensation des Valeurs Mobiliers in France."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode SICOVAM = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SICOVAM";
			definition = "Societe Interprofessional Pour La Compensation des Valeurs Mobiliers in France.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "SICV";
		}
	};
	/**
	 * The Prague Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XPRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PragueStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The Prague Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode PragueStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PragueStockExchange";
			definition = "The Prague Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XPRA";
		}
	};
	/**
	 * Bundesausichtsamt fur den Wertpapierhandel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUWE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BundesausichtsamtWertpapierhandel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bundesausichtsamt fur den Wertpapierhandel."</li>
	 * </ul>
	 */
	public static final IssuerCode BundesausichtsamtWertpapierhandel = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BundesausichtsamtWertpapierhandel";
			definition = "Bundesausichtsamt fur den Wertpapierhandel.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "BUWE";
		}
	};
	/**
	 * Deutsche Boerse AG: Deutsche Terminborse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XDTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBoerseAGDeutscheTerminborse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deutsche Boerse AG: Deutsche Terminborse."</li>
	 * </ul>
	 */
	public static final IssuerCode DeutscheBoerseAGDeutscheTerminborse = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGDeutscheTerminborse";
			definition = "Deutsche Boerse AG: Deutsche Terminborse.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XDTB";
		}
	};
	/**
	 * Deutsche Boerse AG: Frankfurter Wertpapierborse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XFRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBoerseAGFrankfurterWertpapierborse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deutsche Boerse AG: Frankfurter Wertpapierborse."</li>
	 * </ul>
	 */
	public static final IssuerCode DeutscheBoerseAGFrankfurterWertpapierborse = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGFrankfurterWertpapierborse";
			definition = "Deutsche Boerse AG: Frankfurter Wertpapierborse.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XFRA";
		}
	};
	/**
	 * Deutsche Boerse AG: XETRA (exchange electronic trading).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBoerseAGXETRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deutsche Boerse AG: XETRA (exchange electronic trading)."</li>
	 * </ul>
	 */
	public static final IssuerCode DeutscheBoerseAGXETRA = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGXETRA";
			definition = "Deutsche Boerse AG: XETRA (exchange electronic trading).";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XETR";
		}
	};
	/**
	 * Deutsche Borse Clearing AG.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAKV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBorseClearingAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deutsche Borse Clearing AG."</li>
	 * </ul>
	 */
	public static final IssuerCode DeutscheBorseClearingAG = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBorseClearingAG";
			definition = "Deutsche Borse Clearing AG.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "DAKV";
		}
	};
	/**
	 * Deutsche Bundesbank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBundesbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deutsche Bundesbank."</li>
	 * </ul>
	 */
	public static final IssuerCode DeutscheBundesbank = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBundesbank";
			definition = "Deutsche Bundesbank.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "MARK";
		}
	};
	/**
	 * German Bankleitzahl.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "German Bankleitzahl."</li>
	 * </ul>
	 */
	public static final IssuerCode GermanBankleitzahl = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanBankleitzahl";
			definition = "German Bankleitzahl.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "DEBL";
		}
	};
	/**
	 * Zentraler Kreditausschuss.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZEKR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZentralerKreditausschuss"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Zentraler Kreditausschuss."</li>
	 * </ul>
	 */
	public static final IssuerCode ZentralerKreditausschuss = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZentralerKreditausschuss";
			definition = "Zentraler Kreditausschuss.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ZEKR";
		}
	};
	/**
	 * Hong KongCentral Clearing and Securities Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongCentralClearingSecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hong KongCentral Clearing and Securities Settlement System."</li>
	 * </ul>
	 */
	public static final IssuerCode HongKongCentralClearingSecuritiesSettlementSystem = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongCentralClearingSecuritiesSettlementSystem";
			definition = "Hong KongCentral Clearing and Securities Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CCAS";
		}
	};
	/**
	 * Hong Kong National Clearing System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HKCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongNationalClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hong Kong National Clearing System."</li>
	 * </ul>
	 */
	public static final IssuerCode HongKongNationalClearing = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongNationalClearing";
			definition = "Hong Kong National Clearing System.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "HKCH";
		}
	};
	/**
	 * India National Securities Depositary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSDL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndianNationalSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "India National Securities Depositary."</li>
	 * </ul>
	 */
	public static final IssuerCode IndianNationalSecuritiesDepository = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndianNationalSecuritiesDepository";
			definition = "India National Securities Depositary.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "NSDL";
		}
	};
	/**
	 * Indonesian Securities Central Depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KDEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndonesianSecuritiesCentralDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indonesian Securities Central Depository."</li>
	 * </ul>
	 */
	public static final IssuerCode IndonesianSecuritiesCentralDepository = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndonesianSecuritiesCentralDepository";
			definition = "Indonesian Securities Central Depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "KDEI";
		}
	};
	/**
	 * Irish National Clearing Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNationalClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Irish National Clearing Code."</li>
	 * </ul>
	 */
	public static final IssuerCode IrishNationalClearing = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IrishNationalClearing";
			definition = "Irish National Clearing Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "IESC";
		}
	};
	/**
	 * Israel Tel Aviv Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XTAE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelAvivStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Israel Tel Aviv Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode TelAvivStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelAvivStockExchange";
			definition = "Israel Tel Aviv Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XTAE";
		}
	};
	/**
	 * Italian Domestic Identification Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Italian Domestic Identification Code."</li>
	 * </ul>
	 */
	public static final IssuerCode ItalianDomesticIdentification = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItalianDomesticIdentification";
			definition = "Italian Domestic Identification Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ITIT";
		}
	};
	/**
	 * Italy - Monte Titoli.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonteTitoli"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Italy - Monte Titoli."</li>
	 * </ul>
	 */
	public static final IssuerCode MonteTitoli = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonteTitoli";
			definition = "Italy - Monte Titoli.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "MOTI";
		}
	};
	/**
	 * Japan Securities Clearing Corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JSCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JapanSecuritiesClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Japan Securities Clearing Corporation."</li>
	 * </ul>
	 */
	public static final IssuerCode JapanSecuritiesClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JapanSecuritiesClearingCorporation";
			definition = "Japan Securities Clearing Corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "JSCC";
		}
	};
	/**
	 * Japan Securities Depository Center.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JSDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JapanSecuritiesDepositoryCenter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Japan Securities Depository Center."</li>
	 * </ul>
	 */
	public static final IssuerCode JapanSecuritiesDepositoryCenter = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JapanSecuritiesDepositoryCenter";
			definition = "Japan Securities Depository Center.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "JSDC";
		}
	};
	/**
	 * Korea Securities Depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KSDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KoreanSecuritiesDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Korea Securities Depository."</li>
	 * </ul>
	 */
	public static final IssuerCode KoreanSecuritiesDepository = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KoreanSecuritiesDepository";
			definition = "Korea Securities Depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "KSDC";
		}
	};
	/**
	 * Malaysian Central Depositary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MalaysianCentralDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Malaysian Central Depositary."</li>
	 * </ul>
	 */
	public static final IssuerCode MalaysianCentralDepository = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MalaysianCentralDepository";
			definition = "Malaysian Central Depositary.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "MCDY";
		}
	};
	/**
	 * Mexico S.D. Indeval, S.A. de C.V.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndevalSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mexico S.D. Indeval, S.A. de C.V."</li>
	 * </ul>
	 */
	public static final IssuerCode IndevalSA = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndevalSA";
			definition = "Mexico S.D. Indeval, S.A. de C.V.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Amsterdamse Effectenbeurs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XAMS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmsterdamseEffectenbeurs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amsterdamse Effectenbeurs."</li>
	 * </ul>
	 */
	public static final IssuerCode AmsterdamseEffectenbeurs = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmsterdamseEffectenbeurs";
			definition = "Amsterdamse Effectenbeurs.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XAMS";
		}
	};
	/**
	 * Nederlands Centraal Instituut voor Giraal Effectenverkeer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NECI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NECIGEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Nederlands Centraal Instituut voor Giraal Effectenverkeer."</li>
	 * </ul>
	 */
	public static final IssuerCode NECIGEF = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NECIGEF";
			definition = "Nederlands Centraal Instituut voor Giraal Effectenverkeer.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "NECI";
		}
	};
	/**
	 * New Zealand National Clearing Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NZBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNationalClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New Zealand National Clearing Code."</li>
	 * </ul>
	 */
	public static final IssuerCode NewZealandNationalClearing = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandNationalClearing";
			definition = "New Zealand National Clearing Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "NZBA";
		}
	};
	/**
	 * New Zealand Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XNZE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New Zealand Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode NewZealandStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandStockExchange";
			definition = "New Zealand Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XNZE";
		}
	};
	/**
	 * Norway Verdipapirsentralen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VPSN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verdipapirsentralen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Norway Verdipapirsentralen."</li>
	 * </ul>
	 */
	public static final IssuerCode Verdipapirsentralen = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verdipapirsentralen";
			definition = "Norway Verdipapirsentralen.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "VPSN";
		}
	};
	/**
	 * Philippine Central Depositary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhilippineCentralDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Philippine Central Depositary."</li>
	 * </ul>
	 */
	public static final IssuerCode PhilippineCentralDepository = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhilippineCentralDepository";
			definition = "Philippine Central Depositary.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "PCDY";
		}
	};
	/**
	 * Poland National Depository for Securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KDPW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PolandNationalDepositorySecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Poland National Depository for Securities."</li>
	 * </ul>
	 */
	public static final IssuerCode PolandNationalDepositorySecurities = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PolandNationalDepositorySecurities";
			definition = "Poland National Depository for Securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "KDPW";
		}
	};
	/**
	 * Portugal Central de Valores de Mobiliaros.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CVMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralValoresMobiliaros"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portugal Central de Valores de Mobiliaros."</li>
	 * </ul>
	 */
	public static final IssuerCode CentralValoresMobiliaros = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralValoresMobiliaros";
			definition = "Portugal Central de Valores de Mobiliaros.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CVMP";
		}
	};
	/**
	 * Portuguese National Clearing Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTIF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNationalClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portuguese National Clearing Code."</li>
	 * </ul>
	 */
	public static final IssuerCode PortugueseNationalClearing = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortugueseNationalClearing";
			definition = "Portuguese National Clearing Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "PTIF";
		}
	};
	/**
	 * Associacao para a Prestacao de Servicios as Bolsas de Valores.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCVM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "INTERBOLSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Associacao para a Prestacao de Servicios as Bolsas de Valores."</li>
	 * </ul>
	 */
	public static final IssuerCode INTERBOLSA = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "INTERBOLSA";
			definition = "Associacao para a Prestacao de Servicios as Bolsas de Valores.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XCVM";
		}
	};
	/**
	 * Russian Central Bank Identification Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RUIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Russian Central Bank Identification Code."</li>
	 * </ul>
	 */
	public static final IssuerCode RussianCentralBankIdentification = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RussianCentralBankIdentification";
			definition = "Russian Central Bank Identification Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "RUIC";
		}
	};
	/**
	 * Central Depository Pte Ltd.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingaporeCentralDepositoryLtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Central Depository Pte Ltd."</li>
	 * </ul>
	 */
	public static final IssuerCode SingaporeCentralDepositoryLtd = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingaporeCentralDepositoryLtd";
			definition = "Central Depository Pte Ltd.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CDPL";
		}
	};
	/**
	 * Singapore International Monetary Exchange Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XSIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingaporeInternationalMonetaryExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Singapore International Monetary Exchange Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode SingaporeInternationalMonetaryExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingaporeInternationalMonetaryExchange";
			definition = "Singapore International Monetary Exchange Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XSIM";
		}
	};
	/**
	 * The Bratislava Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XBRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BratislavaStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The Bratislava Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode BratislavaStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BratislavaStockExchange";
			definition = "The Bratislava Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XBRA";
		}
	};
	/**
	 * South African National Clearing Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZABS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNationalClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "South African National Clearing Code."</li>
	 * </ul>
	 */
	public static final IssuerCode SouthAfricanNationalClearing = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SouthAfricanNationalClearing";
			definition = "South African National Clearing Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ZABS";
		}
	};
	/**
	 * Strate Clearing and Settlement (Proprietary) Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrateClearingSettlementLtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strate Clearing and Settlement (Proprietary) Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode StrateClearingSettlementLtd = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrateClearingSettlementLtd";
			definition = "Strate Clearing and Settlement (Proprietary) Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "STRA";
		}
	};
	/**
	 * Banco de Espana.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BancoEspana"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Banco de Espana."</li>
	 * </ul>
	 */
	public static final IssuerCode BancoEspana = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BancoEspana";
			definition = "Banco de Espana.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ESPB";
		}
	};
	/**
	 * Servicio de Compensacion y Liquidacion de Valores.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicioCompensacionLiquidacionValores"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Servicio de Compensacion y Liquidacion de Valores."</li>
	 * </ul>
	 */
	public static final IssuerCode ServicioCompensacionLiquidacionValores = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicioCompensacionLiquidacionValores";
			definition = "Servicio de Compensacion y Liquidacion de Valores.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "SCLV";
		}
	};
	/**
	 * Spanish Domestic Interbanking Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbanking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spanish Domestic Interbanking Code."</li>
	 * </ul>
	 */
	public static final IssuerCode SpanishDomesticInterbanking = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpanishDomesticInterbanking";
			definition = "Spanish Domestic Interbanking Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ESES";
		}
	};
	/**
	 * Sweden Vardepapperscentralen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VPCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vardepapperscentralen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sweden Vardepapperscentralen."</li>
	 * </ul>
	 */
	public static final IssuerCode Vardepapperscentralen = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vardepapperscentralen";
			definition = "Sweden Vardepapperscentralen.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "VPCS";
		}
	};
	/**
	 * SIS - SEGA/Intersettle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SISSEGAIntersettle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "SIS - SEGA/Intersettle."</li>
	 * </ul>
	 */
	public static final IssuerCode SISSEGAIntersettle = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SISSEGAIntersettle";
			definition = "SIS - SEGA/Intersettle.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "SCOM";
		}
	};
	/**
	 * Swiss Clearing System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHSW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissClearingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Swiss Clearing System."</li>
	 * </ul>
	 */
	public static final IssuerCode SwissClearingCode = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissClearingCode";
			definition = "Swiss Clearing System.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CHSW";
		}
	};
	/**
	 * Thailand Securities Depository Company Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThailandSecuritiesDepositoryCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Thailand Securities Depository Company Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode ThailandSecuritiesDepositoryCompany = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThailandSecuritiesDepositoryCompany";
			definition = "Thailand Securities Depository Company Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "TSDC";
		}
	};
	/**
	 * Taiwan Securities Central Depository Co Limited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TSCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaiwanSecuritiesCentralDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taiwan Securities Central Depository Co Limited."</li>
	 * </ul>
	 */
	public static final IssuerCode TaiwanSecuritiesCentralDepository = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaiwanSecuritiesCentralDepository";
			definition = "Taiwan Securities Central Depository Co Limited.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "TSCD";
		}
	};
	/**
	 * Turkey Takasbank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TVSB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Takasbank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Turkey Takasbank."</li>
	 * </ul>
	 */
	public static final IssuerCode Takasbank = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Takasbank";
			definition = "Turkey Takasbank.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "TVSB";
		}
	};
	/**
	 * UK Domestic Sort Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomesticSort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "UK Domestic Sort Code."</li>
	 * </ul>
	 */
	public static final IssuerCode UKDomesticSort = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomesticSort";
			definition = "UK Domestic Sort Code.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "GBSC";
		}
	};
	/**
	 * Bank of England (Central Moneymarkets Office).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOfEnglandCMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank of England (Central Moneymarkets Office)."</li>
	 * </ul>
	 */
	public static final IssuerCode BankOfEnglandCMO = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfEnglandCMO";
			definition = "Bank of England (Central Moneymarkets Office).";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "BKEN";
		}
	};
	/**
	 * CRESTCo Ltd. Company operating two real-time securities settlement
	 * services: CREST (for UK, Irish and international securities and
	 * government bonds) and CMO (UK money market instrument settlement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrestCo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CRESTCo Ltd. Company operating two real-time securities settlement services: CREST (for UK, Irish and international securities and government bonds) and CMO (UK money market instrument settlement)."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode CrestCo = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrestCo";
			definition = "CRESTCo Ltd. Company operating two real-time securities settlement services: CREST (for UK, Irish and international securities and government bonds) and CMO (UK money market instrument settlement).";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "CRST";
		}
	};
	/**
	 * UK Financial Services Authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FSAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialServicesAuthority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "UK Financial Services Authority."</li>
	 * </ul>
	 */
	public static final IssuerCode FinancialServicesAuthority = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialServicesAuthority";
			definition = "UK Financial Services Authority.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "FSAU";
		}
	};
	/**
	 * The London Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LCHL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LondonClearingHouse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The London Clearing House."</li>
	 * </ul>
	 */
	public static final IssuerCode LondonClearingHouse = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LondonClearingHouse";
			definition = "The London Clearing House.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "LCHL";
		}
	};
	/**
	 * UK - International Securities Market Association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XISM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalSecuritiesMarketAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "UK - International Securities Market Association."</li>
	 * </ul>
	 */
	public static final IssuerCode InternationalSecuritiesMarketAssociation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalSecuritiesMarketAssociation";
			definition = "UK - International Securities Market Association.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XISM";
		}
	};
	/**
	 * London Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XLON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LondonStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "London Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode LondonStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LondonStockExchange";
			definition = "London Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XLON";
		}
	};
	/**
	 * American Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XASE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "American Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode AmericanStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanStockExchange";
			definition = "American Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XASE";
		}
	};
	/**
	 * Depository Trust Company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryTrustCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Depository Trust Company."</li>
	 * </ul>
	 */
	public static final IssuerCode DepositoryTrustCompany = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryTrustCompany";
			definition = "Depository Trust Company.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "DTCC";
		}
	};
	/**
	 * USA Emerging Markets Clearing Corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmergingMarketsClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "USA Emerging Markets Clearing Corporation."</li>
	 * </ul>
	 */
	public static final IssuerCode EmergingMarketsClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmergingMarketsClearingCorporation";
			definition = "USA Emerging Markets Clearing Corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "EMCC";
		}
	};
	/**
	 * Fedwire Routing Number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USFW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fedwire Routing Number."</li>
	 * </ul>
	 */
	public static final IssuerCode FedwireRoutingNumber = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedwireRoutingNumber";
			definition = "Fedwire Routing Number.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "USFW";
		}
	};
	/**
	 * Provider of trade netting and settlement for the US Government securities
	 * marketplace.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GSCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecuritiesClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provider of trade netting and settlement for the US Government securities marketplace."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode GovernmentSecuritiesClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecuritiesClearingCorporation";
			definition = "Provider of trade netting and settlement for the US Government securities marketplace.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "GSCC";
		}
	};
	/**
	 * International Securities Clearing Corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalSecuritiesClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "International Securities Clearing Corporation."</li>
	 * </ul>
	 */
	public static final IssuerCode InternationalSecuritiesClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalSecuritiesClearingCorporation";
			definition = "International Securities Clearing Corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "ISCC";
		}
	};
	/**
	 * Mortgage Backed Securities Clearing Corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MBSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBackedSecuritiesClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mortgage Backed Securities Clearing Corporation."</li>
	 * </ul>
	 */
	public static final IssuerCode MortgageBackedSecuritiesClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBackedSecuritiesClearingCorporation";
			definition = "Mortgage Backed Securities Clearing Corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "MBSC";
		}
	};
	/**
	 * National Association Securities Dealers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XNAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalAssociationSecuritiesDealers"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "National Association Securities Dealers."</li>
	 * </ul>
	 */
	public static final IssuerCode NationalAssociationSecuritiesDealers = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalAssociationSecuritiesDealers";
			definition = "National Association Securities Dealers.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XNAS";
		}
	};
	/**
	 * National Association of Securities Dealers Automated Quotation Service
	 * "NASDAQ" / National Market System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XNMS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NASDAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "National Association of Securities Dealers Automated Quotation Service \"NASDAQ\" / National Market System."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode NASDAQ = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NASDAQ";
			definition = "National Association of Securities Dealers Automated Quotation Service \"NASDAQ\" / National Market System.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XNMS";
		}
	};
	/**
	 * National Securities Clearing Corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalSecuritiesClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "National Securities Clearing Corporation."</li>
	 * </ul>
	 */
	public static final IssuerCode NationalSecuritiesClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalSecuritiesClearingCorporation";
			definition = "National Securities Clearing Corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "NSCC";
		}
	};
	/**
	 * New York Clearing House.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NYCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkClearingHouse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New York Clearing House."</li>
	 * </ul>
	 */
	public static final IssuerCode NewYorkClearingHouse = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkClearingHouse";
			definition = "New York Clearing House.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "NYCH";
		}
	};
	/**
	 * New York Stock Exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XNYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New York Stock Exchange."</li>
	 * </ul>
	 */
	public static final IssuerCode NewYorkStockExchange = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkStockExchange";
			definition = "New York Stock Exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XNYS";
		}
	};
	/**
	 * Options Clearing Corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OCCX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionsClearingCorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Options Clearing Corporation."</li>
	 * </ul>
	 */
	public static final IssuerCode OptionsClearingCorporation = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionsClearingCorporation";
			definition = "Options Clearing Corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "OCCX";
		}
	};
	/**
	 * Participant Trust Company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTCY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantTrustCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant Trust Company."</li>
	 * </ul>
	 */
	public static final IssuerCode ParticipantTrustCompany = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantTrustCompany";
			definition = "Participant Trust Company.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "PTCY";
		}
	};
	/**
	 * X-Clear, clearing and risk management services for the Swiss banking
	 * industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "XClear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "X-Clear, clearing and risk management services for the Swiss banking industry."
	 * </li>
	 * </ul>
	 */
	public static final IssuerCode XClear = new IssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "XClear";
			definition = "X-Clear, clearing and risk management services for the Swiss banking industry.";
			owner_lazy = () -> com.tools20022.repository.codeset.IssuerCode.mmObject();
			codeName = "XCLR";
		}
	};
	final static private LinkedHashMap<String, IssuerCode> codesByName = new LinkedHashMap<>();

	protected IssuerCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "Format C, Party Identification"));
				example = Arrays.asList("CEDE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerCode";
				definition = "Identifies the institution issuing a proprietary code.";
				derivation_lazy = () -> Arrays.asList(PartyIssuerCode.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IssuerCode.ClearstreamBankLuxemburg, com.tools20022.repository.codeset.IssuerCode.CajaDeValores, com.tools20022.repository.codeset.IssuerCode.AustraclearLtd,
						com.tools20022.repository.codeset.IssuerCode.AustralianBankStateBranch, com.tools20022.repository.codeset.IssuerCode.ClearingHouseElectronicSettlementSystems,
						com.tools20022.repository.codeset.IssuerCode.AustrianBankLeitzahl, com.tools20022.repository.codeset.IssuerCode.OesterreichischeKontrollbank,
						com.tools20022.repository.codeset.IssuerCode.CaisseInterprofessionelleDepotsVirementsTitres, com.tools20022.repository.codeset.IssuerCode.Euroclear,
						com.tools20022.repository.codeset.IssuerCode.BanqueNationaleDeBelgique, com.tools20022.repository.codeset.IssuerCode.CamaraLiquidacaoCustodia,
						com.tools20022.repository.codeset.IssuerCode.CanadianDepositorySecuritiesLtd, com.tools20022.repository.codeset.IssuerCode.CanadianPaymentsAssociation,
						com.tools20022.repository.codeset.IssuerCode.CentralSecuritiesDepositoryDepositoCentralValores, com.tools20022.repository.codeset.IssuerCode.ShanghaiSecuritiesCentralClearingRegistrationCompany,
						com.tools20022.repository.codeset.IssuerCode.ShenzhenSecuritiesClearingCompany, com.tools20022.repository.codeset.IssuerCode.ColombiaCentralDepositorySystem,
						com.tools20022.repository.codeset.IssuerCode.DenmarkVaerdipapircentralen, com.tools20022.repository.codeset.IssuerCode.FinnishCentralSecuritiesDepositoryLtd, com.tools20022.repository.codeset.IssuerCode.FranceRIB,
						com.tools20022.repository.codeset.IssuerCode.SICOVAM, com.tools20022.repository.codeset.IssuerCode.PragueStockExchange, com.tools20022.repository.codeset.IssuerCode.BundesausichtsamtWertpapierhandel,
						com.tools20022.repository.codeset.IssuerCode.DeutscheBoerseAGDeutscheTerminborse, com.tools20022.repository.codeset.IssuerCode.DeutscheBoerseAGFrankfurterWertpapierborse,
						com.tools20022.repository.codeset.IssuerCode.DeutscheBoerseAGXETRA, com.tools20022.repository.codeset.IssuerCode.DeutscheBorseClearingAG, com.tools20022.repository.codeset.IssuerCode.DeutscheBundesbank,
						com.tools20022.repository.codeset.IssuerCode.GermanBankleitzahl, com.tools20022.repository.codeset.IssuerCode.ZentralerKreditausschuss,
						com.tools20022.repository.codeset.IssuerCode.HongKongCentralClearingSecuritiesSettlementSystem, com.tools20022.repository.codeset.IssuerCode.HongKongNationalClearing,
						com.tools20022.repository.codeset.IssuerCode.IndianNationalSecuritiesDepository, com.tools20022.repository.codeset.IssuerCode.IndonesianSecuritiesCentralDepository,
						com.tools20022.repository.codeset.IssuerCode.IrishNationalClearing, com.tools20022.repository.codeset.IssuerCode.TelAvivStockExchange, com.tools20022.repository.codeset.IssuerCode.ItalianDomesticIdentification,
						com.tools20022.repository.codeset.IssuerCode.MonteTitoli, com.tools20022.repository.codeset.IssuerCode.JapanSecuritiesClearingCorporation,
						com.tools20022.repository.codeset.IssuerCode.JapanSecuritiesDepositoryCenter, com.tools20022.repository.codeset.IssuerCode.KoreanSecuritiesDepository,
						com.tools20022.repository.codeset.IssuerCode.MalaysianCentralDepository, com.tools20022.repository.codeset.IssuerCode.IndevalSA, com.tools20022.repository.codeset.IssuerCode.AmsterdamseEffectenbeurs,
						com.tools20022.repository.codeset.IssuerCode.NECIGEF, com.tools20022.repository.codeset.IssuerCode.NewZealandNationalClearing, com.tools20022.repository.codeset.IssuerCode.NewZealandStockExchange,
						com.tools20022.repository.codeset.IssuerCode.Verdipapirsentralen, com.tools20022.repository.codeset.IssuerCode.PhilippineCentralDepository,
						com.tools20022.repository.codeset.IssuerCode.PolandNationalDepositorySecurities, com.tools20022.repository.codeset.IssuerCode.CentralValoresMobiliaros,
						com.tools20022.repository.codeset.IssuerCode.PortugueseNationalClearing, com.tools20022.repository.codeset.IssuerCode.INTERBOLSA, com.tools20022.repository.codeset.IssuerCode.RussianCentralBankIdentification,
						com.tools20022.repository.codeset.IssuerCode.SingaporeCentralDepositoryLtd, com.tools20022.repository.codeset.IssuerCode.SingaporeInternationalMonetaryExchange,
						com.tools20022.repository.codeset.IssuerCode.BratislavaStockExchange, com.tools20022.repository.codeset.IssuerCode.SouthAfricanNationalClearing,
						com.tools20022.repository.codeset.IssuerCode.StrateClearingSettlementLtd, com.tools20022.repository.codeset.IssuerCode.BancoEspana,
						com.tools20022.repository.codeset.IssuerCode.ServicioCompensacionLiquidacionValores, com.tools20022.repository.codeset.IssuerCode.SpanishDomesticInterbanking,
						com.tools20022.repository.codeset.IssuerCode.Vardepapperscentralen, com.tools20022.repository.codeset.IssuerCode.SISSEGAIntersettle, com.tools20022.repository.codeset.IssuerCode.SwissClearingCode,
						com.tools20022.repository.codeset.IssuerCode.ThailandSecuritiesDepositoryCompany, com.tools20022.repository.codeset.IssuerCode.TaiwanSecuritiesCentralDepository,
						com.tools20022.repository.codeset.IssuerCode.Takasbank, com.tools20022.repository.codeset.IssuerCode.UKDomesticSort, com.tools20022.repository.codeset.IssuerCode.BankOfEnglandCMO,
						com.tools20022.repository.codeset.IssuerCode.CrestCo, com.tools20022.repository.codeset.IssuerCode.FinancialServicesAuthority, com.tools20022.repository.codeset.IssuerCode.LondonClearingHouse,
						com.tools20022.repository.codeset.IssuerCode.InternationalSecuritiesMarketAssociation, com.tools20022.repository.codeset.IssuerCode.LondonStockExchange,
						com.tools20022.repository.codeset.IssuerCode.AmericanStockExchange, com.tools20022.repository.codeset.IssuerCode.DepositoryTrustCompany,
						com.tools20022.repository.codeset.IssuerCode.EmergingMarketsClearingCorporation, com.tools20022.repository.codeset.IssuerCode.FedwireRoutingNumber,
						com.tools20022.repository.codeset.IssuerCode.GovernmentSecuritiesClearingCorporation, com.tools20022.repository.codeset.IssuerCode.InternationalSecuritiesClearingCorporation,
						com.tools20022.repository.codeset.IssuerCode.MortgageBackedSecuritiesClearingCorporation, com.tools20022.repository.codeset.IssuerCode.NationalAssociationSecuritiesDealers,
						com.tools20022.repository.codeset.IssuerCode.NASDAQ, com.tools20022.repository.codeset.IssuerCode.NationalSecuritiesClearingCorporation, com.tools20022.repository.codeset.IssuerCode.NewYorkClearingHouse,
						com.tools20022.repository.codeset.IssuerCode.NewYorkStockExchange, com.tools20022.repository.codeset.IssuerCode.OptionsClearingCorporation, com.tools20022.repository.codeset.IssuerCode.ParticipantTrustCompany,
						com.tools20022.repository.codeset.IssuerCode.XClear);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ClearstreamBankLuxemburg.getCodeName().get(), ClearstreamBankLuxemburg);
		codesByName.put(CajaDeValores.getCodeName().get(), CajaDeValores);
		codesByName.put(AustraclearLtd.getCodeName().get(), AustraclearLtd);
		codesByName.put(AustralianBankStateBranch.getCodeName().get(), AustralianBankStateBranch);
		codesByName.put(ClearingHouseElectronicSettlementSystems.getCodeName().get(), ClearingHouseElectronicSettlementSystems);
		codesByName.put(AustrianBankLeitzahl.getCodeName().get(), AustrianBankLeitzahl);
		codesByName.put(OesterreichischeKontrollbank.getCodeName().get(), OesterreichischeKontrollbank);
		codesByName.put(CaisseInterprofessionelleDepotsVirementsTitres.getCodeName().get(), CaisseInterprofessionelleDepotsVirementsTitres);
		codesByName.put(Euroclear.getCodeName().get(), Euroclear);
		codesByName.put(BanqueNationaleDeBelgique.getCodeName().get(), BanqueNationaleDeBelgique);
		codesByName.put(CamaraLiquidacaoCustodia.getCodeName().get(), CamaraLiquidacaoCustodia);
		codesByName.put(CanadianDepositorySecuritiesLtd.getCodeName().get(), CanadianDepositorySecuritiesLtd);
		codesByName.put(CanadianPaymentsAssociation.getCodeName().get(), CanadianPaymentsAssociation);
		codesByName.put(CentralSecuritiesDepositoryDepositoCentralValores.getCodeName().get(), CentralSecuritiesDepositoryDepositoCentralValores);
		codesByName.put(ShanghaiSecuritiesCentralClearingRegistrationCompany.getCodeName().get(), ShanghaiSecuritiesCentralClearingRegistrationCompany);
		codesByName.put(ShenzhenSecuritiesClearingCompany.getCodeName().get(), ShenzhenSecuritiesClearingCompany);
		codesByName.put(ColombiaCentralDepositorySystem.getCodeName().get(), ColombiaCentralDepositorySystem);
		codesByName.put(DenmarkVaerdipapircentralen.getCodeName().get(), DenmarkVaerdipapircentralen);
		codesByName.put(FinnishCentralSecuritiesDepositoryLtd.getCodeName().get(), FinnishCentralSecuritiesDepositoryLtd);
		codesByName.put(FranceRIB.getCodeName().get(), FranceRIB);
		codesByName.put(SICOVAM.getCodeName().get(), SICOVAM);
		codesByName.put(PragueStockExchange.getCodeName().get(), PragueStockExchange);
		codesByName.put(BundesausichtsamtWertpapierhandel.getCodeName().get(), BundesausichtsamtWertpapierhandel);
		codesByName.put(DeutscheBoerseAGDeutscheTerminborse.getCodeName().get(), DeutscheBoerseAGDeutscheTerminborse);
		codesByName.put(DeutscheBoerseAGFrankfurterWertpapierborse.getCodeName().get(), DeutscheBoerseAGFrankfurterWertpapierborse);
		codesByName.put(DeutscheBoerseAGXETRA.getCodeName().get(), DeutscheBoerseAGXETRA);
		codesByName.put(DeutscheBorseClearingAG.getCodeName().get(), DeutscheBorseClearingAG);
		codesByName.put(DeutscheBundesbank.getCodeName().get(), DeutscheBundesbank);
		codesByName.put(GermanBankleitzahl.getCodeName().get(), GermanBankleitzahl);
		codesByName.put(ZentralerKreditausschuss.getCodeName().get(), ZentralerKreditausschuss);
		codesByName.put(HongKongCentralClearingSecuritiesSettlementSystem.getCodeName().get(), HongKongCentralClearingSecuritiesSettlementSystem);
		codesByName.put(HongKongNationalClearing.getCodeName().get(), HongKongNationalClearing);
		codesByName.put(IndianNationalSecuritiesDepository.getCodeName().get(), IndianNationalSecuritiesDepository);
		codesByName.put(IndonesianSecuritiesCentralDepository.getCodeName().get(), IndonesianSecuritiesCentralDepository);
		codesByName.put(IrishNationalClearing.getCodeName().get(), IrishNationalClearing);
		codesByName.put(TelAvivStockExchange.getCodeName().get(), TelAvivStockExchange);
		codesByName.put(ItalianDomesticIdentification.getCodeName().get(), ItalianDomesticIdentification);
		codesByName.put(MonteTitoli.getCodeName().get(), MonteTitoli);
		codesByName.put(JapanSecuritiesClearingCorporation.getCodeName().get(), JapanSecuritiesClearingCorporation);
		codesByName.put(JapanSecuritiesDepositoryCenter.getCodeName().get(), JapanSecuritiesDepositoryCenter);
		codesByName.put(KoreanSecuritiesDepository.getCodeName().get(), KoreanSecuritiesDepository);
		codesByName.put(MalaysianCentralDepository.getCodeName().get(), MalaysianCentralDepository);
		codesByName.put(IndevalSA.getCodeName().get(), IndevalSA);
		codesByName.put(AmsterdamseEffectenbeurs.getCodeName().get(), AmsterdamseEffectenbeurs);
		codesByName.put(NECIGEF.getCodeName().get(), NECIGEF);
		codesByName.put(NewZealandNationalClearing.getCodeName().get(), NewZealandNationalClearing);
		codesByName.put(NewZealandStockExchange.getCodeName().get(), NewZealandStockExchange);
		codesByName.put(Verdipapirsentralen.getCodeName().get(), Verdipapirsentralen);
		codesByName.put(PhilippineCentralDepository.getCodeName().get(), PhilippineCentralDepository);
		codesByName.put(PolandNationalDepositorySecurities.getCodeName().get(), PolandNationalDepositorySecurities);
		codesByName.put(CentralValoresMobiliaros.getCodeName().get(), CentralValoresMobiliaros);
		codesByName.put(PortugueseNationalClearing.getCodeName().get(), PortugueseNationalClearing);
		codesByName.put(INTERBOLSA.getCodeName().get(), INTERBOLSA);
		codesByName.put(RussianCentralBankIdentification.getCodeName().get(), RussianCentralBankIdentification);
		codesByName.put(SingaporeCentralDepositoryLtd.getCodeName().get(), SingaporeCentralDepositoryLtd);
		codesByName.put(SingaporeInternationalMonetaryExchange.getCodeName().get(), SingaporeInternationalMonetaryExchange);
		codesByName.put(BratislavaStockExchange.getCodeName().get(), BratislavaStockExchange);
		codesByName.put(SouthAfricanNationalClearing.getCodeName().get(), SouthAfricanNationalClearing);
		codesByName.put(StrateClearingSettlementLtd.getCodeName().get(), StrateClearingSettlementLtd);
		codesByName.put(BancoEspana.getCodeName().get(), BancoEspana);
		codesByName.put(ServicioCompensacionLiquidacionValores.getCodeName().get(), ServicioCompensacionLiquidacionValores);
		codesByName.put(SpanishDomesticInterbanking.getCodeName().get(), SpanishDomesticInterbanking);
		codesByName.put(Vardepapperscentralen.getCodeName().get(), Vardepapperscentralen);
		codesByName.put(SISSEGAIntersettle.getCodeName().get(), SISSEGAIntersettle);
		codesByName.put(SwissClearingCode.getCodeName().get(), SwissClearingCode);
		codesByName.put(ThailandSecuritiesDepositoryCompany.getCodeName().get(), ThailandSecuritiesDepositoryCompany);
		codesByName.put(TaiwanSecuritiesCentralDepository.getCodeName().get(), TaiwanSecuritiesCentralDepository);
		codesByName.put(Takasbank.getCodeName().get(), Takasbank);
		codesByName.put(UKDomesticSort.getCodeName().get(), UKDomesticSort);
		codesByName.put(BankOfEnglandCMO.getCodeName().get(), BankOfEnglandCMO);
		codesByName.put(CrestCo.getCodeName().get(), CrestCo);
		codesByName.put(FinancialServicesAuthority.getCodeName().get(), FinancialServicesAuthority);
		codesByName.put(LondonClearingHouse.getCodeName().get(), LondonClearingHouse);
		codesByName.put(InternationalSecuritiesMarketAssociation.getCodeName().get(), InternationalSecuritiesMarketAssociation);
		codesByName.put(LondonStockExchange.getCodeName().get(), LondonStockExchange);
		codesByName.put(AmericanStockExchange.getCodeName().get(), AmericanStockExchange);
		codesByName.put(DepositoryTrustCompany.getCodeName().get(), DepositoryTrustCompany);
		codesByName.put(EmergingMarketsClearingCorporation.getCodeName().get(), EmergingMarketsClearingCorporation);
		codesByName.put(FedwireRoutingNumber.getCodeName().get(), FedwireRoutingNumber);
		codesByName.put(GovernmentSecuritiesClearingCorporation.getCodeName().get(), GovernmentSecuritiesClearingCorporation);
		codesByName.put(InternationalSecuritiesClearingCorporation.getCodeName().get(), InternationalSecuritiesClearingCorporation);
		codesByName.put(MortgageBackedSecuritiesClearingCorporation.getCodeName().get(), MortgageBackedSecuritiesClearingCorporation);
		codesByName.put(NationalAssociationSecuritiesDealers.getCodeName().get(), NationalAssociationSecuritiesDealers);
		codesByName.put(NASDAQ.getCodeName().get(), NASDAQ);
		codesByName.put(NationalSecuritiesClearingCorporation.getCodeName().get(), NationalSecuritiesClearingCorporation);
		codesByName.put(NewYorkClearingHouse.getCodeName().get(), NewYorkClearingHouse);
		codesByName.put(NewYorkStockExchange.getCodeName().get(), NewYorkStockExchange);
		codesByName.put(OptionsClearingCorporation.getCodeName().get(), OptionsClearingCorporation);
		codesByName.put(ParticipantTrustCompany.getCodeName().get(), ParticipantTrustCompany);
		codesByName.put(XClear.getCodeName().get(), XClear);
	}

	public static IssuerCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IssuerCode[] values() {
		IssuerCode[] values = new IssuerCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IssuerCode> {
		@Override
		public IssuerCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IssuerCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}