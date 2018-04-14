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
import com.tools20022.repository.codeset.SenderTriggerCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.SenderTriggerCode#DateTime
 * SenderTriggerCode.DateTime}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SenderTriggerCode#Forced
 * SenderTriggerCode.Forced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SenderTriggerCode#Manual
 * SenderTriggerCode.Manual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderTriggerCode#SufficientlySigned
 * SenderTriggerCode.SufficientlySigned}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SenderTrigger1Code
 * SenderTrigger1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SenderTriggerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the trigger code used by the sender to generate the file."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SenderTriggerCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * File generated based on a date/time event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTriggerCode
	 * SenderTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTTM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File generated based on a date/time event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SenderTriggerCode DateTime = new SenderTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "File generated based on a date/time event.";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTriggerCode.mmObject();
			codeName = "DTTM";
		}
	};
	/**
	 * File generated based on a forced event (file generation has been forced).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTriggerCode
	 * SenderTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRCD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File generated based on a forced event (file generation has been forced)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SenderTriggerCode Forced = new SenderTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forced";
			definition = "File generated based on a forced event (file generation has been forced).";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTriggerCode.mmObject();
			codeName = "FRCD";
		}
	};
	/**
	 * File generated based on a manual event (file has been<br>
	 * generated manually).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTriggerCode
	 * SenderTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MANL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File generated based on a manual event (file has been\r\ngenerated manually)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SenderTriggerCode Manual = new SenderTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manual";
			definition = "File generated based on a manual event (file has been\r\ngenerated manually).";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTriggerCode.mmObject();
			codeName = "MANL";
		}
	};
	/**
	 * File generated based on a signature event (file has the minimum required
	 * signature from the sender).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderTriggerCode
	 * SenderTriggerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFSG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SufficientlySigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "File generated based on a signature event (file has the minimum required signature from the sender)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SenderTriggerCode SufficientlySigned = new SenderTriggerCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SufficientlySigned";
			definition = "File generated based on a signature event (file has the minimum required signature from the sender).";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderTriggerCode.mmObject();
			codeName = "SFSG";
		}
	};
	final static private LinkedHashMap<String, SenderTriggerCode> codesByName = new LinkedHashMap<>();

	protected SenderTriggerCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SenderTriggerCode";
				definition = "Specifies the trigger code used by the sender to generate the file.";
				derivation_lazy = () -> Arrays.asList(SenderTrigger1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SenderTriggerCode.DateTime, com.tools20022.repository.codeset.SenderTriggerCode.Forced, com.tools20022.repository.codeset.SenderTriggerCode.Manual,
						com.tools20022.repository.codeset.SenderTriggerCode.SufficientlySigned);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DateTime.getCodeName().get(), DateTime);
		codesByName.put(Forced.getCodeName().get(), Forced);
		codesByName.put(Manual.getCodeName().get(), Manual);
		codesByName.put(SufficientlySigned.getCodeName().get(), SufficientlySigned);
	}

	public static SenderTriggerCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SenderTriggerCode[] values() {
		SenderTriggerCode[] values = new SenderTriggerCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SenderTriggerCode> {
		@Override
		public SenderTriggerCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SenderTriggerCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}