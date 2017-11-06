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
 * Specifies the type of links to a company.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLinkCode#mmBroker
 * CompanyLinkCode.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLinkCode#mmAgent
 * CompanyLinkCode.mmAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode#mmBrokeragePartner
 * CompanyLinkCode.mmBrokeragePartner}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CompanyLinkCode#mmRelative
 * CompanyLinkCode.mmRelative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode#mmParentCompany
 * CompanyLinkCode.mmParentCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CompanyLinkCode#mmMemberBroker
 * CompanyLinkCode.mmMemberBroker}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class CompanyLinkCode {

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
	public static final MMCode mmBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Employee, operator or agent of the broker.";
			owner_lazy = () -> CompanyLinkCode.mmObject();
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
	public static final MMCode mmAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Autonomous agent accredited by the broker.";
			owner_lazy = () -> CompanyLinkCode.mmObject();
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
	public static final MMCode mmBrokeragePartner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeragePartner";
			definition = "Brokerage partner or shareholder, individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position.";
			owner_lazy = () -> CompanyLinkCode.mmObject();
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
	public static final MMCode mmRelative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Relative";
			definition = "Spouse or partner and child of an employee, operator or agent of the broker; agent of the broker; brokerage partners or shareholders; individual or entity who holds a direct or an indirect control function and the holder of a management or an administration position.";
			owner_lazy = () -> CompanyLinkCode.mmObject();
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
	public static final MMCode mmParentCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParentCompany";
			definition = "Parent company of the broker.";
			owner_lazy = () -> CompanyLinkCode.mmObject();
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
	public static final MMCode mmMemberBroker = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberBroker";
			definition = "Member broker of a financial conglomerate (person is a board member, director, officer and employee of a member company of the conglomerate).";
			owner_lazy = () -> CompanyLinkCode.mmObject();
			codeName = "MEMB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CompanyLinkCode";
				definition = "Specifies the type of links to a company.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CompanyLinkCode.mmBroker, com.tools20022.repository.codeset.CompanyLinkCode.mmAgent, com.tools20022.repository.codeset.CompanyLinkCode.mmBrokeragePartner,
						com.tools20022.repository.codeset.CompanyLinkCode.mmRelative, com.tools20022.repository.codeset.CompanyLinkCode.mmParentCompany, com.tools20022.repository.codeset.CompanyLinkCode.mmMemberBroker);
				derivation_lazy = () -> Arrays.asList(CompanyLink1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}