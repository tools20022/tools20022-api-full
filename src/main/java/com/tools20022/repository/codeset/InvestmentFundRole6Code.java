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
import com.tools20022.repository.codeset.InvestmentFundRole6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of the party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#CashCorrespondent
 * InvestmentFundRole6Code.CashCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#Concentrator
 * InvestmentFundRole6Code.Concentrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#Custodian
 * InvestmentFundRole6Code.Custodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#DataProvider
 * InvestmentFundRole6Code.DataProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#Distributor
 * InvestmentFundRole6Code.Distributor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#FundAccountant
 * InvestmentFundRole6Code.FundAccountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#FinancialAdvisor
 * InvestmentFundRole6Code.FinancialAdvisor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#FinalAgent
 * InvestmentFundRole6Code.FinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#FundManagementCompany
 * InvestmentFundRole6Code.FundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#FundBroker
 * InvestmentFundRole6Code.FundBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#FirstAgent
 * InvestmentFundRole6Code.FirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#Intermediary
 * InvestmentFundRole6Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#InvestmentManager
 * InvestmentFundRole6Code.InvestmentManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#Investor
 * InvestmentFundRole6Code.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#PayingAgent
 * InvestmentFundRole6Code.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#Registrar
 * InvestmentFundRole6Code.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#TransferAgent
 * InvestmentFundRole6Code.TransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code#TransmittingAgent
 * InvestmentFundRole6Code.TransmittingAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PartyRoleCode PartyRoleCode}</li>
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
 * "InvestmentFundRole6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of the party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundRole6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCorrespondent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code CashCorrespondent = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCorrespondent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.CashCorrespondent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Concentrator"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code Concentrator = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Concentrator";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.Concentrator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custodian"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code Custodian = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custodian";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.Custodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataProvider"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code DataProvider = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.DataProvider.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distributor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code Distributor = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distributor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.Distributor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundAccountant"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code FundAccountant = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundAccountant";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.FundAccountant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvisor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code FinancialAdvisor = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvisor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.FinancialAdvisor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code FinalAgent = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.FinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code FundManagementCompany = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.FundManagementCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundBroker"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code FundBroker = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundBroker";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.FundBroker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code FirstAgent = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.FirstAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code Intermediary = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentManager"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code InvestmentManager = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentManager";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.InvestmentManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code Investor = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.Investor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code PayingAgent = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.PayingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code Registrar = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.Registrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code TransferAgent = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.TransferAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole6Code
	 * InvestmentFundRole6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmittingAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole6Code TransmittingAgent = new InvestmentFundRole6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransmittingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole6Code.mmObject();
			codeName = PartyRoleCode.TransmittingAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundRole6Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundRole6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundRole6Code";
				definition = "Specifies the role of the party.";
				trace_lazy = () -> PartyRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundRole6Code.CashCorrespondent, com.tools20022.repository.codeset.InvestmentFundRole6Code.Concentrator,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.Custodian, com.tools20022.repository.codeset.InvestmentFundRole6Code.DataProvider, com.tools20022.repository.codeset.InvestmentFundRole6Code.Distributor,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.FundAccountant, com.tools20022.repository.codeset.InvestmentFundRole6Code.FinancialAdvisor,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.FinalAgent, com.tools20022.repository.codeset.InvestmentFundRole6Code.FundManagementCompany,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.FundBroker, com.tools20022.repository.codeset.InvestmentFundRole6Code.FirstAgent, com.tools20022.repository.codeset.InvestmentFundRole6Code.Intermediary,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.InvestmentManager, com.tools20022.repository.codeset.InvestmentFundRole6Code.Investor, com.tools20022.repository.codeset.InvestmentFundRole6Code.PayingAgent,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.Registrar, com.tools20022.repository.codeset.InvestmentFundRole6Code.TransferAgent,
						com.tools20022.repository.codeset.InvestmentFundRole6Code.TransmittingAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashCorrespondent.getCodeName().get(), CashCorrespondent);
		codesByName.put(Concentrator.getCodeName().get(), Concentrator);
		codesByName.put(Custodian.getCodeName().get(), Custodian);
		codesByName.put(DataProvider.getCodeName().get(), DataProvider);
		codesByName.put(Distributor.getCodeName().get(), Distributor);
		codesByName.put(FundAccountant.getCodeName().get(), FundAccountant);
		codesByName.put(FinancialAdvisor.getCodeName().get(), FinancialAdvisor);
		codesByName.put(FinalAgent.getCodeName().get(), FinalAgent);
		codesByName.put(FundManagementCompany.getCodeName().get(), FundManagementCompany);
		codesByName.put(FundBroker.getCodeName().get(), FundBroker);
		codesByName.put(FirstAgent.getCodeName().get(), FirstAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(InvestmentManager.getCodeName().get(), InvestmentManager);
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(PayingAgent.getCodeName().get(), PayingAgent);
		codesByName.put(Registrar.getCodeName().get(), Registrar);
		codesByName.put(TransferAgent.getCodeName().get(), TransferAgent);
		codesByName.put(TransmittingAgent.getCodeName().get(), TransmittingAgent);
	}

	public static InvestmentFundRole6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundRole6Code[] values() {
		InvestmentFundRole6Code[] values = new InvestmentFundRole6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundRole6Code> {
		@Override
		public InvestmentFundRole6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundRole6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}