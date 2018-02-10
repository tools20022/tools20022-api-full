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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Further sub product code list for commodity derivative Dry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType14Code#DryBulkCarrier
 * AssetClassDetailedSubProductType14Code.DryBulkCarrier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductTypeCode
 * AssetClassDetailedSubProductTypeCode}</li>
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
 * "AssetClassDetailedSubProductType14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Further sub product code list for commodity derivative Dry."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassDetailedSubProductType14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType14Code
	 * AssetClassDetailedSubProductType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DryBulkCarrier"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType14Code DryBulkCarrier = new AssetClassDetailedSubProductType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DryBulkCarrier";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType14Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.DryBulkCarrier.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassDetailedSubProductType14Code> codesByName = new LinkedHashMap<>();

	protected AssetClassDetailedSubProductType14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassDetailedSubProductType14Code";
				definition = "Further sub product code list for commodity derivative Dry.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassDetailedSubProductType14Code.DryBulkCarrier);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DryBulkCarrier.getCodeName().get(), DryBulkCarrier);
	}

	public static AssetClassDetailedSubProductType14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassDetailedSubProductType14Code[] values() {
		AssetClassDetailedSubProductType14Code[] values = new AssetClassDetailedSubProductType14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassDetailedSubProductType14Code> {
		@Override
		public AssetClassDetailedSubProductType14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassDetailedSubProductType14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}