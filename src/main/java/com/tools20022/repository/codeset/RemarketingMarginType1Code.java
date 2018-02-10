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
import com.tools20022.repository.codeset.RemarketingMarginType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginType1Code#Agreed
 * RemarketingMarginType1Code.Agreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginType1Code#Alternative
 * RemarketingMarginType1Code.Alternative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginTypeCode
 * RemarketingMarginTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AGRE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemarketingMarginType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of margin."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RemarketingMarginType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginType1Code
	 * RemarketingMarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreed"</li>
	 * </ul>
	 */
	public static final RemarketingMarginType1Code Agreed = new RemarketingMarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreed";
			owner_lazy = () -> com.tools20022.repository.codeset.RemarketingMarginType1Code.mmObject();
			codeName = RemarketingMarginTypeCode.Agreed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RemarketingMarginType1Code
	 * RemarketingMarginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Alternative"</li>
	 * </ul>
	 */
	public static final RemarketingMarginType1Code Alternative = new RemarketingMarginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Alternative";
			owner_lazy = () -> com.tools20022.repository.codeset.RemarketingMarginType1Code.mmObject();
			codeName = RemarketingMarginTypeCode.Alternative.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RemarketingMarginType1Code> codesByName = new LinkedHashMap<>();

	protected RemarketingMarginType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGRE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemarketingMarginType1Code";
				definition = "Specifies the type of margin.";
				trace_lazy = () -> RemarketingMarginTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RemarketingMarginType1Code.Agreed, com.tools20022.repository.codeset.RemarketingMarginType1Code.Alternative);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Agreed.getCodeName().get(), Agreed);
		codesByName.put(Alternative.getCodeName().get(), Alternative);
	}

	public static RemarketingMarginType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RemarketingMarginType1Code[] values() {
		RemarketingMarginType1Code[] values = new RemarketingMarginType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RemarketingMarginType1Code> {
		@Override
		public RemarketingMarginType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RemarketingMarginType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}