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
import com.tools20022.repository.codeset.TradeStatus5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a trade in a central matching and settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Invalid
 * TradeStatus5Code.Invalid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Matched
 * TradeStatus5Code.Matched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Amended
 * TradeStatus5Code.Amended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code#SettlementMaturePending
 * TradeStatus5Code.SettlementMaturePending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code#NotAuthorised
 * TradeStatus5Code.NotAuthorised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Rejected
 * TradeStatus5Code.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Rescinded
 * TradeStatus5Code.Rescinded}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Settled
 * TradeStatus5Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code#SettlementMemberAuthorised
 * TradeStatus5Code.SettlementMemberAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code#SettlementMemberNotAuthorised
 * TradeStatus5Code.SettlementMemberNotAuthorised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Split
 * TradeStatus5Code.Split}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Suspended
 * TradeStatus5Code.Suspended}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus5Code#Unmatched
 * TradeStatus5Code.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code#SettlementMature
 * TradeStatus5Code.SettlementMature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
 * TradeStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeStatus5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a trade in a central matching and settlement system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INVA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code
 * TradeStatus6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeStatus5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Invalid
	 * TradeStatus6Code.Invalid}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Invalid = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Invalid);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Matched
	 * TradeStatus6Code.Matched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Matched = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Matched);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeStatus5Code Amended = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amended";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Amended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMaturePending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#SettlementMaturePending
	 * TradeStatus6Code.SettlementMaturePending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code SettlementMaturePending = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMaturePending";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.SettlementMaturePending);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.SettlementMaturePending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeStatus5Code NotAuthorised = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.NotAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Rejected
	 * TradeStatus6Code.Rejected}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Rejected = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Rejected);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Rescinded
	 * TradeStatus6Code.Rescinded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Rescinded = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Rescinded);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Rescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Settled
	 * TradeStatus6Code.Settled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Settled = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Settled);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMemberAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeStatus5Code SettlementMemberAuthorised = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.SettlementMemberAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMemberNotAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeStatus5Code SettlementMemberNotAuthorised = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberNotAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.SettlementMemberNotAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Split
	 * TradeStatus6Code.Split}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Split = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Split";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Split);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Split.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeStatus5Code Suspended = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#Unmatched
	 * TradeStatus6Code.Unmatched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code Unmatched = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.Unmatched);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus5Code
	 * TradeStatus5Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus6Code#SettlementMature
	 * TradeStatus6Code.SettlementMature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus5Code SettlementMature = new TradeStatus5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.SettlementMature);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus5Code.mmObject();
			codeName = TradeStatusCode.SettlementMature.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeStatus5Code> codesByName = new LinkedHashMap<>();

	protected TradeStatus5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INVA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeStatus5Code";
				definition = "Specifies the status of a trade in a central matching and settlement system.";
				nextVersions_lazy = () -> Arrays.asList(TradeStatus6Code.mmObject());
				trace_lazy = () -> TradeStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeStatus5Code.Invalid, com.tools20022.repository.codeset.TradeStatus5Code.Matched, com.tools20022.repository.codeset.TradeStatus5Code.Amended,
						com.tools20022.repository.codeset.TradeStatus5Code.SettlementMaturePending, com.tools20022.repository.codeset.TradeStatus5Code.NotAuthorised, com.tools20022.repository.codeset.TradeStatus5Code.Rejected,
						com.tools20022.repository.codeset.TradeStatus5Code.Rescinded, com.tools20022.repository.codeset.TradeStatus5Code.Settled, com.tools20022.repository.codeset.TradeStatus5Code.SettlementMemberAuthorised,
						com.tools20022.repository.codeset.TradeStatus5Code.SettlementMemberNotAuthorised, com.tools20022.repository.codeset.TradeStatus5Code.Split, com.tools20022.repository.codeset.TradeStatus5Code.Suspended,
						com.tools20022.repository.codeset.TradeStatus5Code.Unmatched, com.tools20022.repository.codeset.TradeStatus5Code.SettlementMature);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Amended.getCodeName().get(), Amended);
		codesByName.put(SettlementMaturePending.getCodeName().get(), SettlementMaturePending);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(SettlementMemberAuthorised.getCodeName().get(), SettlementMemberAuthorised);
		codesByName.put(SettlementMemberNotAuthorised.getCodeName().get(), SettlementMemberNotAuthorised);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(SettlementMature.getCodeName().get(), SettlementMature);
	}

	public static TradeStatus5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeStatus5Code[] values() {
		TradeStatus5Code[] values = new TradeStatus5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeStatus5Code> {
		@Override
		public TradeStatus5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeStatus5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}