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
import com.tools20022.repository.codeset.CompanyLinkCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLinkCode#Broker
 * CompanyLinkCode.Broker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLinkCode#Agent
 * CompanyLinkCode.Agent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode#BrokeragePartner
 * CompanyLinkCode.BrokeragePartner}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLinkCode#Relative
 * CompanyLinkCode.Relative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode#ParentCompany
 * CompanyLinkCode.ParentCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode#MemberBroker
 * CompanyLinkCode.MemberBroker}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLink1Code
 * CompanyLink1Code}</li>
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
 * "CompanyLinkCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of links to a company."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CompanyLinkCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Employee, operator or agent of the broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
	 * CompanyLinkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BROK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Employee, operator or agent of the broker."</li>
	 * </ul>
	 */
	public static final CompanyLinkCode Broker = new CompanyLinkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Employee, operator or agent of the broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLinkCode.mmObject();
			codeName = "BROK";
		}
	};
	/**
	 * Autonomous agent accredited by the broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
	 * CompanyLinkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Autonomous agent accredited by the broker."</li>
	 * </ul>
	 */
	public static final CompanyLinkCode Agent = new CompanyLinkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Autonomous agent accredited by the broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLinkCode.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * Brokerage partner or shareholder, individual or entity who holds a direct
	 * or an indirect control function and the holder of a management or an
	 * administration position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
	 * CompanyLinkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokeragePartner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Brokerage partner or shareholder, individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position."
	 * </li>
	 * </ul>
	 */
	public static final CompanyLinkCode BrokeragePartner = new CompanyLinkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeragePartner";
			definition = "Brokerage partner or shareholder, individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLinkCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Spouse or partner and child of an employee, operator or agent of the
	 * broker; agent of the broker; brokerage partners or shareholders;
	 * individual or entity who holds a direct or an indirect control function
	 * and the holder of a management or an administration position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
	 * CompanyLinkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RELA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Relative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Spouse or partner and child of an employee, operator or agent of the broker; agent of the broker; brokerage partners or shareholders; individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position."
	 * </li>
	 * </ul>
	 */
	public static final CompanyLinkCode Relative = new CompanyLinkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Relative";
			definition = "Spouse or partner and child of an employee, operator or agent of the broker; agent of the broker; brokerage partners or shareholders; individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLinkCode.mmObject();
			codeName = "RELA";
		}
	};
	/**
	 * Parent company of the broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
	 * CompanyLinkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCOM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParentCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parent company of the broker."</li>
	 * </ul>
	 */
	public static final CompanyLinkCode ParentCompany = new CompanyLinkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentCompany";
			definition = "Parent company of the broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLinkCode.mmObject();
			codeName = "PCOM";
		}
	};
	/**
	 * Member broker of a financial conglomerate (person is a board member,
	 * director, officer and employee of a member company of the conglomerate).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode
	 * CompanyLinkCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEMB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member broker of a financial conglomerate (person is a board member, director, officer and employee of a member company of the conglomerate)."
	 * </li>
	 * </ul>
	 */
	public static final CompanyLinkCode MemberBroker = new CompanyLinkCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberBroker";
			definition = "Member broker of a financial conglomerate (person is a board member, director, officer and employee of a member company of the conglomerate).";
			owner_lazy = () -> com.tools20022.repository.codeset.CompanyLinkCode.mmObject();
			codeName = "MEMB";
		}
	};
	final static private LinkedHashMap<String, CompanyLinkCode> codesByName = new LinkedHashMap<>();

	protected CompanyLinkCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CompanyLinkCode";
				definition = "Specifies the type of links to a company.";
				derivation_lazy = () -> Arrays.asList(CompanyLink1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CompanyLinkCode.Broker, com.tools20022.repository.codeset.CompanyLinkCode.Agent, com.tools20022.repository.codeset.CompanyLinkCode.BrokeragePartner,
						com.tools20022.repository.codeset.CompanyLinkCode.Relative, com.tools20022.repository.codeset.CompanyLinkCode.ParentCompany, com.tools20022.repository.codeset.CompanyLinkCode.MemberBroker);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Broker.getCodeName().get(), Broker);
		codesByName.put(Agent.getCodeName().get(), Agent);
		codesByName.put(BrokeragePartner.getCodeName().get(), BrokeragePartner);
		codesByName.put(Relative.getCodeName().get(), Relative);
		codesByName.put(ParentCompany.getCodeName().get(), ParentCompany);
		codesByName.put(MemberBroker.getCodeName().get(), MemberBroker);
	}

	public static CompanyLinkCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CompanyLinkCode[] values() {
		CompanyLinkCode[] values = new CompanyLinkCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CompanyLinkCode> {
		@Override
		public CompanyLinkCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CompanyLinkCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}