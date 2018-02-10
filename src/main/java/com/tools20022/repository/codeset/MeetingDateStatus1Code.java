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
import com.tools20022.repository.codeset.MeetingDateStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the possible statuses of a meeting date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code#Tentative
 * MeetingDateStatus1Code.Tentative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code#Confirmed
 * MeetingDateStatus1Code.Confirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code#Cancelled
 * MeetingDateStatus1Code.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code#NoQuorum
 * MeetingDateStatus1Code.NoQuorum}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatusCode
 * MeetingDateStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TNTA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingDateStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the possible statuses of a meeting date."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingDateStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code
	 * MeetingDateStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tentative"</li>
	 * </ul>
	 */
	public static final MeetingDateStatus1Code Tentative = new MeetingDateStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tentative";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatus1Code.mmObject();
			codeName = MeetingDateStatusCode.Tentative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code
	 * MeetingDateStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmed"</li>
	 * </ul>
	 */
	public static final MeetingDateStatus1Code Confirmed = new MeetingDateStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatus1Code.mmObject();
			codeName = MeetingDateStatusCode.Confirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code
	 * MeetingDateStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final MeetingDateStatus1Code Cancelled = new MeetingDateStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatus1Code.mmObject();
			codeName = MeetingDateStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code
	 * MeetingDateStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoQuorum"</li>
	 * </ul>
	 */
	public static final MeetingDateStatus1Code NoQuorum = new MeetingDateStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoQuorum";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingDateStatus1Code.mmObject();
			codeName = MeetingDateStatusCode.NoQuorum.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MeetingDateStatus1Code> codesByName = new LinkedHashMap<>();

	protected MeetingDateStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TNTA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingDateStatus1Code";
				definition = "Identifies the possible statuses of a meeting date.";
				trace_lazy = () -> MeetingDateStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingDateStatus1Code.Tentative, com.tools20022.repository.codeset.MeetingDateStatus1Code.Confirmed,
						com.tools20022.repository.codeset.MeetingDateStatus1Code.Cancelled, com.tools20022.repository.codeset.MeetingDateStatus1Code.NoQuorum);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Tentative.getCodeName().get(), Tentative);
		codesByName.put(Confirmed.getCodeName().get(), Confirmed);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(NoQuorum.getCodeName().get(), NoQuorum);
	}

	public static MeetingDateStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingDateStatus1Code[] values() {
		MeetingDateStatus1Code[] values = new MeetingDateStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingDateStatus1Code> {
		@Override
		public MeetingDateStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingDateStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}