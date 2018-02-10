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
import com.tools20022.repository.codeset.NetDividendRateType5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of net dividend rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#CapitalPortion
 * NetDividendRateType5Code.CapitalPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#FullyFranked
 * NetDividendRateType5Code.FullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#IncomePortion
 * NetDividendRateType5Code.IncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#Interest
 * NetDividendRateType5Code.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#SundryOrOtherIncome
 * NetDividendRateType5Code.SundryOrOtherIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#TaxablePortion
 * NetDividendRateType5Code.TaxablePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#TaxDeferred
 * NetDividendRateType5Code.TaxDeferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#TaxFree
 * NetDividendRateType5Code.TaxFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#Unfranked
 * NetDividendRateType5Code.Unfranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#FullPeriodUnitsIncomePortion
 * NetDividendRateType5Code.FullPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#PartWayPeriodUnitsIncomePortion
 * NetDividendRateType5Code.PartWayPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#RealEstatePropertyIncomePortion
 * NetDividendRateType5Code.RealEstatePropertyIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code#ConduitForeignIncome
 * NetDividendRateType5Code.ConduitForeignIncome}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
 * DividendRateTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAPO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetDividendRateType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of net dividend rate."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NetDividendRateType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalPortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code CapitalPortion = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalPortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.CapitalPortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code FullyFranked = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.FullyFranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code IncomePortion = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.IncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code Interest = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.Interest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherIncome"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code SundryOrOtherIncome = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SundryOrOtherIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.SundryOrOtherIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxablePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code TaxablePortion = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxablePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.TaxablePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code TaxDeferred = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeferred";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.TaxDeferred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFree"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code TaxFree = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxFree";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.TaxFree.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code Unfranked = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unfranked";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.Unfranked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPeriodUnitsIncomePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code FullPeriodUnitsIncomePortion = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnitsIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.FullPeriodUnitsIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartWayPeriodUnitsIncomePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code PartWayPeriodUnitsIncomePortion = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnitsIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.PartWayPeriodUnitsIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstatePropertyIncomePortion"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code RealEstatePropertyIncomePortion = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstatePropertyIncomePortion";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.RealEstatePropertyIncomePortion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NetDividendRateType5Code
	 * NetDividendRateType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncome"</li>
	 * </ul>
	 */
	public static final NetDividendRateType5Code ConduitForeignIncome = new NetDividendRateType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConduitForeignIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.NetDividendRateType5Code.mmObject();
			codeName = DividendRateTypeCode.ConduitForeignIncome.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NetDividendRateType5Code> codesByName = new LinkedHashMap<>();

	protected NetDividendRateType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetDividendRateType5Code";
				definition = "Specifies the type of net dividend rate.";
				trace_lazy = () -> DividendRateTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NetDividendRateType5Code.CapitalPortion, com.tools20022.repository.codeset.NetDividendRateType5Code.FullyFranked,
						com.tools20022.repository.codeset.NetDividendRateType5Code.IncomePortion, com.tools20022.repository.codeset.NetDividendRateType5Code.Interest,
						com.tools20022.repository.codeset.NetDividendRateType5Code.SundryOrOtherIncome, com.tools20022.repository.codeset.NetDividendRateType5Code.TaxablePortion,
						com.tools20022.repository.codeset.NetDividendRateType5Code.TaxDeferred, com.tools20022.repository.codeset.NetDividendRateType5Code.TaxFree, com.tools20022.repository.codeset.NetDividendRateType5Code.Unfranked,
						com.tools20022.repository.codeset.NetDividendRateType5Code.FullPeriodUnitsIncomePortion, com.tools20022.repository.codeset.NetDividendRateType5Code.PartWayPeriodUnitsIncomePortion,
						com.tools20022.repository.codeset.NetDividendRateType5Code.RealEstatePropertyIncomePortion, com.tools20022.repository.codeset.NetDividendRateType5Code.ConduitForeignIncome);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CapitalPortion.getCodeName().get(), CapitalPortion);
		codesByName.put(FullyFranked.getCodeName().get(), FullyFranked);
		codesByName.put(IncomePortion.getCodeName().get(), IncomePortion);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(SundryOrOtherIncome.getCodeName().get(), SundryOrOtherIncome);
		codesByName.put(TaxablePortion.getCodeName().get(), TaxablePortion);
		codesByName.put(TaxDeferred.getCodeName().get(), TaxDeferred);
		codesByName.put(TaxFree.getCodeName().get(), TaxFree);
		codesByName.put(Unfranked.getCodeName().get(), Unfranked);
		codesByName.put(FullPeriodUnitsIncomePortion.getCodeName().get(), FullPeriodUnitsIncomePortion);
		codesByName.put(PartWayPeriodUnitsIncomePortion.getCodeName().get(), PartWayPeriodUnitsIncomePortion);
		codesByName.put(RealEstatePropertyIncomePortion.getCodeName().get(), RealEstatePropertyIncomePortion);
		codesByName.put(ConduitForeignIncome.getCodeName().get(), ConduitForeignIncome);
	}

	public static NetDividendRateType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NetDividendRateType5Code[] values() {
		NetDividendRateType5Code[] values = new NetDividendRateType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NetDividendRateType5Code> {
		@Override
		public NetDividendRateType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NetDividendRateType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}