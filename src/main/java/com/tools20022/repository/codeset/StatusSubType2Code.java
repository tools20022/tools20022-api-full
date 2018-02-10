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
import com.tools20022.repository.codeset.StatusSubType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.StatusSubType2Code#OnlySameDayFlagTrue
 * StatusSubType2Code.OnlySameDayFlagTrue}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SMDY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusSubType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the sub status of the trade notification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code
 * StatusSubType1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatusSubType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType2Code
	 * StatusSubType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlySameDayFlagTrue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.StatusSubType1Code#OnlySameDayFlagTrue
	 * StatusSubType1Code.OnlySameDayFlagTrue}</li>
	 * </ul>
	 */
	public static final StatusSubType2Code OnlySameDayFlagTrue = new StatusSubType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlySameDayFlagTrue";
			previousVersion_lazy = () -> StatusSubType1Code.OnlySameDayFlagTrue;
			owner_lazy = () -> com.tools20022.repository.codeset.StatusSubType2Code.mmObject();
			codeName = StatusSubTypeCode.OnlySameDayFlagTrue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StatusSubType2Code> codesByName = new LinkedHashMap<>();

	protected StatusSubType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SMDY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusSubType2Code";
				definition = "Indicates the sub status of the trade notification.";
				previousVersion_lazy = () -> StatusSubType1Code.mmObject();
				trace_lazy = () -> StatusSubTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatusSubType2Code.OnlySameDayFlagTrue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnlySameDayFlagTrue.getCodeName().get(), OnlySameDayFlagTrue);
	}

	public static StatusSubType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatusSubType2Code[] values() {
		StatusSubType2Code[] values = new StatusSubType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatusSubType2Code> {
		@Override
		public StatusSubType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatusSubType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}