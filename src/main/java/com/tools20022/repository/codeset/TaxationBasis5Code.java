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
import com.tools20022.repository.codeset.TaxationBasis5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the tax or charge basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis5Code#Flat
 * TaxationBasis5Code.Flat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code#GrossAmount
 * TaxationBasis5Code.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code#NetAmount
 * TaxationBasis5Code.NetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code#NetAssetValuePrice
 * TaxationBasis5Code.NetAssetValuePrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis5Code#PerUnit
 * TaxationBasis5Code.PerUnit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
 * TaxationBasisCode}</li>
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
 * "TaxationBasis5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the tax or charge basis."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxationBasis5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code
	 * TaxationBasis5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flat"</li>
	 * </ul>
	 */
	public static final TaxationBasis5Code Flat = new TaxationBasis5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Flat";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis5Code.mmObject();
			codeName = TaxationBasisCode.Flat.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code
	 * TaxationBasis5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * </ul>
	 */
	public static final TaxationBasis5Code GrossAmount = new TaxationBasis5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis5Code.mmObject();
			codeName = TaxationBasisCode.GrossAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code
	 * TaxationBasis5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * </ul>
	 */
	public static final TaxationBasis5Code NetAmount = new TaxationBasis5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis5Code.mmObject();
			codeName = TaxationBasisCode.NetAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code
	 * TaxationBasis5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValuePrice"</li>
	 * </ul>
	 */
	public static final TaxationBasis5Code NetAssetValuePrice = new TaxationBasis5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetValuePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis5Code.mmObject();
			codeName = TaxationBasisCode.NetAssetValuePrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis5Code
	 * TaxationBasis5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * </ul>
	 */
	public static final TaxationBasis5Code PerUnit = new TaxationBasis5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis5Code.mmObject();
			codeName = TaxationBasisCode.PerUnit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxationBasis5Code> codesByName = new LinkedHashMap<>();

	protected TaxationBasis5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxationBasis5Code";
				definition = "Specifies the tax or charge basis.";
				trace_lazy = () -> TaxationBasisCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxationBasis5Code.Flat, com.tools20022.repository.codeset.TaxationBasis5Code.GrossAmount, com.tools20022.repository.codeset.TaxationBasis5Code.NetAmount,
						com.tools20022.repository.codeset.TaxationBasis5Code.NetAssetValuePrice, com.tools20022.repository.codeset.TaxationBasis5Code.PerUnit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Flat.getCodeName().get(), Flat);
		codesByName.put(GrossAmount.getCodeName().get(), GrossAmount);
		codesByName.put(NetAmount.getCodeName().get(), NetAmount);
		codesByName.put(NetAssetValuePrice.getCodeName().get(), NetAssetValuePrice);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
	}

	public static TaxationBasis5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxationBasis5Code[] values() {
		TaxationBasis5Code[] values = new TaxationBasis5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxationBasis5Code> {
		@Override
		public TaxationBasis5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxationBasis5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}