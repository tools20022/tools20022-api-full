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
import com.tools20022.repository.codeset.MeetingType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code#AnnualGeneralMeeting
 * MeetingType1Code.AnnualGeneralMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingType1Code#Ordinary
 * MeetingType1Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code#Extraordinary
 * MeetingType1Code.Extraordinary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingType1Code#Mixed
 * MeetingType1Code.Mixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code#ClassMeeting
 * MeetingType1Code.ClassMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code#CourtMeeting
 * MeetingType1Code.CourtMeeting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MeetingType1Code#Special
 * MeetingType1Code.Special}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMET"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of security holders meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneralMeeting"</li>
	 * </ul>
	 */
	public static final MeetingType1Code AnnualGeneralMeeting = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnualGeneralMeeting";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.AnnualGeneralMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final MeetingType1Code Ordinary = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.Ordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extraordinary"</li>
	 * </ul>
	 */
	public static final MeetingType1Code Extraordinary = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extraordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.Extraordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mixed"</li>
	 * </ul>
	 */
	public static final MeetingType1Code Mixed = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mixed";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.Mixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassMeeting"</li>
	 * </ul>
	 */
	public static final MeetingType1Code ClassMeeting = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassMeeting";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.ClassMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtMeeting"</li>
	 * </ul>
	 */
	public static final MeetingType1Code CourtMeeting = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtMeeting";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.CourtMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * </ul>
	 */
	public static final MeetingType1Code Special = new MeetingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingType1Code.mmObject();
			codeName = MeetingTypeCode.Special.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MeetingType1Code> codesByName = new LinkedHashMap<>();

	protected MeetingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AMET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingType1Code";
				definition = "Specifies the type of security holders meeting.";
				trace_lazy = () -> MeetingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingType1Code.AnnualGeneralMeeting, com.tools20022.repository.codeset.MeetingType1Code.Ordinary,
						com.tools20022.repository.codeset.MeetingType1Code.Extraordinary, com.tools20022.repository.codeset.MeetingType1Code.Mixed, com.tools20022.repository.codeset.MeetingType1Code.ClassMeeting,
						com.tools20022.repository.codeset.MeetingType1Code.CourtMeeting, com.tools20022.repository.codeset.MeetingType1Code.Special);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AnnualGeneralMeeting.getCodeName().get(), AnnualGeneralMeeting);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Extraordinary.getCodeName().get(), Extraordinary);
		codesByName.put(Mixed.getCodeName().get(), Mixed);
		codesByName.put(ClassMeeting.getCodeName().get(), ClassMeeting);
		codesByName.put(CourtMeeting.getCodeName().get(), CourtMeeting);
		codesByName.put(Special.getCodeName().get(), Special);
	}

	public static MeetingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingType1Code[] values() {
		MeetingType1Code[] values = new MeetingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingType1Code> {
		@Override
		public MeetingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}