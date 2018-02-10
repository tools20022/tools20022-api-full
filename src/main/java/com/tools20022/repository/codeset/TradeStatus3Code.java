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
import com.tools20022.repository.codeset.TradeStatus3Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Invalid
 * TradeStatus3Code.Invalid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Unmatched
 * TradeStatus3Code.Unmatched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Rescinded
 * TradeStatus3Code.Rescinded}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Settled
 * TradeStatus3Code.Settled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Matched
 * TradeStatus3Code.Matched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Rejected
 * TradeStatus3Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code#SettlementMemberAuthorised
 * TradeStatus3Code.SettlementMemberAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code#SettlementMemberNotAuthorised
 * TradeStatus3Code.SettlementMemberNotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code#SettlementMature
 * TradeStatus3Code.SettlementMature}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Split
 * TradeStatus3Code.Split}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus3Code#Suspended
 * TradeStatus3Code.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code#NotAuthorised
 * TradeStatus3Code.NotAuthorised}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeStatus3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a trade in a central matching and settlement system."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus7Code
 * TradeStatus7Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeStatus3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus7Code#Invalid
	 * TradeStatus7Code.Invalid}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus3Code Invalid = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus7Code.Invalid);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus7Code#Unmatched
	 * TradeStatus7Code.Unmatched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus3Code Unmatched = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus7Code.Unmatched);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code Rescinded = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Rescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code Settled = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus7Code#Matched
	 * TradeStatus7Code.Matched}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus3Code Matched = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus7Code.Matched);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code Rejected = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMemberAuthorised"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code SettlementMemberAuthorised = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.SettlementMemberAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMemberNotAuthorised"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code SettlementMemberNotAuthorised = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMemberNotAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.SettlementMemberNotAuthorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus7Code#SettlementMature
	 * TradeStatus7Code.SettlementMature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus3Code SettlementMature = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus7Code.SettlementMature);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.SettlementMature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Split"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code Split = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Split";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Split.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus7Code#Suspended
	 * TradeStatus7Code.Suspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TradeStatus3Code Suspended = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			nextVersions_lazy = () -> Arrays.asList(TradeStatus7Code.Suspended);
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus3Code
	 * TradeStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * </ul>
	 */
	public static final TradeStatus3Code NotAuthorised = new TradeStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus3Code.mmObject();
			codeName = TradeStatusCode.NotAuthorised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeStatus3Code> codesByName = new LinkedHashMap<>();

	protected TradeStatus3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INVA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeStatus3Code";
				definition = "Specifies the status of a trade in a central matching and settlement system.";
				nextVersions_lazy = () -> Arrays.asList(TradeStatus7Code.mmObject());
				trace_lazy = () -> TradeStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeStatus3Code.Invalid, com.tools20022.repository.codeset.TradeStatus3Code.Unmatched, com.tools20022.repository.codeset.TradeStatus3Code.Rescinded,
						com.tools20022.repository.codeset.TradeStatus3Code.Settled, com.tools20022.repository.codeset.TradeStatus3Code.Matched, com.tools20022.repository.codeset.TradeStatus3Code.Rejected,
						com.tools20022.repository.codeset.TradeStatus3Code.SettlementMemberAuthorised, com.tools20022.repository.codeset.TradeStatus3Code.SettlementMemberNotAuthorised,
						com.tools20022.repository.codeset.TradeStatus3Code.SettlementMature, com.tools20022.repository.codeset.TradeStatus3Code.Split, com.tools20022.repository.codeset.TradeStatus3Code.Suspended,
						com.tools20022.repository.codeset.TradeStatus3Code.NotAuthorised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(SettlementMemberAuthorised.getCodeName().get(), SettlementMemberAuthorised);
		codesByName.put(SettlementMemberNotAuthorised.getCodeName().get(), SettlementMemberNotAuthorised);
		codesByName.put(SettlementMature.getCodeName().get(), SettlementMature);
		codesByName.put(Split.getCodeName().get(), Split);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
	}

	public static TradeStatus3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeStatus3Code[] values() {
		TradeStatus3Code[] values = new TradeStatus3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeStatus3Code> {
		@Override
		public TradeStatus3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeStatus3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}