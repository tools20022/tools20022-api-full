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
import com.tools20022.repository.codeset.AdditionalRight1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Define specific rights that the shareholder has (for example, the right to
 * ask questions, the right to add items to the agenda or table draft
 * resolutions).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalRight1Code#WrittenQuestionProposal
 * AdditionalRight1Code.WrittenQuestionProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalRight1Code#ResolutionProposal
 * AdditionalRight1Code.ResolutionProposal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AdditionalRight1Code#AgendaItemProposal
 * AdditionalRight1Code.AgendaItemProposal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AdditionalRightCode
 * AdditionalRightCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WQPS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalRight1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Define specific rights that the shareholder has (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AdditionalRight1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRight1Code
	 * AdditionalRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrittenQuestionProposal"</li>
	 * </ul>
	 */
	public static final AdditionalRight1Code WrittenQuestionProposal = new AdditionalRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrittenQuestionProposal";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalRight1Code.mmObject();
			codeName = AdditionalRightCode.WrittenQuestionProposal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRight1Code
	 * AdditionalRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposal"</li>
	 * </ul>
	 */
	public static final AdditionalRight1Code ResolutionProposal = new AdditionalRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposal";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalRight1Code.mmObject();
			codeName = AdditionalRightCode.ResolutionProposal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AdditionalRight1Code
	 * AdditionalRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgendaItemProposal"</li>
	 * </ul>
	 */
	public static final AdditionalRight1Code AgendaItemProposal = new AdditionalRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgendaItemProposal";
			owner_lazy = () -> com.tools20022.repository.codeset.AdditionalRight1Code.mmObject();
			codeName = AdditionalRightCode.AgendaItemProposal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AdditionalRight1Code> codesByName = new LinkedHashMap<>();

	protected AdditionalRight1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WQPS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalRight1Code";
				definition = "Define specific rights that the shareholder has (for example, the right to ask questions, the right to add items to the agenda or table draft resolutions).";
				trace_lazy = () -> AdditionalRightCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AdditionalRight1Code.WrittenQuestionProposal, com.tools20022.repository.codeset.AdditionalRight1Code.ResolutionProposal,
						com.tools20022.repository.codeset.AdditionalRight1Code.AgendaItemProposal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WrittenQuestionProposal.getCodeName().get(), WrittenQuestionProposal);
		codesByName.put(ResolutionProposal.getCodeName().get(), ResolutionProposal);
		codesByName.put(AgendaItemProposal.getCodeName().get(), AgendaItemProposal);
	}

	public static AdditionalRight1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AdditionalRight1Code[] values() {
		AdditionalRight1Code[] values = new AdditionalRight1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AdditionalRight1Code> {
		@Override
		public AdditionalRight1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AdditionalRight1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}