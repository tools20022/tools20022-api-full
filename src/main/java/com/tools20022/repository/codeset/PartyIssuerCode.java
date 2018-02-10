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

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PartyIssuerCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the institution having originated a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ClearstreamBankLuxemburg
 * PartyIssuerCode.ClearstreamBankLuxemburg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CajaDeValores
 * PartyIssuerCode.CajaDeValores}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#AustraclearLtd
 * PartyIssuerCode.AustraclearLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#AustralianBankStateBranch
 * PartyIssuerCode.AustralianBankStateBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ClearingHouseElectronicSettlementSystems
 * PartyIssuerCode.ClearingHouseElectronicSettlementSystems}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#AustrianBankLeitzahl
 * PartyIssuerCode.AustrianBankLeitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#OesterreichischeKontrollbank
 * PartyIssuerCode.OesterreichischeKontrollbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CaisseInterprofessionelleDepotsVirementsTitres
 * PartyIssuerCode.CaisseInterprofessionelleDepotsVirementsTitres}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#Euroclear
 * PartyIssuerCode.Euroclear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#BanqueNationaleDeBelgique
 * PartyIssuerCode.BanqueNationaleDeBelgique}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CamaraLiquidacaoCustodia
 * PartyIssuerCode.CamaraLiquidacaoCustodia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CanadianDepositorySecuritiesLtd
 * PartyIssuerCode.CanadianDepositorySecuritiesLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CanadianPaymentsAssociation
 * PartyIssuerCode.CanadianPaymentsAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CentralSecuritiesDepositoryDepositoCentralValores
 * PartyIssuerCode.CentralSecuritiesDepositoryDepositoCentralValores}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ShanghaiSecuritiesCentralClearingRegistrationCompany
 * PartyIssuerCode.ShanghaiSecuritiesCentralClearingRegistrationCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ShenzhenSecuritiesClearingCompany
 * PartyIssuerCode.ShenzhenSecuritiesClearingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ColombiaCentralDepositorySystem
 * PartyIssuerCode.ColombiaCentralDepositorySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DenmarkVaerdipapircentralen
 * PartyIssuerCode.DenmarkVaerdipapircentralen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#FinnishCentralSecuritiesDepositoryLtd
 * PartyIssuerCode.FinnishCentralSecuritiesDepositoryLtd}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#FranceRIB
 * PartyIssuerCode.FranceRIB}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SICOVAM
 * PartyIssuerCode.SICOVAM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#PragueStockExchange
 * PartyIssuerCode.PragueStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#BundesausichtsamtWertpapierhandel
 * PartyIssuerCode.BundesausichtsamtWertpapierhandel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DeutscheBoerseAGDeutscheTerminborse
 * PartyIssuerCode.DeutscheBoerseAGDeutscheTerminborse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DeutscheBoerseAGFrankfurterWertpapierborse
 * PartyIssuerCode.DeutscheBoerseAGFrankfurterWertpapierborse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DeutscheBoerseAGXETRA
 * PartyIssuerCode.DeutscheBoerseAGXETRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DeutscheBorseClearingAG
 * PartyIssuerCode.DeutscheBorseClearingAG}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DeutscheBundesbank
 * PartyIssuerCode.DeutscheBundesbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#GermanBankleitzahl
 * PartyIssuerCode.GermanBankleitzahl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ZentralerKreditausschuss
 * PartyIssuerCode.ZentralerKreditausschuss}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#HongKongCentralClearingSecuritiesSettlementSystem
 * PartyIssuerCode.HongKongCentralClearingSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#HongKongNationalClearing
 * PartyIssuerCode.HongKongNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#IndianNationalSecuritiesDepository
 * PartyIssuerCode.IndianNationalSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#IndonesianSecuritiesCentralDepository
 * PartyIssuerCode.IndonesianSecuritiesCentralDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#IrishNationalClearing
 * PartyIssuerCode.IrishNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#TelAvivStockExchange
 * PartyIssuerCode.TelAvivStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ItalianDomesticIdentification
 * PartyIssuerCode.ItalianDomesticIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#MonteTitoli
 * PartyIssuerCode.MonteTitoli}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#JapanSecuritiesClearingCorporation
 * PartyIssuerCode.JapanSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#JapanSecuritiesDepositoryCenter
 * PartyIssuerCode.JapanSecuritiesDepositoryCenter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#KoreanSecuritiesDepository
 * PartyIssuerCode.KoreanSecuritiesDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#MalaysianCentralDepository
 * PartyIssuerCode.MalaysianCentralDepository}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#IndevalSA
 * PartyIssuerCode.IndevalSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#AmsterdamseEffectenbeurs
 * PartyIssuerCode.AmsterdamseEffectenbeurs}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NECIGEF
 * PartyIssuerCode.NECIGEF}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NewZealandNationalClearing
 * PartyIssuerCode.NewZealandNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NewZealandStockExchange
 * PartyIssuerCode.NewZealandStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#Verdipapirsentralen
 * PartyIssuerCode.Verdipapirsentralen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#PhilippineCentralDepository
 * PartyIssuerCode.PhilippineCentralDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#PolandNationalDepositorySecurities
 * PartyIssuerCode.PolandNationalDepositorySecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CentralValoresMobiliaros
 * PartyIssuerCode.CentralValoresMobiliaros}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#PortugueseNationalClearing
 * PartyIssuerCode.PortugueseNationalClearing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#INTERBOLSA
 * PartyIssuerCode.INTERBOLSA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#RussianCentralBankIdentification
 * PartyIssuerCode.RussianCentralBankIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SingaporeCentralDepositoryLtd
 * PartyIssuerCode.SingaporeCentralDepositoryLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SingaporeInternationalMonetaryExchange
 * PartyIssuerCode.SingaporeInternationalMonetaryExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#BratislavaStockExchange
 * PartyIssuerCode.BratislavaStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SouthAfricanNationalClearing
 * PartyIssuerCode.SouthAfricanNationalClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#StrateClearingSettlementLtd
 * PartyIssuerCode.StrateClearingSettlementLtd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#BancoEspana
 * PartyIssuerCode.BancoEspana}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ServicioCompensacionLiquidacionValores
 * PartyIssuerCode.ServicioCompensacionLiquidacionValores}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SpanishDomesticInterbanking
 * PartyIssuerCode.SpanishDomesticInterbanking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#Vardepapperscentralen
 * PartyIssuerCode.Vardepapperscentralen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SISSEGAIntersettle
 * PartyIssuerCode.SISSEGAIntersettle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#SwissClearingCode
 * PartyIssuerCode.SwissClearingCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ThailandSecuritiesDepositoryCompany
 * PartyIssuerCode.ThailandSecuritiesDepositoryCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#TaiwanSecuritiesCentralDepository
 * PartyIssuerCode.TaiwanSecuritiesCentralDepository}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#Takasbank
 * PartyIssuerCode.Takasbank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#UKDomesticSort
 * PartyIssuerCode.UKDomesticSort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#BankOfEnglandCMO
 * PartyIssuerCode.BankOfEnglandCMO}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#CrestCo
 * PartyIssuerCode.CrestCo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#FinancialServicesAuthority
 * PartyIssuerCode.FinancialServicesAuthority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#LondonClearingHouse
 * PartyIssuerCode.LondonClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#InternationalSecuritiesMarketAssociation
 * PartyIssuerCode.InternationalSecuritiesMarketAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#LondonStockExchange
 * PartyIssuerCode.LondonStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#AmericanStockExchange
 * PartyIssuerCode.AmericanStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#DepositoryTrustCompany
 * PartyIssuerCode.DepositoryTrustCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#EmergingMarketsClearingCorporation
 * PartyIssuerCode.EmergingMarketsClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#FedwireRoutingNumber
 * PartyIssuerCode.FedwireRoutingNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#GovernmentSecuritiesClearingCorporation
 * PartyIssuerCode.GovernmentSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#InternationalSecuritiesClearingCorporation
 * PartyIssuerCode.InternationalSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#MortgageBackedSecuritiesClearingCorporation
 * PartyIssuerCode.MortgageBackedSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NationalAssociationSecuritiesDealers
 * PartyIssuerCode.NationalAssociationSecuritiesDealers}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NASDAQ
 * PartyIssuerCode.NASDAQ}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NationalSecuritiesClearingCorporation
 * PartyIssuerCode.NationalSecuritiesClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NewYorkClearingHouse
 * PartyIssuerCode.NewYorkClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#NewYorkStockExchange
 * PartyIssuerCode.NewYorkStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#OptionsClearingCorporation
 * PartyIssuerCode.OptionsClearingCorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode#ParticipantTrustCompany
 * PartyIssuerCode.ParticipantTrustCompany}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IssuerCode IssuerCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * "PartyIssuerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the institution having originated a party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PartyIssuerCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearstreamBankLuxemburg"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ClearstreamBankLuxemburg = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearstreamBankLuxemburg";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ClearstreamBankLuxemburg.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CajaDeValores"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CajaDeValores = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CajaDeValores";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CajaDeValores.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustraclearLtd"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode AustraclearLtd = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustraclearLtd";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.AustraclearLtd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBankStateBranch"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode AustralianBankStateBranch = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBankStateBranch";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.AustralianBankStateBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingHouseElectronicSettlementSystems"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ClearingHouseElectronicSettlementSystems = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseElectronicSettlementSystems";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ClearingHouseElectronicSettlementSystems.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustrianBankLeitzahl"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode AustrianBankLeitzahl = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustrianBankLeitzahl";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.AustrianBankLeitzahl.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OesterreichischeKontrollbank"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode OesterreichischeKontrollbank = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OesterreichischeKontrollbank";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.OesterreichischeKontrollbank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CaisseInterprofessionelleDepotsVirementsTitres"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CaisseInterprofessionelleDepotsVirementsTitres = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaisseInterprofessionelleDepotsVirementsTitres";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CaisseInterprofessionelleDepotsVirementsTitres.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Euroclear"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode Euroclear = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euroclear";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.Euroclear.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BanqueNationaleDeBelgique"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode BanqueNationaleDeBelgique = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BanqueNationaleDeBelgique";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.BanqueNationaleDeBelgique.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CamaraLiquidacaoCustodia"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CamaraLiquidacaoCustodia = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CamaraLiquidacaoCustodia";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CamaraLiquidacaoCustodia.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianDepositorySecuritiesLtd"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CanadianDepositorySecuritiesLtd = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositorySecuritiesLtd";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CanadianDepositorySecuritiesLtd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanadianPaymentsAssociation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CanadianPaymentsAssociation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianPaymentsAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CanadianPaymentsAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralSecuritiesDepositoryDepositoCentralValores"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CentralSecuritiesDepositoryDepositoCentralValores = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepositoryDepositoCentralValores";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CentralSecuritiesDepositoryDepositoCentralValores.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShanghaiSecuritiesCentralClearingRegistrationCompany"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ShanghaiSecuritiesCentralClearingRegistrationCompany = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShanghaiSecuritiesCentralClearingRegistrationCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ShanghaiSecuritiesCentralClearingRegistrationCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShenzhenSecuritiesClearingCompany"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ShenzhenSecuritiesClearingCompany = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShenzhenSecuritiesClearingCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ShenzhenSecuritiesClearingCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ColombiaCentralDepositorySystem"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ColombiaCentralDepositorySystem = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ColombiaCentralDepositorySystem";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ColombiaCentralDepositorySystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenmarkVaerdipapircentralen"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DenmarkVaerdipapircentralen = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenmarkVaerdipapircentralen";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DenmarkVaerdipapircentralen.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinnishCentralSecuritiesDepositoryLtd"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode FinnishCentralSecuritiesDepositoryLtd = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinnishCentralSecuritiesDepositoryLtd";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.FinnishCentralSecuritiesDepositoryLtd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FranceRIB"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode FranceRIB = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FranceRIB";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.FranceRIB.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SICOVAM"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SICOVAM = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SICOVAM";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SICOVAM.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PragueStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode PragueStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PragueStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.PragueStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BundesausichtsamtWertpapierhandel"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode BundesausichtsamtWertpapierhandel = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BundesausichtsamtWertpapierhandel";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.BundesausichtsamtWertpapierhandel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBoerseAGDeutscheTerminborse"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DeutscheBoerseAGDeutscheTerminborse = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGDeutscheTerminborse";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DeutscheBoerseAGDeutscheTerminborse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBoerseAGFrankfurterWertpapierborse"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DeutscheBoerseAGFrankfurterWertpapierborse = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGFrankfurterWertpapierborse";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DeutscheBoerseAGFrankfurterWertpapierborse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBoerseAGXETRA"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DeutscheBoerseAGXETRA = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGXETRA";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DeutscheBoerseAGXETRA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBorseClearingAG"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DeutscheBorseClearingAG = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBorseClearingAG";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DeutscheBorseClearingAG.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeutscheBundesbank"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DeutscheBundesbank = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBundesbank";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DeutscheBundesbank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanBankleitzahl"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode GermanBankleitzahl = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanBankleitzahl";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.GermanBankleitzahl.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ZentralerKreditausschuss"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ZentralerKreditausschuss = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZentralerKreditausschuss";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ZentralerKreditausschuss.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongCentralClearingSecuritiesSettlementSystem"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode HongKongCentralClearingSecuritiesSettlementSystem = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongCentralClearingSecuritiesSettlementSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.HongKongCentralClearingSecuritiesSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKongNationalClearing"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode HongKongNationalClearing = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongNationalClearing";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.HongKongNationalClearing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndianNationalSecuritiesDepository"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode IndianNationalSecuritiesDepository = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndianNationalSecuritiesDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.IndianNationalSecuritiesDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndonesianSecuritiesCentralDepository"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode IndonesianSecuritiesCentralDepository = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndonesianSecuritiesCentralDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.IndonesianSecuritiesCentralDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IrishNationalClearing"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode IrishNationalClearing = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IrishNationalClearing";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.IrishNationalClearing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelAvivStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode TelAvivStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelAvivStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.TelAvivStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItalianDomesticIdentification"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ItalianDomesticIdentification = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItalianDomesticIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ItalianDomesticIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonteTitoli"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode MonteTitoli = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonteTitoli";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.MonteTitoli.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JapanSecuritiesClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode JapanSecuritiesClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JapanSecuritiesClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.JapanSecuritiesClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JapanSecuritiesDepositoryCenter"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode JapanSecuritiesDepositoryCenter = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JapanSecuritiesDepositoryCenter";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.JapanSecuritiesDepositoryCenter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KoreanSecuritiesDepository"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode KoreanSecuritiesDepository = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KoreanSecuritiesDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.KoreanSecuritiesDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MalaysianCentralDepository"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode MalaysianCentralDepository = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MalaysianCentralDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.MalaysianCentralDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndevalSA"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode IndevalSA = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndevalSA";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.IndevalSA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmsterdamseEffectenbeurs"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode AmsterdamseEffectenbeurs = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmsterdamseEffectenbeurs";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.AmsterdamseEffectenbeurs.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NECIGEF"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NECIGEF = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NECIGEF";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NECIGEF.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandNationalClearing"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NewZealandNationalClearing = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandNationalClearing";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NewZealandNationalClearing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealandStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NewZealandStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NewZealandStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Verdipapirsentralen"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode Verdipapirsentralen = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verdipapirsentralen";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.Verdipapirsentralen.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhilippineCentralDepository"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode PhilippineCentralDepository = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhilippineCentralDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.PhilippineCentralDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PolandNationalDepositorySecurities"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode PolandNationalDepositorySecurities = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PolandNationalDepositorySecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.PolandNationalDepositorySecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralValoresMobiliaros"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CentralValoresMobiliaros = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralValoresMobiliaros";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CentralValoresMobiliaros.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortugueseNationalClearing"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode PortugueseNationalClearing = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortugueseNationalClearing";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.PortugueseNationalClearing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "INTERBOLSA"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode INTERBOLSA = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "INTERBOLSA";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.INTERBOLSA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RussianCentralBankIdentification"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode RussianCentralBankIdentification = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RussianCentralBankIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.RussianCentralBankIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingaporeCentralDepositoryLtd"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SingaporeCentralDepositoryLtd = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingaporeCentralDepositoryLtd";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SingaporeCentralDepositoryLtd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingaporeInternationalMonetaryExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SingaporeInternationalMonetaryExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingaporeInternationalMonetaryExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SingaporeInternationalMonetaryExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BratislavaStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode BratislavaStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BratislavaStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.BratislavaStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfricanNationalClearing"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SouthAfricanNationalClearing = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SouthAfricanNationalClearing";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SouthAfricanNationalClearing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrateClearingSettlementLtd"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode StrateClearingSettlementLtd = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrateClearingSettlementLtd";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.StrateClearingSettlementLtd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BancoEspana"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode BancoEspana = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BancoEspana";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.BancoEspana.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServicioCompensacionLiquidacionValores"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ServicioCompensacionLiquidacionValores = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicioCompensacionLiquidacionValores";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ServicioCompensacionLiquidacionValores.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpanishDomesticInterbanking"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SpanishDomesticInterbanking = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpanishDomesticInterbanking";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SpanishDomesticInterbanking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vardepapperscentralen"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode Vardepapperscentralen = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vardepapperscentralen";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.Vardepapperscentralen.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SISSEGAIntersettle"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SISSEGAIntersettle = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SISSEGAIntersettle";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SISSEGAIntersettle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwissClearingCode"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode SwissClearingCode = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissClearingCode";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.SwissClearingCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThailandSecuritiesDepositoryCompany"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ThailandSecuritiesDepositoryCompany = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThailandSecuritiesDepositoryCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ThailandSecuritiesDepositoryCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaiwanSecuritiesCentralDepository"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode TaiwanSecuritiesCentralDepository = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaiwanSecuritiesCentralDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.TaiwanSecuritiesCentralDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Takasbank"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode Takasbank = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Takasbank";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.Takasbank.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UKDomesticSort"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode UKDomesticSort = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomesticSort";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.UKDomesticSort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOfEnglandCMO"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode BankOfEnglandCMO = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfEnglandCMO";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.BankOfEnglandCMO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrestCo"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode CrestCo = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrestCo";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.CrestCo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialServicesAuthority"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode FinancialServicesAuthority = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialServicesAuthority";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.FinancialServicesAuthority.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LondonClearingHouse"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode LondonClearingHouse = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LondonClearingHouse";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.LondonClearingHouse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalSecuritiesMarketAssociation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode InternationalSecuritiesMarketAssociation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalSecuritiesMarketAssociation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.InternationalSecuritiesMarketAssociation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LondonStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode LondonStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LondonStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.LondonStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmericanStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode AmericanStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.AmericanStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryTrustCompany"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode DepositoryTrustCompany = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryTrustCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.DepositoryTrustCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmergingMarketsClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode EmergingMarketsClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmergingMarketsClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.EmergingMarketsClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedwireRoutingNumber"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode FedwireRoutingNumber = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedwireRoutingNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.FedwireRoutingNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentSecuritiesClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode GovernmentSecuritiesClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecuritiesClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.GovernmentSecuritiesClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalSecuritiesClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode InternationalSecuritiesClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalSecuritiesClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.InternationalSecuritiesClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBackedSecuritiesClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode MortgageBackedSecuritiesClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBackedSecuritiesClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.MortgageBackedSecuritiesClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalAssociationSecuritiesDealers"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NationalAssociationSecuritiesDealers = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalAssociationSecuritiesDealers";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NationalAssociationSecuritiesDealers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NASDAQ"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NASDAQ = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NASDAQ";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NASDAQ.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalSecuritiesClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NationalSecuritiesClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalSecuritiesClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NationalSecuritiesClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkClearingHouse"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NewYorkClearingHouse = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkClearingHouse";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NewYorkClearingHouse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkStockExchange"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode NewYorkStockExchange = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkStockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.NewYorkStockExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionsClearingCorporation"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode OptionsClearingCorporation = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionsClearingCorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.OptionsClearingCorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PartyIssuerCode
	 * PartyIssuerCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantTrustCompany"</li>
	 * </ul>
	 */
	public static final PartyIssuerCode ParticipantTrustCompany = new PartyIssuerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantTrustCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.PartyIssuerCode.mmObject();
			codeName = IssuerCode.ParticipantTrustCompany.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PartyIssuerCode> codesByName = new LinkedHashMap<>();

	protected PartyIssuerCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CEDE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIssuerCode";
				definition = "Identifies the institution having originated a party.";
				trace_lazy = () -> IssuerCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PartyIssuerCode.ClearstreamBankLuxemburg, com.tools20022.repository.codeset.PartyIssuerCode.CajaDeValores,
						com.tools20022.repository.codeset.PartyIssuerCode.AustraclearLtd, com.tools20022.repository.codeset.PartyIssuerCode.AustralianBankStateBranch,
						com.tools20022.repository.codeset.PartyIssuerCode.ClearingHouseElectronicSettlementSystems, com.tools20022.repository.codeset.PartyIssuerCode.AustrianBankLeitzahl,
						com.tools20022.repository.codeset.PartyIssuerCode.OesterreichischeKontrollbank, com.tools20022.repository.codeset.PartyIssuerCode.CaisseInterprofessionelleDepotsVirementsTitres,
						com.tools20022.repository.codeset.PartyIssuerCode.Euroclear, com.tools20022.repository.codeset.PartyIssuerCode.BanqueNationaleDeBelgique, com.tools20022.repository.codeset.PartyIssuerCode.CamaraLiquidacaoCustodia,
						com.tools20022.repository.codeset.PartyIssuerCode.CanadianDepositorySecuritiesLtd, com.tools20022.repository.codeset.PartyIssuerCode.CanadianPaymentsAssociation,
						com.tools20022.repository.codeset.PartyIssuerCode.CentralSecuritiesDepositoryDepositoCentralValores, com.tools20022.repository.codeset.PartyIssuerCode.ShanghaiSecuritiesCentralClearingRegistrationCompany,
						com.tools20022.repository.codeset.PartyIssuerCode.ShenzhenSecuritiesClearingCompany, com.tools20022.repository.codeset.PartyIssuerCode.ColombiaCentralDepositorySystem,
						com.tools20022.repository.codeset.PartyIssuerCode.DenmarkVaerdipapircentralen, com.tools20022.repository.codeset.PartyIssuerCode.FinnishCentralSecuritiesDepositoryLtd,
						com.tools20022.repository.codeset.PartyIssuerCode.FranceRIB, com.tools20022.repository.codeset.PartyIssuerCode.SICOVAM, com.tools20022.repository.codeset.PartyIssuerCode.PragueStockExchange,
						com.tools20022.repository.codeset.PartyIssuerCode.BundesausichtsamtWertpapierhandel, com.tools20022.repository.codeset.PartyIssuerCode.DeutscheBoerseAGDeutscheTerminborse,
						com.tools20022.repository.codeset.PartyIssuerCode.DeutscheBoerseAGFrankfurterWertpapierborse, com.tools20022.repository.codeset.PartyIssuerCode.DeutscheBoerseAGXETRA,
						com.tools20022.repository.codeset.PartyIssuerCode.DeutscheBorseClearingAG, com.tools20022.repository.codeset.PartyIssuerCode.DeutscheBundesbank, com.tools20022.repository.codeset.PartyIssuerCode.GermanBankleitzahl,
						com.tools20022.repository.codeset.PartyIssuerCode.ZentralerKreditausschuss, com.tools20022.repository.codeset.PartyIssuerCode.HongKongCentralClearingSecuritiesSettlementSystem,
						com.tools20022.repository.codeset.PartyIssuerCode.HongKongNationalClearing, com.tools20022.repository.codeset.PartyIssuerCode.IndianNationalSecuritiesDepository,
						com.tools20022.repository.codeset.PartyIssuerCode.IndonesianSecuritiesCentralDepository, com.tools20022.repository.codeset.PartyIssuerCode.IrishNationalClearing,
						com.tools20022.repository.codeset.PartyIssuerCode.TelAvivStockExchange, com.tools20022.repository.codeset.PartyIssuerCode.ItalianDomesticIdentification, com.tools20022.repository.codeset.PartyIssuerCode.MonteTitoli,
						com.tools20022.repository.codeset.PartyIssuerCode.JapanSecuritiesClearingCorporation, com.tools20022.repository.codeset.PartyIssuerCode.JapanSecuritiesDepositoryCenter,
						com.tools20022.repository.codeset.PartyIssuerCode.KoreanSecuritiesDepository, com.tools20022.repository.codeset.PartyIssuerCode.MalaysianCentralDepository,
						com.tools20022.repository.codeset.PartyIssuerCode.IndevalSA, com.tools20022.repository.codeset.PartyIssuerCode.AmsterdamseEffectenbeurs, com.tools20022.repository.codeset.PartyIssuerCode.NECIGEF,
						com.tools20022.repository.codeset.PartyIssuerCode.NewZealandNationalClearing, com.tools20022.repository.codeset.PartyIssuerCode.NewZealandStockExchange,
						com.tools20022.repository.codeset.PartyIssuerCode.Verdipapirsentralen, com.tools20022.repository.codeset.PartyIssuerCode.PhilippineCentralDepository,
						com.tools20022.repository.codeset.PartyIssuerCode.PolandNationalDepositorySecurities, com.tools20022.repository.codeset.PartyIssuerCode.CentralValoresMobiliaros,
						com.tools20022.repository.codeset.PartyIssuerCode.PortugueseNationalClearing, com.tools20022.repository.codeset.PartyIssuerCode.INTERBOLSA,
						com.tools20022.repository.codeset.PartyIssuerCode.RussianCentralBankIdentification, com.tools20022.repository.codeset.PartyIssuerCode.SingaporeCentralDepositoryLtd,
						com.tools20022.repository.codeset.PartyIssuerCode.SingaporeInternationalMonetaryExchange, com.tools20022.repository.codeset.PartyIssuerCode.BratislavaStockExchange,
						com.tools20022.repository.codeset.PartyIssuerCode.SouthAfricanNationalClearing, com.tools20022.repository.codeset.PartyIssuerCode.StrateClearingSettlementLtd,
						com.tools20022.repository.codeset.PartyIssuerCode.BancoEspana, com.tools20022.repository.codeset.PartyIssuerCode.ServicioCompensacionLiquidacionValores,
						com.tools20022.repository.codeset.PartyIssuerCode.SpanishDomesticInterbanking, com.tools20022.repository.codeset.PartyIssuerCode.Vardepapperscentralen,
						com.tools20022.repository.codeset.PartyIssuerCode.SISSEGAIntersettle, com.tools20022.repository.codeset.PartyIssuerCode.SwissClearingCode,
						com.tools20022.repository.codeset.PartyIssuerCode.ThailandSecuritiesDepositoryCompany, com.tools20022.repository.codeset.PartyIssuerCode.TaiwanSecuritiesCentralDepository,
						com.tools20022.repository.codeset.PartyIssuerCode.Takasbank, com.tools20022.repository.codeset.PartyIssuerCode.UKDomesticSort, com.tools20022.repository.codeset.PartyIssuerCode.BankOfEnglandCMO,
						com.tools20022.repository.codeset.PartyIssuerCode.CrestCo, com.tools20022.repository.codeset.PartyIssuerCode.FinancialServicesAuthority, com.tools20022.repository.codeset.PartyIssuerCode.LondonClearingHouse,
						com.tools20022.repository.codeset.PartyIssuerCode.InternationalSecuritiesMarketAssociation, com.tools20022.repository.codeset.PartyIssuerCode.LondonStockExchange,
						com.tools20022.repository.codeset.PartyIssuerCode.AmericanStockExchange, com.tools20022.repository.codeset.PartyIssuerCode.DepositoryTrustCompany,
						com.tools20022.repository.codeset.PartyIssuerCode.EmergingMarketsClearingCorporation, com.tools20022.repository.codeset.PartyIssuerCode.FedwireRoutingNumber,
						com.tools20022.repository.codeset.PartyIssuerCode.GovernmentSecuritiesClearingCorporation, com.tools20022.repository.codeset.PartyIssuerCode.InternationalSecuritiesClearingCorporation,
						com.tools20022.repository.codeset.PartyIssuerCode.MortgageBackedSecuritiesClearingCorporation, com.tools20022.repository.codeset.PartyIssuerCode.NationalAssociationSecuritiesDealers,
						com.tools20022.repository.codeset.PartyIssuerCode.NASDAQ, com.tools20022.repository.codeset.PartyIssuerCode.NationalSecuritiesClearingCorporation,
						com.tools20022.repository.codeset.PartyIssuerCode.NewYorkClearingHouse, com.tools20022.repository.codeset.PartyIssuerCode.NewYorkStockExchange,
						com.tools20022.repository.codeset.PartyIssuerCode.OptionsClearingCorporation, com.tools20022.repository.codeset.PartyIssuerCode.ParticipantTrustCompany);
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
	}

	public static PartyIssuerCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PartyIssuerCode[] values() {
		PartyIssuerCode[] values = new PartyIssuerCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PartyIssuerCode> {
		@Override
		public PartyIssuerCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PartyIssuerCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}