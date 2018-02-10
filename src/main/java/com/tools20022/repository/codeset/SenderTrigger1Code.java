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
import com.tools20022.repository.codeset.SenderTrigger1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the trigger code used by the sender to generate the file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderTrigger1Code#DateTime
 * SenderTrigger1Code.DateTime}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SenderTrigger1Code#Manual
 * SenderTrigger1Code.Manual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderTrigger1Code#SufficientlySigned
 * SenderTrigger1Code.SufficientlySigned}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SenderTrigger1Code#Forced
 * SenderTrigger1Code.Forced}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SenderTriggerCode
 * SenderTriggerCode}</li>
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
 * "SenderTrigger1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the trigger code used by the sender to generate the file."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SenderTrigger1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTrigger1Code
	 * SenderTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * </ul>
	 */
	public static final SenderTrigger1Code DateTime = new SenderTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTrigger1Code.mmObject();
			codeName = SenderTriggerCode.DateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTrigger1Code
	 * SenderTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * </ul>
	 */
	public static final SenderTrigger1Code Manual = new SenderTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTrigger1Code.mmObject();
			codeName = SenderTriggerCode.Manual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTrigger1Code
	 * SenderTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SufficientlySigned"</li>
	 * </ul>
	 */
	public static final SenderTrigger1Code SufficientlySigned = new SenderTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SufficientlySigned";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTrigger1Code.mmObject();
			codeName = SenderTriggerCode.SufficientlySigned.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTrigger1Code
	 * SenderTrigger1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forced"</li>
	 * </ul>
	 */
	public static final SenderTrigger1Code Forced = new SenderTrigger1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forced";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTrigger1Code.mmObject();
			codeName = SenderTriggerCode.Forced.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SenderTrigger1Code> codesByName = new LinkedHashMap<>();

	protected SenderTrigger1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SenderTrigger1Code";
				definition = "Specifies the trigger code used by the sender to generate the file.";
				trace_lazy = () -> SenderTriggerCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SenderTrigger1Code.DateTime, com.tools20022.repository.codeset.SenderTrigger1Code.Manual,
						com.tools20022.repository.codeset.SenderTrigger1Code.SufficientlySigned, com.tools20022.repository.codeset.SenderTrigger1Code.Forced);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DateTime.getCodeName().get(), DateTime);
		codesByName.put(Manual.getCodeName().get(), Manual);
		codesByName.put(SufficientlySigned.getCodeName().get(), SufficientlySigned);
		codesByName.put(Forced.getCodeName().get(), Forced);
	}

	public static SenderTrigger1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SenderTrigger1Code[] values() {
		SenderTrigger1Code[] values = new SenderTrigger1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SenderTrigger1Code> {
		@Override
		public SenderTrigger1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SenderTrigger1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}