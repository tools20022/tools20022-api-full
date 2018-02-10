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
import com.tools20022.repository.codeset.OutputFormat2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Information format.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code#MessageReference
 * OutputFormat2Code.MessageReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code#ScreenReference
 * OutputFormat2Code.ScreenReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code#SimpleText
 * OutputFormat2Code.SimpleText}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OutputFormat2Code#XHTML
 * OutputFormat2Code.XHTML}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode
 * OutputFormatCode}</li>
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
 * "OutputFormat2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information format."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OutputFormat2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code
	 * OutputFormat2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * </ul>
	 */
	public static final OutputFormat2Code MessageReference = new OutputFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormat2Code.mmObject();
			codeName = OutputFormatCode.MessageReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code
	 * OutputFormat2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScreenReference"</li>
	 * </ul>
	 */
	public static final OutputFormat2Code ScreenReference = new OutputFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScreenReference";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormat2Code.mmObject();
			codeName = OutputFormatCode.ScreenReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code
	 * OutputFormat2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SimpleText"</li>
	 * </ul>
	 */
	public static final OutputFormat2Code SimpleText = new OutputFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SimpleText";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormat2Code.mmObject();
			codeName = OutputFormatCode.SimpleText.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat2Code
	 * OutputFormat2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "XHTML"</li>
	 * </ul>
	 */
	public static final OutputFormat2Code XHTML = new OutputFormat2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "XHTML";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormat2Code.mmObject();
			codeName = OutputFormatCode.XHTML.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OutputFormat2Code> codesByName = new LinkedHashMap<>();

	protected OutputFormat2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OutputFormat2Code";
				definition = "Information format.";
				trace_lazy = () -> OutputFormatCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OutputFormat2Code.MessageReference, com.tools20022.repository.codeset.OutputFormat2Code.ScreenReference,
						com.tools20022.repository.codeset.OutputFormat2Code.SimpleText, com.tools20022.repository.codeset.OutputFormat2Code.XHTML);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MessageReference.getCodeName().get(), MessageReference);
		codesByName.put(ScreenReference.getCodeName().get(), ScreenReference);
		codesByName.put(SimpleText.getCodeName().get(), SimpleText);
		codesByName.put(XHTML.getCodeName().get(), XHTML);
	}

	public static OutputFormat2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OutputFormat2Code[] values() {
		OutputFormat2Code[] values = new OutputFormat2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OutputFormat2Code> {
		@Override
		public OutputFormat2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OutputFormat2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}