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
import com.tools20022.repository.codeset.ProcessingPosition3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code#After
 * ProcessingPosition3Code.After}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code#With
 * ProcessingPosition3Code.With}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code#Before
 * ProcessingPosition3Code.Before}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code#Information
 * ProcessingPosition3Code.Information}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProcessingPositionCode
 * ProcessingPositionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AFTE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProcessingPosition3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the processing position."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingPosition3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code
	 * ProcessingPosition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "After"</li>
	 * </ul>
	 */
	public static final ProcessingPosition3Code After = new ProcessingPosition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "After";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition3Code.mmObject();
			codeName = ProcessingPositionCode.After.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code
	 * ProcessingPosition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "With"</li>
	 * </ul>
	 */
	public static final ProcessingPosition3Code With = new ProcessingPosition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "With";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition3Code.mmObject();
			codeName = ProcessingPositionCode.With.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code
	 * ProcessingPosition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Before"</li>
	 * </ul>
	 */
	public static final ProcessingPosition3Code Before = new ProcessingPosition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Before";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition3Code.mmObject();
			codeName = ProcessingPositionCode.Before.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingPosition3Code
	 * ProcessingPosition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * </ul>
	 */
	public static final ProcessingPosition3Code Information = new ProcessingPosition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingPosition3Code.mmObject();
			codeName = ProcessingPositionCode.Information.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProcessingPosition3Code> codesByName = new LinkedHashMap<>();

	protected ProcessingPosition3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AFTE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingPosition3Code";
				definition = "Specifies the processing position.";
				trace_lazy = () -> ProcessingPositionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingPosition3Code.After, com.tools20022.repository.codeset.ProcessingPosition3Code.With,
						com.tools20022.repository.codeset.ProcessingPosition3Code.Before, com.tools20022.repository.codeset.ProcessingPosition3Code.Information);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(After.getCodeName().get(), After);
		codesByName.put(With.getCodeName().get(), With);
		codesByName.put(Before.getCodeName().get(), Before);
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static ProcessingPosition3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingPosition3Code[] values() {
		ProcessingPosition3Code[] values = new ProcessingPosition3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingPosition3Code> {
		@Override
		public ProcessingPosition3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingPosition3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}