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
import com.tools20022.repository.codeset.AssetClassSubProductType33Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the sub-product of type Construction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType33Code#Construction
 * AssetClassSubProductType33Code.Construction}</li>
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
 * "AssetClassSubProductType33Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the sub-product of type Construction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductType33Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductType33Code
	 * AssetClassSubProductType33Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Construction"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductType33Code Construction = new AssetClassSubProductType33Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Construction";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductType33Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Construction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductType33Code> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductType33Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassSubProductType33Code";
				definition = "Defines the sub-product of type Construction.";
				trace_lazy = () -> AssetClassSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductType33Code.Construction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Construction.getCodeName().get(), Construction);
	}

	public static AssetClassSubProductType33Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductType33Code[] values() {
		AssetClassSubProductType33Code[] values = new AssetClassSubProductType33Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductType33Code> {
		@Override
		public AssetClassSubProductType33Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductType33Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}