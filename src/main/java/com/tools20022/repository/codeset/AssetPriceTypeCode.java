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
import com.tools20022.repository.codeset.AssetPriceTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#ArgusMcCloskey
 * AssetPriceTypeCode.ArgusMcCloskey}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#Baltic
 * AssetPriceTypeCode.Baltic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#Exchange
 * AssetPriceTypeCode.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#GlobalCoal
 * AssetPriceTypeCode.GlobalCoal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#IHSMcCloskey
 * AssetPriceTypeCode.IHSMcCloskey}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#Platts
 * AssetPriceTypeCode.Platts}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode#Other
 * AssetPriceTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
 * AssetPriceType1Code}</li>
 * </ul>
 * </li>
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
 * "AssetPriceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price for an asset."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetPriceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Argus / Mc Closkey price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARGM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArgusMcCloskey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Argus / Mc Closkey price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode ArgusMcCloskey = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArgusMcCloskey";
			definition = "Argus / Mc Closkey price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "ARGM";
		}
	};
	/**
	 * Baltic price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baltic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Baltic price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode Baltic = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baltic";
			definition = "Baltic price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "BLTC";
		}
	};
	/**
	 * Exchange price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode Exchange = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			definition = "Exchange price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Global coal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalCoal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global coal price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode GlobalCoal = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalCoal";
			definition = "Global coal price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "GBCL";
		}
	};
	/**
	 * IHS Mc Closkey price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IHSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IHSMcCloskey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "IHS Mc Closkey price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode IHSMcCloskey = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IHSMcCloskey";
			definition = "IHS Mc Closkey price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "IHSM";
		}
	};
	/**
	 * Platts price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Platts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Platts price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode Platts = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Platts";
			definition = "Platts price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "PLAT";
		}
	};
	/**
	 * Other price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceTypeCode
	 * AssetPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other price."</li>
	 * </ul>
	 */
	public static final AssetPriceTypeCode Other = new AssetPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other price.";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetPriceTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, AssetPriceTypeCode> codesByName = new LinkedHashMap<>();

	protected AssetPriceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetPriceTypeCode";
				definition = "Specifies the type of price for an asset.";
				derivation_lazy = () -> Arrays.asList(AssetPriceType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetPriceTypeCode.ArgusMcCloskey, com.tools20022.repository.codeset.AssetPriceTypeCode.Baltic,
						com.tools20022.repository.codeset.AssetPriceTypeCode.Exchange, com.tools20022.repository.codeset.AssetPriceTypeCode.GlobalCoal, com.tools20022.repository.codeset.AssetPriceTypeCode.IHSMcCloskey,
						com.tools20022.repository.codeset.AssetPriceTypeCode.Platts, com.tools20022.repository.codeset.AssetPriceTypeCode.Other);
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
		codesByName.put(Platts.getCodeName().get(), Platts);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetPriceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetPriceTypeCode[] values() {
		AssetPriceTypeCode[] values = new AssetPriceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetPriceTypeCode> {
		@Override
		public AssetPriceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetPriceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}