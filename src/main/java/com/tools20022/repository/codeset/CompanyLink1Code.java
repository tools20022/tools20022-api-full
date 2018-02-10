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
import com.tools20022.repository.codeset.CompanyLink1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of links to a company.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLink1Code#Agent
 * CompanyLink1Code.Agent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLink1Code#Broker
 * CompanyLink1Code.Broker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code#BrokeragePartner
 * CompanyLink1Code.BrokeragePartner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code#MemberBroker
 * CompanyLink1Code.MemberBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code#ParentCompany
 * CompanyLink1Code.ParentCompany}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLink1Code#Relative
 * CompanyLink1Code.Relative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
 * CompanyLinkCode}</li>
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
 * "CompanyLink1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of links to a company."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CompanyLink1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code
	 * CompanyLink1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final CompanyLink1Code Agent = new CompanyLink1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLink1Code.mmObject();
			codeName = CompanyLinkCode.Agent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code
	 * CompanyLink1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * </ul>
	 */
	public static final CompanyLink1Code Broker = new CompanyLink1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLink1Code.mmObject();
			codeName = CompanyLinkCode.Broker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code
	 * CompanyLink1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokeragePartner"</li>
	 * </ul>
	 */
	public static final CompanyLink1Code BrokeragePartner = new CompanyLink1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeragePartner";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLink1Code.mmObject();
			codeName = CompanyLinkCode.BrokeragePartner.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code
	 * CompanyLink1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberBroker"</li>
	 * </ul>
	 */
	public static final CompanyLink1Code MemberBroker = new CompanyLink1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberBroker";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLink1Code.mmObject();
			codeName = CompanyLinkCode.MemberBroker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code
	 * CompanyLink1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentCompany"</li>
	 * </ul>
	 */
	public static final CompanyLink1Code ParentCompany = new CompanyLink1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLink1Code.mmObject();
			codeName = CompanyLinkCode.ParentCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLink1Code
	 * CompanyLink1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Relative"</li>
	 * </ul>
	 */
	public static final CompanyLink1Code Relative = new CompanyLink1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Relative";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLink1Code.mmObject();
			codeName = CompanyLinkCode.Relative.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CompanyLink1Code> codesByName = new LinkedHashMap<>();

	protected CompanyLink1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CompanyLink1Code";
				definition = "Specifies the type of links to a company.";
				trace_lazy = () -> CompanyLinkCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CompanyLink1Code.Agent, com.tools20022.repository.codeset.CompanyLink1Code.Broker, com.tools20022.repository.codeset.CompanyLink1Code.BrokeragePartner,
						com.tools20022.repository.codeset.CompanyLink1Code.MemberBroker, com.tools20022.repository.codeset.CompanyLink1Code.ParentCompany, com.tools20022.repository.codeset.CompanyLink1Code.Relative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(Broker.getCodeName().get(), Broker);
		codesByName.put(BrokeragePartner.getCodeName().get(), BrokeragePartner);
		codesByName.put(MemberBroker.getCodeName().get(), MemberBroker);
		codesByName.put(ParentCompany.getCodeName().get(), ParentCompany);
		codesByName.put(Relative.getCodeName().get(), Relative);
	}

	public static CompanyLink1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CompanyLink1Code[] values() {
		CompanyLink1Code[] values = new CompanyLink1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CompanyLink1Code> {
		@Override
		public CompanyLink1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CompanyLink1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}