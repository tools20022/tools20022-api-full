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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
public class IssuerCode {

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
	public static final MMCode ClearstreamBankLuxemburg = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearstreamBankLuxemburg";
			definition = "Based in Luxembourg, the holding, clearing and settlement agency for certain international securities, especially Eurobonds.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CajaDeValores = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CajaDeValores";
			definition = "Caja de Valores S.A.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode AustraclearLtd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustraclearLtd";
			definition = "Austraclear Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode AustralianBankStateBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBankStateBranch";
			definition = "Australian Bank State Branch Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ClearingHouseElectronicSettlementSystems = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseElectronicSettlementSystems";
			definition = "Clearing House Electronic Settlements Systems.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode AustrianBankLeitzahl = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustrianBankLeitzahl";
			definition = "Austrian Bankleitzahl.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode OesterreichischeKontrollbank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OesterreichischeKontrollbank";
			definition = "OKB - Oesterreichische Kontrollbank AG.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CaisseInterprofessionelleDepotsVirementsTitres = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CaisseInterprofessionelleDepotsVirementsTitres";
			definition = "CIK - Caisse Interprofessionelle de Depots et de Virements de Titres S.A.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode Euroclear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Euroclear";
			definition = "Euroclear.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode BanqueNationaleDeBelgique = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BanqueNationaleDeBelgique";
			definition = "Banque Nationale de Belgique.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CamaraLiquidacaoCustodia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CamaraLiquidacaoCustodia";
			definition = "CLC - Camara de Liquidacao e Custodia S.A. (Brazil).";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CanadianDepositorySecuritiesLtd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianDepositorySecuritiesLtd";
			definition = "CDS - Canadian Depository for Securities Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CanadianPaymentsAssociation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanadianPaymentsAssociation";
			definition = "Canadian Payments Association Payment Routing Number.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CentralSecuritiesDepositoryDepositoCentralValores = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralSecuritiesDepositoryDepositoCentralValores";
			definition = "Chile Central Securities Depository Deposito Central de Valores.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ShanghaiSecuritiesCentralClearingRegistrationCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShanghaiSecuritiesCentralClearingRegistrationCompany";
			definition = "Shanghai Securities Central Clearing & Registration Company.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ShenzhenSecuritiesClearingCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShenzhenSecuritiesClearingCompany";
			definition = "Shenzhen Securities Clearing Company.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ColombiaCentralDepositorySystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ColombiaCentralDepositorySystem";
			definition = "Colombia Central Depository System.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DenmarkVaerdipapircentralen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenmarkVaerdipapircentralen";
			definition = "Denmark Vaerdipapircentralen.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode FinnishCentralSecuritiesDepositoryLtd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinnishCentralSecuritiesDepositoryLtd";
			definition = "Finnish Central Securities Depository Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode FranceRIB = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FranceRIB";
			definition = "French R.I.B.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SICOVAM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SICOVAM";
			definition = "Societe Interprofessional Pour La Compensation des Valeurs Mobiliers in France.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode PragueStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PragueStockExchange";
			definition = "The Prague Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode BundesausichtsamtWertpapierhandel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BundesausichtsamtWertpapierhandel";
			definition = "Bundesausichtsamt fur den Wertpapierhandel.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DeutscheBoerseAGDeutscheTerminborse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGDeutscheTerminborse";
			definition = "Deutsche Boerse AG: Deutsche Terminborse.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DeutscheBoerseAGFrankfurterWertpapierborse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGFrankfurterWertpapierborse";
			definition = "Deutsche Boerse AG: Frankfurter Wertpapierborse.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DeutscheBoerseAGXETRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBoerseAGXETRA";
			definition = "Deutsche Boerse AG: XETRA (exchange electronic trading).";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DeutscheBorseClearingAG = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBorseClearingAG";
			definition = "Deutsche Borse Clearing AG.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DeutscheBundesbank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeutscheBundesbank";
			definition = "Deutsche Bundesbank.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode GermanBankleitzahl = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanBankleitzahl";
			definition = "German Bankleitzahl.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ZentralerKreditausschuss = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ZentralerKreditausschuss";
			definition = "Zentraler Kreditausschuss.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode HongKongCentralClearingSecuritiesSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongCentralClearingSecuritiesSettlementSystem";
			definition = "Hong KongCentral Clearing and Securities Settlement System.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode HongKongNationalClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HongKongNationalClearing";
			definition = "Hong Kong National Clearing System.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode IndianNationalSecuritiesDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndianNationalSecuritiesDepository";
			definition = "India National Securities Depositary.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode IndonesianSecuritiesCentralDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndonesianSecuritiesCentralDepository";
			definition = "Indonesian Securities Central Depository.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode IrishNationalClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IrishNationalClearing";
			definition = "Irish National Clearing Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode TelAvivStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TelAvivStockExchange";
			definition = "Israel Tel Aviv Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ItalianDomesticIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItalianDomesticIdentification";
			definition = "Italian Domestic Identification Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode MonteTitoli = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonteTitoli";
			definition = "Italy - Monte Titoli.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode JapanSecuritiesClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JapanSecuritiesClearingCorporation";
			definition = "Japan Securities Clearing Corporation.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode JapanSecuritiesDepositoryCenter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JapanSecuritiesDepositoryCenter";
			definition = "Japan Securities Depository Center.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode KoreanSecuritiesDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KoreanSecuritiesDepository";
			definition = "Korea Securities Depository.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode MalaysianCentralDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MalaysianCentralDepository";
			definition = "Malaysian Central Depositary.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode IndevalSA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndevalSA";
			definition = "Mexico S.D. Indeval, S.A. de C.V.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode AmsterdamseEffectenbeurs = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmsterdamseEffectenbeurs";
			definition = "Amsterdamse Effectenbeurs.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NECIGEF = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NECIGEF";
			definition = "Nederlands Centraal Instituut voor Giraal Effectenverkeer.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NewZealandNationalClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandNationalClearing";
			definition = "New Zealand National Clearing Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NewZealandStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewZealandStockExchange";
			definition = "New Zealand Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode Verdipapirsentralen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Verdipapirsentralen";
			definition = "Norway Verdipapirsentralen.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode PhilippineCentralDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhilippineCentralDepository";
			definition = "Philippine Central Depositary.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode PolandNationalDepositorySecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PolandNationalDepositorySecurities";
			definition = "Poland National Depository for Securities.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CentralValoresMobiliaros = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralValoresMobiliaros";
			definition = "Portugal Central de Valores de Mobiliaros.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode PortugueseNationalClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortugueseNationalClearing";
			definition = "Portuguese National Clearing Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode INTERBOLSA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "INTERBOLSA";
			definition = "Associacao para a Prestacao de Servicios as Bolsas de Valores.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode RussianCentralBankIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RussianCentralBankIdentification";
			definition = "Russian Central Bank Identification Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SingaporeCentralDepositoryLtd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingaporeCentralDepositoryLtd";
			definition = "Central Depository Pte Ltd.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SingaporeInternationalMonetaryExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingaporeInternationalMonetaryExchange";
			definition = "Singapore International Monetary Exchange Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode BratislavaStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BratislavaStockExchange";
			definition = "The Bratislava Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SouthAfricanNationalClearing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SouthAfricanNationalClearing";
			definition = "South African National Clearing Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode StrateClearingSettlementLtd = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrateClearingSettlementLtd";
			definition = "Strate Clearing and Settlement (Proprietary) Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode BancoEspana = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BancoEspana";
			definition = "Banco de Espana.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ServicioCompensacionLiquidacionValores = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServicioCompensacionLiquidacionValores";
			definition = "Servicio de Compensacion y Liquidacion de Valores.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SpanishDomesticInterbanking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpanishDomesticInterbanking";
			definition = "Spanish Domestic Interbanking Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode Vardepapperscentralen = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vardepapperscentralen";
			definition = "Sweden Vardepapperscentralen.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SISSEGAIntersettle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SISSEGAIntersettle";
			definition = "SIS - SEGA/Intersettle.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode SwissClearingCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwissClearingCode";
			definition = "Swiss Clearing System.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ThailandSecuritiesDepositoryCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThailandSecuritiesDepositoryCompany";
			definition = "Thailand Securities Depository Company Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode TaiwanSecuritiesCentralDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaiwanSecuritiesCentralDepository";
			definition = "Taiwan Securities Central Depository Co Limited.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode Takasbank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Takasbank";
			definition = "Turkey Takasbank.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode UKDomesticSort = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UKDomesticSort";
			definition = "UK Domestic Sort Code.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode BankOfEnglandCMO = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOfEnglandCMO";
			definition = "Bank of England (Central Moneymarkets Office).";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode CrestCo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrestCo";
			definition = "CRESTCo Ltd. Company operating two real-time securities settlement services: CREST (for UK, Irish and international securities and government bonds) and CMO (UK money market instrument settlement).";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode FinancialServicesAuthority = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialServicesAuthority";
			definition = "UK Financial Services Authority.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode LondonClearingHouse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LondonClearingHouse";
			definition = "The London Clearing House.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode InternationalSecuritiesMarketAssociation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalSecuritiesMarketAssociation";
			definition = "UK - International Securities Market Association.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode LondonStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LondonStockExchange";
			definition = "London Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode AmericanStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmericanStockExchange";
			definition = "American Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode DepositoryTrustCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryTrustCompany";
			definition = "Depository Trust Company.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode EmergingMarketsClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmergingMarketsClearingCorporation";
			definition = "USA Emerging Markets Clearing Corporation.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode FedwireRoutingNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FedwireRoutingNumber";
			definition = "Fedwire Routing Number.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode GovernmentSecuritiesClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentSecuritiesClearingCorporation";
			definition = "Provider of trade netting and settlement for the US Government securities marketplace.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode InternationalSecuritiesClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalSecuritiesClearingCorporation";
			definition = "International Securities Clearing Corporation.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode MortgageBackedSecuritiesClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBackedSecuritiesClearingCorporation";
			definition = "Mortgage Backed Securities Clearing Corporation.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NationalAssociationSecuritiesDealers = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalAssociationSecuritiesDealers";
			definition = "National Association Securities Dealers.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NASDAQ = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NASDAQ";
			definition = "National Association of Securities Dealers Automated Quotation Service \"NASDAQ\" / National Market System.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NationalSecuritiesClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalSecuritiesClearingCorporation";
			definition = "National Securities Clearing Corporation.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NewYorkClearingHouse = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkClearingHouse";
			definition = "New York Clearing House.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode NewYorkStockExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewYorkStockExchange";
			definition = "New York Stock Exchange.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode OptionsClearingCorporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionsClearingCorporation";
			definition = "Options Clearing Corporation.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode ParticipantTrustCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantTrustCompany";
			definition = "Participant Trust Company.";
			owner_lazy = () -> IssuerCode.mmObject();
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
	public static final MMCode XClear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "XClear";
			definition = "X-Clear, clearing and risk management services for the Swiss banking industry.";
			owner_lazy = () -> IssuerCode.mmObject();
			codeName = "XCLR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CEDE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IssuerCode";
				definition = "Identifies the institution issuing a proprietary code.";
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
				derivation_lazy = () -> Arrays.asList(PartyIssuerCode.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}