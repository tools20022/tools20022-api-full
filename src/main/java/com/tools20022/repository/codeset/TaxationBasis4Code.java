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
import com.tools20022.repository.codeset.TaxationBasis4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the tax basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis4Code#Flat
 * TaxationBasis4Code.Flat}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxationBasis4Code#PerUnit
 * TaxationBasis4Code.PerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code#GrossAmount
 * TaxationBasis4Code.GrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code#NetAmount
 * TaxationBasis4Code.NetAmount}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FLAT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxationBasis4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the tax basis."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxationBasis4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code
	 * TaxationBasis4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flat"</li>
	 * </ul>
	 */
	public static final TaxationBasis4Code Flat = new TaxationBasis4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Flat";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis4Code.mmObject();
			codeName = TaxationBasisCode.Flat.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code
	 * TaxationBasis4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * </ul>
	 */
	public static final TaxationBasis4Code PerUnit = new TaxationBasis4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis4Code.mmObject();
			codeName = TaxationBasisCode.PerUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code
	 * TaxationBasis4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * </ul>
	 */
	public static final TaxationBasis4Code GrossAmount = new TaxationBasis4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis4Code.mmObject();
			codeName = TaxationBasisCode.GrossAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasis4Code
	 * TaxationBasis4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * </ul>
	 */
	public static final TaxationBasis4Code NetAmount = new TaxationBasis4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxationBasis4Code.mmObject();
			codeName = TaxationBasisCode.NetAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxationBasis4Code> codesByName = new LinkedHashMap<>();

	protected TaxationBasis4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FLAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxationBasis4Code";
				definition = "Specifies the tax basis.";
				trace_lazy = () -> TaxationBasisCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxationBasis4Code.Flat, com.tools20022.repository.codeset.TaxationBasis4Code.PerUnit, com.tools20022.repository.codeset.TaxationBasis4Code.GrossAmount,
						com.tools20022.repository.codeset.TaxationBasis4Code.NetAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Flat.getCodeName().get(), Flat);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
		codesByName.put(GrossAmount.getCodeName().get(), GrossAmount);
		codesByName.put(NetAmount.getCodeName().get(), NetAmount);
	}

	public static TaxationBasis4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxationBasis4Code[] values() {
		TaxationBasis4Code[] values = new TaxationBasis4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxationBasis4Code> {
		@Override
		public TaxationBasis4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxationBasis4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}