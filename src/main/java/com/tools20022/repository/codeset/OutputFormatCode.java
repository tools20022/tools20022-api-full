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
import com.tools20022.repository.codeset.OutputFormatCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Available message format to display or print.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode#SimpleText
 * OutputFormatCode.SimpleText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode#MessageReference
 * OutputFormatCode.MessageReference}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OutputFormatCode#XHTML
 * OutputFormatCode.XHTML}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode#ScreenReference
 * OutputFormatCode.ScreenReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OutputFormat1Code
 * OutputFormat1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OutputFormat2Code
 * OutputFormat2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OutputFormatCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Available message format to display or print."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OutputFormatCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Text without format attributes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode
	 * OutputFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEXT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SimpleText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Text without format attributes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OutputFormatCode SimpleText = new OutputFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SimpleText";
			definition = "Text without format attributes.";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormatCode.mmObject();
			codeName = "TEXT";
		}
	};
	/**
	 * Predefined configured messages, identified by a reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode
	 * OutputFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MREF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predefined configured messages, identified by a reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OutputFormatCode MessageReference = new OutputFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReference";
			definition = "Predefined configured messages, identified by a reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormatCode.mmObject();
			codeName = "MREF";
		}
	};
	/**
	 * XHTML document which includes a subset of the XHTML output tag.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode
	 * OutputFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HTML"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "XHTML"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "XHTML document which includes a subset of the XHTML output tag."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OutputFormatCode XHTML = new OutputFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "XHTML";
			definition = "XHTML document which includes a subset of the XHTML output tag.";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormatCode.mmObject();
			codeName = "HTML";
		}
	};
	/**
	 * Screen to display identified by a reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormatCode
	 * OutputFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SREF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScreenReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Screen to display identified by a reference."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OutputFormatCode ScreenReference = new OutputFormatCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScreenReference";
			definition = "Screen to display identified by a reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.OutputFormatCode.mmObject();
			codeName = "SREF";
		}
	};
	final static private LinkedHashMap<String, OutputFormatCode> codesByName = new LinkedHashMap<>();

	protected OutputFormatCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OutputFormatCode";
				definition = "Available message format to display or print.";
				derivation_lazy = () -> Arrays.asList(OutputFormat1Code.mmObject(), OutputFormat2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OutputFormatCode.SimpleText, com.tools20022.repository.codeset.OutputFormatCode.MessageReference, com.tools20022.repository.codeset.OutputFormatCode.XHTML,
						com.tools20022.repository.codeset.OutputFormatCode.ScreenReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SimpleText.getCodeName().get(), SimpleText);
		codesByName.put(MessageReference.getCodeName().get(), MessageReference);
		codesByName.put(XHTML.getCodeName().get(), XHTML);
		codesByName.put(ScreenReference.getCodeName().get(), ScreenReference);
	}

	public static OutputFormatCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OutputFormatCode[] values() {
		OutputFormatCode[] values = new OutputFormatCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OutputFormatCode> {
		@Override
		public OutputFormatCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OutputFormatCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}