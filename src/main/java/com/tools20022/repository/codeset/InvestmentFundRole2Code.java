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
import com.tools20022.repository.codeset.InvestmentFundRole2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role played by an actor in an investment fund transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#FundManagementCompany
 * InvestmentFundRole2Code.FundManagementCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#Registrar
 * InvestmentFundRole2Code.Registrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#TransferAgent
 * InvestmentFundRole2Code.TransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#Intermediary
 * InvestmentFundRole2Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#Distributor
 * InvestmentFundRole2Code.Distributor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#Concentrator
 * InvestmentFundRole2Code.Concentrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#UnderlyingClient1
 * InvestmentFundRole2Code.UnderlyingClient1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#UnderlyingClient2
 * InvestmentFundRole2Code.UnderlyingClient2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code#TransmittingAgent
 * InvestmentFundRole2Code.TransmittingAgent}</li>
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
 * <li>"FMCO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundRole2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the role played by an actor in an investment fund transaction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundRole2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code FundManagementCompany = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.FundManagementCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Registrar"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code Registrar = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Registrar";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.Registrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code TransferAgent = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.TransferAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code Intermediary = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.Intermediary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distributor"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code Distributor = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distributor";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.Distributor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Concentrator"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code Concentrator = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Concentrator";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.Concentrator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingClient1"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code UnderlyingClient1 = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingClient1";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.UnderlyingClient1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingClient2"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code UnderlyingClient2 = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingClient2";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.UnderlyingClient2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundRole2Code
	 * InvestmentFundRole2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransmittingAgent"</li>
	 * </ul>
	 */
	public static final InvestmentFundRole2Code TransmittingAgent = new InvestmentFundRole2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransmittingAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundRole2Code.mmObject();
			codeName = PartyRoleCode.TransmittingAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundRole2Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundRole2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FMCO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundRole2Code";
				definition = "Specifies the role played by an actor in an investment fund transaction.";
				trace_lazy = () -> PartyRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundRole2Code.FundManagementCompany, com.tools20022.repository.codeset.InvestmentFundRole2Code.Registrar,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.TransferAgent, com.tools20022.repository.codeset.InvestmentFundRole2Code.Intermediary, com.tools20022.repository.codeset.InvestmentFundRole2Code.Distributor,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.Concentrator, com.tools20022.repository.codeset.InvestmentFundRole2Code.UnderlyingClient1,
						com.tools20022.repository.codeset.InvestmentFundRole2Code.UnderlyingClient2, com.tools20022.repository.codeset.InvestmentFundRole2Code.TransmittingAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FundManagementCompany.getCodeName().get(), FundManagementCompany);
		codesByName.put(Registrar.getCodeName().get(), Registrar);
		codesByName.put(TransferAgent.getCodeName().get(), TransferAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(Distributor.getCodeName().get(), Distributor);
		codesByName.put(Concentrator.getCodeName().get(), Concentrator);
		codesByName.put(UnderlyingClient1.getCodeName().get(), UnderlyingClient1);
		codesByName.put(UnderlyingClient2.getCodeName().get(), UnderlyingClient2);
		codesByName.put(TransmittingAgent.getCodeName().get(), TransmittingAgent);
	}

	public static InvestmentFundRole2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundRole2Code[] values() {
		InvestmentFundRole2Code[] values = new InvestmentFundRole2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundRole2Code> {
		@Override
		public InvestmentFundRole2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundRole2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}