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
import com.tools20022.repository.codeset.AssetPriceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of price for an asset.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#ArgusMcCloskey
 * AssetPriceType1Code.ArgusMcCloskey}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#Baltic
 * AssetPriceType1Code.Baltic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#Exchange
 * AssetPriceType1Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#GlobalCoal
 * AssetPriceType1Code.GlobalCoal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#IHSMcCloskey
 * AssetPriceType1Code.IHSMcCloskey}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#Other
 * AssetPriceType1Code.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceType1Code#Platts
 * AssetPriceType1Code.Platts}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
 * AssetPriceTypeCode}</li>
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
 * "AssetPriceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price for an asset."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetPriceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArgusMcCloskey"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code ArgusMcCloskey = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArgusMcCloskey";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.ArgusMcCloskey.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baltic"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code Baltic = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baltic";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.Baltic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code Exchange = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalCoal"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code GlobalCoal = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalCoal";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.GlobalCoal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IHSMcCloskey"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code IHSMcCloskey = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IHSMcCloskey";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.IHSMcCloskey.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code Other = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Platts"</li>
	 * </ul>
	 */
	public static final AssetPriceType1Code Platts = new AssetPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Platts";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceType1Code.mmObject();
			codeName = AssetPriceTypeCode.Platts.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetPriceType1Code> codesByName = new LinkedHashMap<>();

	protected AssetPriceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetPriceType1Code";
				definition = "Specifies the type of price for an asset.";
				trace_lazy = () -> AssetPriceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetPriceType1Code.ArgusMcCloskey, com.tools20022.repository.codeset.AssetPriceType1Code.Baltic,
						com.tools20022.repository.codeset.AssetPriceType1Code.Exchange, com.tools20022.repository.codeset.AssetPriceType1Code.GlobalCoal, com.tools20022.repository.codeset.AssetPriceType1Code.IHSMcCloskey,
						com.tools20022.repository.codeset.AssetPriceType1Code.Other, com.tools20022.repository.codeset.AssetPriceType1Code.Platts);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ArgusMcCloskey.getCodeName().get(), ArgusMcCloskey);
		codesByName.put(Baltic.getCodeName().get(), Baltic);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
		codesByName.put(GlobalCoal.getCodeName().get(), GlobalCoal);
		codesByName.put(IHSMcCloskey.getCodeName().get(), IHSMcCloskey);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Platts.getCodeName().get(), Platts);
	}

	public static AssetPriceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetPriceType1Code[] values() {
		AssetPriceType1Code[] values = new AssetPriceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetPriceType1Code> {
		@Override
		public AssetPriceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetPriceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}