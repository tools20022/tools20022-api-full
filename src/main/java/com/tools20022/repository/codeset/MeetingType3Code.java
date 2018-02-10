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
import com.tools20022.repository.codeset.MeetingType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of security holders meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code#Extraordinary
 * MeetingType3Code.Extraordinary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingType3Code#General
 * MeetingType3Code.General}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingType3Code#Mixed
 * MeetingType3Code.Mixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingType3Code#Special
 * MeetingType3Code.Special}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code#BondHolderMeeting
 * MeetingType3Code.BondHolderMeeting}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeCode
 * MeetingTypeCode}</li>
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
 * "MeetingType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of security holders meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extraordinary"</li>
	 * </ul>
	 */
	public static final MeetingType3Code Extraordinary = new MeetingType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extraordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType3Code.mmObject();
			codeName = MeetingTypeCode.Extraordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "General"</li>
	 * </ul>
	 */
	public static final MeetingType3Code General = new MeetingType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "General";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType3Code.mmObject();
			codeName = MeetingTypeCode.General.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mixed"</li>
	 * </ul>
	 */
	public static final MeetingType3Code Mixed = new MeetingType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mixed";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType3Code.mmObject();
			codeName = MeetingTypeCode.Mixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * </ul>
	 */
	public static final MeetingType3Code Special = new MeetingType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType3Code.mmObject();
			codeName = MeetingTypeCode.Special.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondHolderMeeting"</li>
	 * </ul>
	 */
	public static final MeetingType3Code BondHolderMeeting = new MeetingType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondHolderMeeting";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType3Code.mmObject();
			codeName = MeetingTypeCode.BondHolderMeeting.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MeetingType3Code> codesByName = new LinkedHashMap<>();

	protected MeetingType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingType3Code";
				definition = "Specifies the type of security holders meeting.";
				trace_lazy = () -> MeetingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingType3Code.Extraordinary, com.tools20022.repository.codeset.MeetingType3Code.General, com.tools20022.repository.codeset.MeetingType3Code.Mixed,
						com.tools20022.repository.codeset.MeetingType3Code.Special, com.tools20022.repository.codeset.MeetingType3Code.BondHolderMeeting);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Extraordinary.getCodeName().get(), Extraordinary);
		codesByName.put(General.getCodeName().get(), General);
		codesByName.put(Mixed.getCodeName().get(), Mixed);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(BondHolderMeeting.getCodeName().get(), BondHolderMeeting);
	}

	public static MeetingType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingType3Code[] values() {
		MeetingType3Code[] values = new MeetingType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingType3Code> {
		@Override
		public MeetingType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}