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
import com.tools20022.repository.codeset.ExternalPendingProcessingReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for pending status.<br>
 * The list of valid codes is an external code list published separately.
 * External code sets can be downloaded from www.iso20022.org.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExternalPendingProcessingReasonCode
 * ExternalPendingProcessingReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExternalPendingProcessingReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for pending status.\r\nThe list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExternalPendingProcessingReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	final static private LinkedHashMap<String, ExternalPendingProcessingReason1Code> codesByName = new LinkedHashMap<>();

	protected ExternalPendingProcessingReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExternalPendingProcessingReason1Code";
				definition = "Specifies the reason for pending status.\r\nThe list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.";
				trace_lazy = () -> ExternalPendingProcessingReasonCode.mmObject();
				minLength = 1;
				maxLength = 4;
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static ExternalPendingProcessingReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExternalPendingProcessingReason1Code[] values() {
		ExternalPendingProcessingReason1Code[] values = new ExternalPendingProcessingReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExternalPendingProcessingReason1Code> {
		@Override
		public ExternalPendingProcessingReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExternalPendingProcessingReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}