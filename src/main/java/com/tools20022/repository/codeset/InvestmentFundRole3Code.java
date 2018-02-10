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
import com.tools20022.repository.codeset.InvestmentFundRole3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role played by the actors in the investment funds industry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#CashCorrespondent
 * InvestmentFundRole3Code.CashCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#Custodian
 * InvestmentFundRole3Code.Custodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#DataProvider
 * InvestmentFundRole3Code.DataProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#FinalAgent
 * InvestmentFundRole3Code.FinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#FundManagementCompany
 * InvestmentFundRole3Code.FundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#FundAccountant
 * InvestmentFundRole3Code.FundAccountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#Investor
 * InvestmentFundRole3Code.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#InvestmentManager
 * InvestmentFundRole3Code.InvestmentManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#PayingAgent
 * InvestmentFundRole3Code.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#Registrar
 * InvestmentFundRole3Code.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#TransferAgent
 * InvestmentFundRole3Code.TransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#Intermediary
 * InvestmentFundRole3Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#FundBroker
 * InvestmentFundRole3Code.FundBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#FirstAgent
 * InvestmentFundRole3Code.FirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#FinancialAdvisor
 * InvestmentFundRole3Code.FinancialAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#Distributor
 * InvestmentFundRole3Code.Distributor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code#Concentrator
 * InvestmentFundRole3Code.Concentrator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode PartyRoleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CACO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundRole3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the role played by the actors in the investment funds industry."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundRole3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCorrespondent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code CashCorrespondent = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCorrespondent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.CashCorrespondent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custodian"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code Custodian = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custodian";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.Custodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataProvider"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code DataProvider = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.DataProvider.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code FinalAgent = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.FinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code FundManagementCompany = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.FundManagementCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundAccountant"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code FundAccountant = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundAccountant";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.FundAccountant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code Investor = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.Investor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentManager"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code InvestmentManager = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentManager";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.InvestmentManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code PayingAgent = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.PayingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code Registrar = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.Registrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code TransferAgent = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.TransferAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code Intermediary = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBroker"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code FundBroker = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundBroker";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.FundBroker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code FirstAgent = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.FirstAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvisor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code FinancialAdvisor = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvisor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.FinancialAdvisor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distributor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code Distributor = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distributor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.Distributor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole3Code
	 * InvestmentFundRole3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Concentrator"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole3Code Concentrator = new InvestmentFundRole3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Concentrator";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole3Code.mmObject();
			codeName = PartyRoleCode.Concentrator.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundRole3Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundRole3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CACO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundRole3Code";
				definition = "Specifies the role played by the actors in the investment funds industry.";
				trace_lazy = () -> PartyRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundRole3Code.CashCorrespondent, com.tools20022.repository.codeset.InvestmentFundRole3Code.Custodian,
						com.tools20022.repository.codeset.InvestmentFundRole3Code.DataProvider, com.tools20022.repository.codeset.InvestmentFundRole3Code.FinalAgent,
						com.tools20022.repository.codeset.InvestmentFundRole3Code.FundManagementCompany, com.tools20022.repository.codeset.InvestmentFundRole3Code.FundAccountant,
						com.tools20022.repository.codeset.InvestmentFundRole3Code.Investor, com.tools20022.repository.codeset.InvestmentFundRole3Code.InvestmentManager, com.tools20022.repository.codeset.InvestmentFundRole3Code.PayingAgent,
						com.tools20022.repository.codeset.InvestmentFundRole3Code.Registrar, com.tools20022.repository.codeset.InvestmentFundRole3Code.TransferAgent, com.tools20022.repository.codeset.InvestmentFundRole3Code.Intermediary,
						com.tools20022.repository.codeset.InvestmentFundRole3Code.FundBroker, com.tools20022.repository.codeset.InvestmentFundRole3Code.FirstAgent, com.tools20022.repository.codeset.InvestmentFundRole3Code.FinancialAdvisor,
						com.tools20022.repository.codeset.InvestmentFundRole3Code.Distributor, com.tools20022.repository.codeset.InvestmentFundRole3Code.Concentrator);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashCorrespondent.getCodeName().get(), CashCorrespondent);
		codesByName.put(Custodian.getCodeName().get(), Custodian);
		codesByName.put(DataProvider.getCodeName().get(), DataProvider);
		codesByName.put(FinalAgent.getCodeName().get(), FinalAgent);
		codesByName.put(FundManagementCompany.getCodeName().get(), FundManagementCompany);
		codesByName.put(FundAccountant.getCodeName().get(), FundAccountant);
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(InvestmentManager.getCodeName().get(), InvestmentManager);
		codesByName.put(PayingAgent.getCodeName().get(), PayingAgent);
		codesByName.put(Registrar.getCodeName().get(), Registrar);
		codesByName.put(TransferAgent.getCodeName().get(), TransferAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(FundBroker.getCodeName().get(), FundBroker);
		codesByName.put(FirstAgent.getCodeName().get(), FirstAgent);
		codesByName.put(FinancialAdvisor.getCodeName().get(), FinancialAdvisor);
		codesByName.put(Distributor.getCodeName().get(), Distributor);
		codesByName.put(Concentrator.getCodeName().get(), Concentrator);
	}

	public static InvestmentFundRole3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundRole3Code[] values() {
		InvestmentFundRole3Code[] values = new InvestmentFundRole3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundRole3Code> {
		@Override
		public InvestmentFundRole3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundRole3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}