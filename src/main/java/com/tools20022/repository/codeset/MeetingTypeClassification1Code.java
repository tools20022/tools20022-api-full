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
import com.tools20022.repository.codeset.MeetingTypeClassification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Classifies the meeting type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code#Annual
 * MeetingTypeClassification1Code.Annual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code#Ordinary
 * MeetingTypeClassification1Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code#Class_
 * MeetingTypeClassification1Code.Class_}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code#IssuerInitiated
 * MeetingTypeClassification1Code.IssuerInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code#VotingRightsHolderInitiated
 * MeetingTypeClassification1Code.VotingRightsHolderInitiated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code#Court
 * MeetingTypeClassification1Code.Court}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassificationCode
 * MeetingTypeClassificationCode}</li>
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
 * "MeetingTypeClassification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Classifies the meeting type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MeetingTypeClassification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * </ul>
	 */
	public static final MeetingTypeClassification1Code Annual = new MeetingTypeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeClassification1Code.mmObject();
			codeName = MeetingTypeClassificationCode.Annual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final MeetingTypeClassification1Code Ordinary = new MeetingTypeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeClassification1Code.mmObject();
			codeName = MeetingTypeClassificationCode.Ordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Class"</li>
	 * </ul>
	 */
	public static final MeetingTypeClassification1Code Class_ = new MeetingTypeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Class";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeClassification1Code.mmObject();
			codeName = MeetingTypeClassificationCode.Class_.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInitiated"</li>
	 * </ul>
	 */
	public static final MeetingTypeClassification1Code IssuerInitiated = new MeetingTypeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeClassification1Code.mmObject();
			codeName = MeetingTypeClassificationCode.IssuerInitiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightsHolderInitiated"</li>
	 * </ul>
	 */
	public static final MeetingTypeClassification1Code VotingRightsHolderInitiated = new MeetingTypeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingRightsHolderInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeClassification1Code.mmObject();
			codeName = MeetingTypeClassificationCode.VotingRightsHolderInitiated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Court"</li>
	 * </ul>
	 */
	public static final MeetingTypeClassification1Code Court = new MeetingTypeClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Court";
			owner_lazy = () -> com.tools20022.repository.codeset.MeetingTypeClassification1Code.mmObject();
			codeName = MeetingTypeClassificationCode.Court.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MeetingTypeClassification1Code> codesByName = new LinkedHashMap<>();

	protected MeetingTypeClassification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AMET");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingTypeClassification1Code";
				definition = "Classifies the meeting type.";
				trace_lazy = () -> MeetingTypeClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingTypeClassification1Code.Annual, com.tools20022.repository.codeset.MeetingTypeClassification1Code.Ordinary,
						com.tools20022.repository.codeset.MeetingTypeClassification1Code.Class_, com.tools20022.repository.codeset.MeetingTypeClassification1Code.IssuerInitiated,
						com.tools20022.repository.codeset.MeetingTypeClassification1Code.VotingRightsHolderInitiated, com.tools20022.repository.codeset.MeetingTypeClassification1Code.Court);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Annual.getCodeName().get(), Annual);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Class_.getCodeName().get(), Class_);
		codesByName.put(IssuerInitiated.getCodeName().get(), IssuerInitiated);
		codesByName.put(VotingRightsHolderInitiated.getCodeName().get(), VotingRightsHolderInitiated);
		codesByName.put(Court.getCodeName().get(), Court);
	}

	public static MeetingTypeClassification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MeetingTypeClassification1Code[] values() {
		MeetingTypeClassification1Code[] values = new MeetingTypeClassification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MeetingTypeClassification1Code> {
		@Override
		public MeetingTypeClassification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MeetingTypeClassification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}