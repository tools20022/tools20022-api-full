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
import com.tools20022.repository.codeset.TradeStatus2Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Validated
 * TradeStatus2Code.Validated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code#RegulatoryChecked
 * TradeStatus2Code.RegulatoryChecked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Invalid
 * TradeStatus2Code.Invalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code#SettlementRejected
 * TradeStatus2Code.SettlementRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code#RegulatorySuspended
 * TradeStatus2Code.RegulatorySuspended}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Unmatched
 * TradeStatus2Code.Unmatched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Matched
 * TradeStatus2Code.Matched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Rescinded
 * TradeStatus2Code.Rescinded}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Settled
 * TradeStatus2Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code#PartiallySettled
 * TradeStatus2Code.PartiallySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code#MatchedValued
 * TradeStatus2Code.MatchedValued}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeStatus2Code#Rejected
 * TradeStatus2Code.Rejected}</li>
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
 * <li>"VALI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a trade in a central matching and settlement system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validated"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Validated = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Validated";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Validated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryChecked"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code RegulatoryChecked = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryChecked";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.RegulatoryChecked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Invalid = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementRejected"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code SettlementRejected = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.SettlementRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatorySuspended"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code RegulatorySuspended = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatorySuspended";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.RegulatorySuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Unmatched = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Matched = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Rescinded = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Rescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Settled = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallySettled"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code PartiallySettled = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallySettled";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.PartiallySettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedValued"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code MatchedValued = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedValued";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.MatchedValued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatus2Code
	 * TradeStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final TradeStatus2Code Rejected = new TradeStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeStatus2Code.mmObject();
			codeName = TradeStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeStatus2Code> codesByName = new LinkedHashMap<>();

	protected TradeStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("VALI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeStatus2Code";
				definition = "Specifies the status of a trade in a central matching and settlement system.";
				trace_lazy = () -> TradeStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeStatus2Code.Validated, com.tools20022.repository.codeset.TradeStatus2Code.RegulatoryChecked, com.tools20022.repository.codeset.TradeStatus2Code.Invalid,
						com.tools20022.repository.codeset.TradeStatus2Code.SettlementRejected, com.tools20022.repository.codeset.TradeStatus2Code.RegulatorySuspended, com.tools20022.repository.codeset.TradeStatus2Code.Unmatched,
						com.tools20022.repository.codeset.TradeStatus2Code.Matched, com.tools20022.repository.codeset.TradeStatus2Code.Rescinded, com.tools20022.repository.codeset.TradeStatus2Code.Settled,
						com.tools20022.repository.codeset.TradeStatus2Code.PartiallySettled, com.tools20022.repository.codeset.TradeStatus2Code.MatchedValued, com.tools20022.repository.codeset.TradeStatus2Code.Rejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Validated.getCodeName().get(), Validated);
		codesByName.put(RegulatoryChecked.getCodeName().get(), RegulatoryChecked);
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(SettlementRejected.getCodeName().get(), SettlementRejected);
		codesByName.put(RegulatorySuspended.getCodeName().get(), RegulatorySuspended);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(PartiallySettled.getCodeName().get(), PartiallySettled);
		codesByName.put(MatchedValued.getCodeName().get(), MatchedValued);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
	}

	public static TradeStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeStatus2Code[] values() {
		TradeStatus2Code[] values = new TradeStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeStatus2Code> {
		@Override
		public TradeStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}