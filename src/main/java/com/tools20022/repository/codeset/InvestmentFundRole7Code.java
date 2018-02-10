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
import com.tools20022.repository.codeset.InvestmentFundRole7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#Concentrator
 * InvestmentFundRole7Code.Concentrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#Distributor
 * InvestmentFundRole7Code.Distributor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#FundManagementCompany
 * InvestmentFundRole7Code.FundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#Intermediary
 * InvestmentFundRole7Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#PayingAgent
 * InvestmentFundRole7Code.PayingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#TransferAgent
 * InvestmentFundRole7Code.TransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#Custodian
 * InvestmentFundRole7Code.Custodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#CashCorrespondent
 * InvestmentFundRole7Code.CashCorrespondent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#FundAccountant
 * InvestmentFundRole7Code.FundAccountant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#InvestmentManager
 * InvestmentFundRole7Code.InvestmentManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code#Investor
 * InvestmentFundRole7Code.Investor}</li>
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
 * "InvestmentFundRole7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of the party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundRole7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Concentrator"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code Concentrator = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Concentrator";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.Concentrator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distributor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code Distributor = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distributor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.Distributor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code FundManagementCompany = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.FundManagementCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code Intermediary = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code PayingAgent = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.PayingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code TransferAgent = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.TransferAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custodian"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code Custodian = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custodian";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.Custodian.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCorrespondent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code CashCorrespondent = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCorrespondent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.CashCorrespondent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundAccountant"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code FundAccountant = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundAccountant";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.FundAccountant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentManager"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code InvestmentManager = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentManager";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.InvestmentManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole7Code
	 * InvestmentFundRole7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole7Code Investor = new InvestmentFundRole7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole7Code.mmObject();
			codeName = PartyRoleCode.Investor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundRole7Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundRole7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundRole7Code";
				definition = "Specifies the role of the party.";
				trace_lazy = () -> PartyRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundRole7Code.Concentrator, com.tools20022.repository.codeset.InvestmentFundRole7Code.Distributor,
						com.tools20022.repository.codeset.InvestmentFundRole7Code.FundManagementCompany, com.tools20022.repository.codeset.InvestmentFundRole7Code.Intermediary,
						com.tools20022.repository.codeset.InvestmentFundRole7Code.PayingAgent, com.tools20022.repository.codeset.InvestmentFundRole7Code.TransferAgent, com.tools20022.repository.codeset.InvestmentFundRole7Code.Custodian,
						com.tools20022.repository.codeset.InvestmentFundRole7Code.CashCorrespondent, com.tools20022.repository.codeset.InvestmentFundRole7Code.FundAccountant,
						com.tools20022.repository.codeset.InvestmentFundRole7Code.InvestmentManager, com.tools20022.repository.codeset.InvestmentFundRole7Code.Investor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Concentrator.getCodeName().get(), Concentrator);
		codesByName.put(Distributor.getCodeName().get(), Distributor);
		codesByName.put(FundManagementCompany.getCodeName().get(), FundManagementCompany);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(PayingAgent.getCodeName().get(), PayingAgent);
		codesByName.put(TransferAgent.getCodeName().get(), TransferAgent);
		codesByName.put(Custodian.getCodeName().get(), Custodian);
		codesByName.put(CashCorrespondent.getCodeName().get(), CashCorrespondent);
		codesByName.put(FundAccountant.getCodeName().get(), FundAccountant);
		codesByName.put(InvestmentManager.getCodeName().get(), InvestmentManager);
		codesByName.put(Investor.getCodeName().get(), Investor);
	}

	public static InvestmentFundRole7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundRole7Code[] values() {
		InvestmentFundRole7Code[] values = new InvestmentFundRole7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundRole7Code> {
		@Override
		public InvestmentFundRole7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundRole7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}