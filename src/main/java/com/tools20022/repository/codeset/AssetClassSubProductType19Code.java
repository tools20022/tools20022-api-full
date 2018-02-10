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
import com.tools20022.repository.codeset.AssetClassSubProductType19Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the sub-product of type Other C10.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType19Code#Deliverable
 * AssetClassSubProductType19Code.Deliverable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType19Code#NonDeliverable
 * AssetClassSubProductType19Code.NonDeliverable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
 * AssetClassSubProductTypeCode}</li>
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
 * "AssetClassSubProductType19Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the sub-product of type Other C10."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductType19Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType19Code
	 * AssetClassSubProductType19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deliverable"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductType19Code Deliverable = new AssetClassSubProductType19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deliverable";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductType19Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Deliverable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType19Code
	 * AssetClassSubProductType19Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonDeliverable"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductType19Code NonDeliverable = new AssetClassSubProductType19Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonDeliverable";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductType19Code.mmObject();
			codeName = AssetClassSubProductTypeCode.NonDeliverable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductType19Code> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductType19Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassSubProductType19Code";
				definition = "Defines the sub-product of type Other C10.";
				trace_lazy = () -> AssetClassSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductType19Code.Deliverable, com.tools20022.repository.codeset.AssetClassSubProductType19Code.NonDeliverable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Deliverable.getCodeName().get(), Deliverable);
		codesByName.put(NonDeliverable.getCodeName().get(), NonDeliverable);
	}

	public static AssetClassSubProductType19Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductType19Code[] values() {
		AssetClassSubProductType19Code[] values = new AssetClassSubProductType19Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductType19Code> {
		@Override
		public AssetClassSubProductType19Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductType19Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}