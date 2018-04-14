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
import com.tools20022.repository.codeset.StatusSubType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the sub status of the trade notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#NoFlagsSet
 * StatusSubType1Code.NoFlagsSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#OnlyPendingFlagTrue
 * StatusSubType1Code.OnlyPendingFlagTrue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#OnlySameDayFlagTrue
 * StatusSubType1Code.OnlySameDayFlagTrue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#SameDayAndPendingFlagsTrue
 * StatusSubType1Code.SameDayAndPendingFlagsTrue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatusSubTypeCode
 * StatusSubTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusSubType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the sub status of the trade notification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NONE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.StatusSubType2Code
 * StatusSubType2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatusSubType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoFlagsSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StatusSubType1Code NoFlagsSet = new StatusSubType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoFlagsSet";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusSubType1Code.mmObject();
			codeName = StatusSubTypeCode.NoFlagsSet.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlyPendingFlagTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StatusSubType1Code OnlyPendingFlagTrue = new StatusSubType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlyPendingFlagTrue";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusSubType1Code.mmObject();
			codeName = StatusSubTypeCode.OnlyPendingFlagTrue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlySameDayFlagTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType2Code#OnlySameDayFlagTrue
	 * StatusSubType2Code.OnlySameDayFlagTrue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final StatusSubType1Code OnlySameDayFlagTrue = new StatusSubType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlySameDayFlagTrue";
			nextVersions_lazy = () -> Arrays.asList(StatusSubType2Code.OnlySameDayFlagTrue);
			owner_lazy = () -> com.tools20022.repository.codeset.StatusSubType1Code.mmObject();
			codeName = StatusSubTypeCode.OnlySameDayFlagTrue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
	 * StatusSubType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameDayAndPendingFlagsTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final StatusSubType1Code SameDayAndPendingFlagsTrue = new StatusSubType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameDayAndPendingFlagsTrue";
			owner_lazy = () -> com.tools20022.repository.codeset.StatusSubType1Code.mmObject();
			codeName = StatusSubTypeCode.SameDayAndPendingFlagsTrue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StatusSubType1Code> codesByName = new LinkedHashMap<>();

	protected StatusSubType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NONE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusSubType1Code";
				definition = "Indicates the sub status of the trade notification.";
				nextVersions_lazy = () -> Arrays.asList(StatusSubType2Code.mmObject());
				trace_lazy = () -> StatusSubTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusSubType1Code.NoFlagsSet, com.tools20022.repository.codeset.StatusSubType1Code.OnlyPendingFlagTrue,
						com.tools20022.repository.codeset.StatusSubType1Code.OnlySameDayFlagTrue, com.tools20022.repository.codeset.StatusSubType1Code.SameDayAndPendingFlagsTrue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoFlagsSet.getCodeName().get(), NoFlagsSet);
		codesByName.put(OnlyPendingFlagTrue.getCodeName().get(), OnlyPendingFlagTrue);
		codesByName.put(OnlySameDayFlagTrue.getCodeName().get(), OnlySameDayFlagTrue);
		codesByName.put(SameDayAndPendingFlagsTrue.getCodeName().get(), SameDayAndPendingFlagsTrue);
	}

	public static StatusSubType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatusSubType1Code[] values() {
		StatusSubType1Code[] values = new StatusSubType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatusSubType1Code> {
		@Override
		public StatusSubType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatusSubType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}